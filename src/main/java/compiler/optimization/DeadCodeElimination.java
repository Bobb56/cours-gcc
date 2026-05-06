package compiler.optimization;

import ir.core.IROperation;
import ir.core.IRTopLevel;
import ir.core.IRValue;

public class DeadCodeElimination extends SSAOptimizations{
    public DeadCodeElimination(IRTopLevel topLevel) {
        super(topLevel);
    }

    @Override
    protected void optimize(IROperation op) {
        if (op.getResult()!=null && op.getResult().getUses().isEmpty()) {
            op.getContainingBlock().removeOperation(op);
            for(IRValue value : op.getOperands()) {
                value.removeUse(op);
                IROperation nextOp = value.getDefiningOperation();
                worklist.add(nextOp);
            }
        }
    }
}
