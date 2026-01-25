package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSLTIUInstruction extends RISCVInstruction {
    public RISCVSLTIUInstruction(RISCVRegisterOperand rs1, RISCVImmediateOperand imm) {
        super(RISCVOpcode.SLTIU, List.of(rs1, imm));
        addResult();
    }
}
