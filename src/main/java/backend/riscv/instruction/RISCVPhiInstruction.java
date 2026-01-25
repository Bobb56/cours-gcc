package backend.riscv.instruction;

import java.util.List;

import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVPhiInstruction extends RISCVInstruction {
    public RISCVPhiInstruction(List<RISCVRegisterOperand> operands) {
        super(null, operands);
        addResult();
    }
    
    public String toString() {
    	return this.getResult() + " = phi " + this.getOperands().toString();
    }
    
}
