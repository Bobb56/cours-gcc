package ir.instruction;

import java.util.List;

import ir.core.IRFunction;
import ir.core.IRType;
import ir.core.IRValue;
import ir.core.IRVisitor;

public class IRFunctionCallInstruction extends IRInstruction {
	
	public IRFunction targetFunction;
	
    public IRFunctionCallInstruction(IRFunction func, IRType returnType, List<IRValue> operands) {
        super();
        targetFunction = func;
        for (IRValue operand : operands) {
            this.addOperand(operand);
        }
        this.addResult(returnType);
    }

    @Override
    public Object accept(IRVisitor<?> v) {
        return v.visitFunctionCall(this);
    }
}
