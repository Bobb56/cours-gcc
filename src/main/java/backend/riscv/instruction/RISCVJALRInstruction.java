package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVJALRInstruction extends RISCVInstruction {

    public RISCVJALRInstruction(RISCVRegisterOperand rs1, boolean isGoto) {
        super(RISCVOpcode.JALR, List.of(rs1));
        
        if (isGoto)
        	addResult();
    }

}
