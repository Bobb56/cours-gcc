package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVANDInstruction extends RISCVInstruction {
    public RISCVANDInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.AND, List.of(rs1, rs2));
        addResult();
    }
}
