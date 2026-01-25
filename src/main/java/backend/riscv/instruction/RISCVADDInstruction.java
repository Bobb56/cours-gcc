package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVADDInstruction extends RISCVInstruction {
    public RISCVADDInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.ADD, List.of(rs1, rs2));
        addResult();
    }
}
