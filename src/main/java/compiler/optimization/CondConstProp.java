package compiler.optimization;

import ir.core.*;
import ir.terminator.IRCondBr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class CondConstProp {
    protected Set<IRBlock> blocks;
    protected HashMap<IRValue, AssignationState<Object>> values;
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

    protected void updateState(IROperation op) {
        IRValue val = op.getResult();
        if (values.containsKey(val)) {

        }
        else {
            // Check if the IRValue is constant
            boolean isConstant = true;
            for (IRValue operand: op.getOperands()) {
                if (values.containsKey(operand) && values.get(operand).isVariable()) {
                    isConstant = false;
                }
            }


            values.put(val, )
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
                updateState(op)

            }

            if (op instanceof IRCondBr) {

            }
        }
    }


    protected void optimize_value(IRValue v) {

    }

}
