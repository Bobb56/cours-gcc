package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVXORIInstruction extends RISCVInstruction {
    public RISCVXORIInstruction(RISCVRegisterOperand rs1, RISCVImmediateOperand imm) {
        super(RISCVOpcode.XORI, List.of(rs1, imm));
        addResult();
    }
}
