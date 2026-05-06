package compiler.optimization;

import ir.core.IROperation;
import ir.core.IRTopLevel;
import ir.core.IRValue;

public class DeadCodeElimination extends SSAOptimizations{
    public DeadCodeElimination(IRTopLevel topLevel) {
        super(topLevel);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void optimize(IROperation op) {
        if (op.getResult()!=null && op.getResult().getUses().isEmpty()) {
            op.getContainingBlock().removeOperation(op);
            for(IRValue value : op.getOperands()) {
                value.removeUse(op);
                IROperation nextOp = value.getDefiningOperation();
                if (nextOp != null) {
                    worklist.add(nextOp);
                }
            }
        }
    }
}
