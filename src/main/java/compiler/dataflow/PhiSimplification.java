package compiler.dataflow;

import ir.core.*;

import java.util.ArrayList;
import java.util.Set;

public class PhiSimplification extends DataflowAnalysis<Integer> {
    public PhiSimplification(IRFunction f) {
        super(f);
        VERBOSE = false;
    }

    @Override
    Set<Integer> gen(IRBlock b) {
        return Set.of();
    }

    @Override
    Set<Integer> kill(IRBlock b) {
        return Set.of();
    }

    @Override
    void propagate(IRBlock block) {
        // Storing temporarily operations that will be removed
        ArrayList<IROperation> toRemove = new ArrayList<IROperation>();

        // Going through all IRPhiOperations
        for(IROperation operation : block.getOperations()) {
            if(operation instanceof IRPhiOperation){
                // Check if all operands are the same
                IRValue firstOperand = operation.getOperands().getFirst();
                boolean toSimplify = true;

                // Going through all operands of the current IRPhiOperation
                for(IRValue operand : operation.getOperands()) {
                    if(operand != firstOperand){
                        toSimplify = false;
                        break;
                    }
                }

                if (toSimplify) {
                    // Adding all blocks where the value is used in the worklist
                    for (IROperation use : operation.getResult().getUses()) {
                        if (!worklist.contains(use.getContainingBlock())) {
                            worklist.add(use.getContainingBlock());
                        }
                    }

                    operation.getResult().replaceBy(firstOperand);
                    toRemove.add(operation);
                }
            }
        }
        // Removing all simplified phis
        for(IROperation op : toRemove){
            for (IRValue operand : op.getOperands()) {
                operand.removeUse(op);
            }
            block.removeOperation(op);
        }
    }
}
