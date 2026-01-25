package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSRLIInstruction extends RISCVInstruction {
    public RISCVSRLIInstruction(RISCVRegisterOperand rs1, RISCVImmediateOperand imm) {
        super(RISCVOpcode.SRLI, List.of(rs1, imm));
        addResult();
    }
}
