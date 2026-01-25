package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSLLIInstruction extends RISCVInstruction {
    public RISCVSLLIInstruction(RISCVRegisterOperand rs1, RISCVImmediateOperand imm) {
        super(RISCVOpcode.SLLI, List.of(rs1, imm));
        addResult();
    }
}
