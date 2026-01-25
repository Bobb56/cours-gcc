package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSLLInstruction extends RISCVInstruction {
    public RISCVSLLInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.SLL, List.of(rs1, rs2));
        addResult();
    }
}
