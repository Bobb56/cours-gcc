package ir.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import ir.terminator.IRTerminator;

public class IRBlock implements IRVisitableObject<Object> {

    private final List<IROperation> operations; /*
     * !< List of operations inside the block. Last one should be a IRTerminator
     */
    private final List<IRBlock> predecessors; /*
     * !< List of predecessors in the control flow graph. Built automatically when
     * calling addTerminator() on a block
     */

    private final HashMap<IRPhiOperation, String> pendingPhis;
    
    public IRFunction containingFunction;

    public IRBlock(IRFunction f) {
        operations = new ArrayList<>();
        predecessors = new ArrayList<>();
        pendingPhis = new HashMap<IRPhiOperation, String>();
        containingFunction = f;
    }

    public HashMap<IRPhiOperation, String> getPendingPhis() {
        return pendingPhis;
    }
    
    public void deleteContainingFunction() {
    	this.containingFunction = null;
    }

    public IRTerminator getTerminator() {
        assert (operations.get(operations.size() - 1) instanceof IRTerminator);
        return (IRTerminator) operations.get(operations.size() - 1);
    }

    public void addTerminator(IRTerminator t) {
        // We add predecessor to each successor
        for (IRBlock successor : t.getSuccessors())
            successor.predecessors.add(this);
        // We insert the terminator operation
        addOperation(t);
    }
    
    public void removeTerminator() {
    	IROperation t = this.operations.getLast();
    	if (t instanceof IRTerminator)
            for (IRBlock successor: ((IRTerminator)t).getSuccessors())
                successor.predecessors.remove(this);
    	this.operations.removeLast();
    }

    public void addOperation(IROperation op) {
        op.setContainingBlock(this);
        this.operations.add(op);
    }

    // Add an operation at the beginning of a block
    public void insertOperation(IROperation op) {
        op.setContainingBlock(this);
        this.operations.addFirst(op);
    }

    public void addPhi(IRPhiOperation op) {
        op.setContainingBlock(this);
        this.operations.addFirst(op);
    }
    
    public void removeOperation(IROperation op) {
    	op.setContainingBlock(null);
    	this.operations.remove(op);
    }

    public List<IRBlock> getSuccessors() {
        return getTerminator().getSuccessors();
    }

    public List<IRBlock> getPredecessors() {
        return predecessors;
    }

    public List<IROperation> getOperations() {
        return operations;
    }

    public List<IRPhiOperation> getPhiOperations() {
        ArrayList<IRPhiOperation> phis = new ArrayList<IRPhiOperation>();
        for(IROperation op: this.operations){
            if(op instanceof IRPhiOperation) {
                phis.add((IRPhiOperation) op);
            }
        }
        return phis;
    }

    public void addPendingPhi(IRPhiOperation phi, String varname) {
        pendingPhis.put(phi, varname);
    }
    
    public int getBlockIndexInContainingFunc() {
    	return this.containingFunction.getBlocks().indexOf(this);
    }
    
    @Override
    public Object accept(IRVisitor<?> v) {
        return v.visitBlock(this);
    }

}
