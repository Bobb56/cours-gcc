package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVADDIInstruction extends RISCVInstruction {
    public RISCVADDIInstruction(RISCVRegisterOperand rs1, RISCVImmediateOperand imm) {
        super(RISCVOpcode.ADDI, List.of(rs1, imm));
        addResult();
    }
}
