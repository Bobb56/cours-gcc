package compiler.optimization;

import ir.core.IRBlock;
import ir.core.IRFunction;
import ir.core.IROperation;
import ir.core.IRTopLevel;

import java.util.ArrayList;

public abstract class SSAOptimizations<T> {
    protected ArrayList<IROperation> worklist;

    public SSAOptimizations(IRTopLevel topLevel) {
        worklist = new ArrayList<IROperation>();

        for(IRFunction f: topLevel.getFunctions()) {
            for(IRBlock b: f.getBlocks()) {
                worklist.addAll(b.getOperations());
            }
        }
    }

    public void runOptimization() {
        while(!this.worklist.isEmpty()) {
            IROperation op = worklist.removeFirst();
            optimize(op);
        }
    }

    protected abstract void optimize(IROperation op);
}
