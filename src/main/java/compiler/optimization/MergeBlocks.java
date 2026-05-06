package compiler.optimization;

import ir.core.IRBlock;
import ir.core.IRFunction;
import ir.core.IROperation;
import ir.core.IRTopLevel;
import ir.terminator.IRTerminator;

import java.util.ArrayList;

public class MergeBlocks {
    protected IRTopLevel topLevel;

    public MergeBlocks(IRTopLevel topLevel) {
        this.topLevel = topLevel;
    }

    public void runOptimization() {
        mergeBlocks();
    }

    protected void mergeBlocks() {
        for (IRFunction f : topLevel.getFunctions()) {
            ArrayList<IRBlock> toRemove = new ArrayList<IRBlock>();

            for (IRBlock b : f.getBlocks()) {
                // Ignore blocks that are malformed
                if (b.getOperations().isEmpty() || !(b.getOperations().getLast() instanceof IRTerminator)) {
                    continue;
                }

                // Check if the block has only one predecessor and this predecessor only has one successor
                if(b.getPredecessors().size() == 1) {
                    IRBlock pred = b.getPredecessors().getFirst();
                    if (pred.getOperations().isEmpty() || !(pred.getOperations().getLast() instanceof IRTerminator)) {
                        continue;
                    }

                    if(pred.getSuccessors().size() == 1) {
                        assert(pred.getSuccessors().getFirst() == b);
                        // Remove Goto block to remove
                        pred.removeTerminator();
                        // Move all operations from the current block to the predecessor and remove goto
                        for (IROperation operation : new ArrayList<>(b.getOperations())) {
                            b.removeOperation(operation);
                            pred.addOperation(operation);
                        }
                        toRemove.add(b);
                    }
                }
            }
            f.deleteBlockList(toRemove);
        }
    }

}
