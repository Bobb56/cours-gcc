package compiler.optimization;

import com.ibm.icu.impl.CollectionSet;
import ir.core.*;
import ir.instruction.*;
import ir.terminator.IRCondBr;

import java.util.*;


public class CondConstProp {
    protected HashSet<IRBlock> blocks;
    protected HashMap<IRValue, AssignationState<Number>> values;
    protected ArrayList<IRValue> worklist_values;
    protected ArrayList<IRBlock> worklist_blocks;

    static protected class AssignationState<T> {
        State state;
        T value;
        enum State {
            CONSTANT, VARIABLE;
        };

        public AssignationState(T constValue) {
            state = State.CONSTANT;
            value = constValue;
        }

        public AssignationState() {
            state = State.VARIABLE;
        }

        public void setVariable() {
            state = State.VARIABLE;
        }

        public boolean isVariable() {
            return state == State.VARIABLE;
        }

        public boolean isConstant() {
            return state == State.CONSTANT;
        }

        public T getValue() {
            assert state == State.CONSTANT;
            return value;
        }

        public String toString() {
            if(this.isConstant()) {
                return this.getValue().toString();
            }
            else {
                return "T";
            }
        }
    }

    public CondConstProp(IRTopLevel topLevel) {
        worklist_values = new ArrayList<IRValue>();
        worklist_blocks = new ArrayList<IRBlock>();

        blocks = new HashSet<IRBlock>();
        values = new HashMap<IRValue, AssignationState<Number>>();

        for(IRFunction f: topLevel.getFunctions()) {
            if (!f.getBlocks().isEmpty()) {
                worklist_blocks.add(f.getBlocks().getFirst());
                blocks.add(f.getBlocks().getFirst());
            }
            for (IRValue arg : f.getArgs()) {
                values.put(arg, new AssignationState<Number>());
            }
        }
    }

    public void runOptimization() {
        while(!this.worklist_values.isEmpty() || !this.worklist_blocks.isEmpty()) {
            printStates();
            while (!this.worklist_blocks.isEmpty()) {
                IRBlock b = this.worklist_blocks.removeFirst();
                optimizeBlock(b);
            }
            while (!this.worklist_values.isEmpty()) {
                IRValue v = worklist_values.removeFirst();
                optimizeValue(v);
            }
        }
        printStates();
    }

    protected void printStates() {
        System.out.println("---------- STATE -------------");
        System.out.println("##### BLOCKS :");
        for (IRBlock b: blocks) {
            System.out.println("Block " + b.getBlockIndexInContainingFunc());
        }

        System.out.println("##### VALUES :");
        for (HashMap.Entry<IRValue, AssignationState<Number>> entry : values.entrySet()) {
            IRValue key = entry.getKey();
            AssignationState<Number> val = entry.getValue();
            System.out.println(key + " : " + val);
        }
        System.out.println("---------- END STATE -------------");
    }

    // This function returns the value resulting of the operation assuming it is constant
    protected AssignationState<Number> computeConstValue(IROperation operation) {
        // Process phi operations
        if(operation instanceof IRPhiOperation) {
            Number refResult = null;
            for(IRValue op: operation.getOperands()) {
                Number currResult = values.get(op).getValue();
                // If currResult is null, it's bottom
                if(currResult != null) {
                    if(refResult == null) {
                        refResult = currResult;
                    }
                    else if (!currResult.equals(refResult) && isExec(op)) {
                        return new AssignationState<>();
                    }
                    // else: nothing to do
                }
            }
            assert (refResult != null);
            return new AssignationState<Number>(refResult);
        }

        System.out.println("OPERATION : " + operation);
        printStates();
        // Process integer operations
        int a = (Integer)values.get(operation.getOperands().getFirst()).getValue();
        int b = (Integer)values.get(operation.getOperands().getLast()).getValue();

        return switch (operation) {
            case IRAddInstruction irAddInstruction -> new AssignationState<Number>(a + b);
            case IRSubInstruction irSubInstruction -> new AssignationState<Number>(a - b);
            case IRMulInstruction irMulInstruction -> new AssignationState<Number>(a * b);
            case IRDivInstruction irDivInstruction -> new AssignationState<Number>(a / b);
            case IRCompareLtInstruction irCompareLtInstruction -> new AssignationState<Number>((a < b) ? 1 : 0);
            case IRCompareGtInstruction irCompareGtInstruction -> new AssignationState<Number>((a > b) ? 1 : 0);
            default -> {
                System.out.println(operation) ; throw new IllegalArgumentException();
            }
        };
    }


    protected boolean isExec(IRValue op) {
        return op.getDefiningOperation() == null || blocks.contains(op.getDefiningOperation().getContainingBlock());
    }

    protected void updateState(IROperation op) {
        IRValue val = op.getResult();

        AssignationState<Number> assignState;

        // Call and Load instructions
        if (op.getOperands().isEmpty() && !(op instanceof IRConstantInstruction)) {
            return;
        }
        else if(op instanceof IRFunctionCallInstruction || op instanceof IRLoadInstruction)
            // No isExec because it's in the worklist only if the block is executable
            assignState = new AssignationState<>();

        // Other instructions
        else {
            // Check if the IRValue is constant
            if (op instanceof IRConstantInstruction) {
                System.out.println("Traitement inst const");
                assignState = new AssignationState<>(((IRConstantInstruction<?>) op).getValue());
            } else {
                boolean isConstant = true;
                for (IRValue operand : op.getOperands()) {
                    if (isExec(operand) && values.containsKey(operand) && values.get(operand).isVariable()) {
                        isConstant = false;
                        break;
                    }
                }

                if (isConstant) {
                    assignState = computeConstValue(op);
                } else {
                    assignState = new AssignationState<>();
                }
            }
        }

        // If the value is in the hashmap, updating the state, if not, inserting a new state
        if (values.containsKey(val)) {
            AssignationState<Number> old_state = values.get(val);
            if (assignState.isVariable() || (old_state.isConstant() && !Objects.equals(assignState.getValue(), old_state.getValue()))) {
                old_state.setVariable();
            }
        }
        else {
            values.put(val, assignState);
        }
    }

    protected void setExecBlock(IRBlock b){
        worklist_blocks.add(b);
        blocks.add(b);
    }

    protected void optimizeBlock(IRBlock b) {
        // Adding chain of unique successors
        IRBlock pred = b;
        while (!pred.getOperations().isEmpty() && pred.getSuccessors().size() == 1) {
            pred = pred.getSuccessors().getFirst();
            setExecBlock(pred);
        }

        for (IROperation op: b.getOperations()) {
            IRValue val = op.getResult();
            if (val != null && !worklist_values.contains(val)) {
                worklist_values.add(val);
                updateState(op);
            }

            if (op instanceof IRCondBr) {
                AssignationState<Number> currState = values.get(op.getOperands().getFirst());
                if(currState != null && currState.isConstant()) {
                    if(currState.getValue().intValue() != 0) {
                        setExecBlock(((IRCondBr) op).getSuccessors().getFirst());
                    }
                    else {
                        setExecBlock(((IRCondBr) op).getSuccessors().getLast());
                    }
                }
                else {
                    setExecBlock(((IRCondBr) op).getSuccessors().getFirst());
                    setExecBlock(((IRCondBr) op).getSuccessors().getLast());
                }
            }
        }
    }


    protected void optimizeValue(IRValue v) {
        updateState(v.getDefiningOperation());
    }

}
