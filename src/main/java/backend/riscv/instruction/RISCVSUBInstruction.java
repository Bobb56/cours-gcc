package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSUBInstruction extends RISCVInstruction {
    public RISCVSUBInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.SUB, List.of(rs1, rs2));
        addResult();
    }
}
