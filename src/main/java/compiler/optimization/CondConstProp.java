package compiler.optimization;

import ir.core.*;
import ir.instruction.*;
import ir.terminator.IRCondBr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;


public class CondConstProp {
    protected Set<IRBlock> blocks;
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
            assert state == State.CONSTANT;
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
    }

    public CondConstProp(IRTopLevel topLevel) {
        worklist_values = new ArrayList<IRValue>();
        worklist_blocks = new ArrayList<IRBlock>();

        for(IRFunction f: topLevel.getFunctions()) {
            worklist_blocks.add(f.getBlocks().getFirst());
            blocks.add(f.getBlocks().getFirst());
        }
    }

    public void runOptimization() {
        while(!this.worklist_values.isEmpty() && !this.worklist_blocks.isEmpty()) {
            while (!this.worklist_blocks.isEmpty()) {
                IRBlock b = this.worklist_blocks.removeFirst();
                optimize_block(b);
            }
            while (!this.worklist_values.isEmpty()) {
                IRValue v = worklist_values.removeFirst();
                optimize_value(v);
            }
        }
    }

    // This function returns the value resulting of the operation assuming it is constant
    protected int computeConstValue(IROperation operation) {
        int a = (Integer)values.get(operation.getOperands().getFirst()).getValue();
        int b = (Integer)values.get(operation.getOperands().getLast()).getValue();

        return switch (operation) {
            case IRAddInstruction irAddInstruction -> a + b;
            case IRSubInstruction irSubInstruction -> a - b;
            case IRMulInstruction irMulInstruction -> a * b;
            case IRDivInstruction irDivInstruction -> a / b;
            default -> throw new IllegalArgumentException();
        };

    }

    protected void updateState(IROperation op) {
        IRValue val = op.getResult();

        AssignationState<Number> assignState;

        // Check if the IRValue is constant
        if (op instanceof IRConstantInstruction) {
            assignState = new AssignationState<>(((IRConstantInstruction<?>) op).getValue());
        }
        else {
            boolean isConstant = true;
            for (IRValue operand : op.getOperands()) {
                if (values.containsKey(operand) && values.get(operand).isVariable()) {
                    isConstant = false;
                    break;
                }
            }

            if (isConstant) {
                assignState = new AssignationState<>(computeConstValue(op));
            } else {
                assignState = new AssignationState<>();
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

    protected void optimize_block(IRBlock b) {
        // Adding chain of unique successors
        IRBlock pred = b;
        while (pred.getSuccessors().size() == 1) {
            pred = pred.getPredecessors().getFirst();
            // Marking the block as executable
            blocks.add(pred);
            // Adding block to worklist
            worklist_blocks.add(pred);
        }

        for (IROperation op: b.getOperations()) {
            IRValue val = op.getResult();
            if (!worklist_values.contains(val)) {
                worklist_values.add(val);
                updateState(op);

            }

            if (op instanceof IRCondBr) {

            }
        }
    }


    protected void optimize_value(IRValue v) {

    }

}
