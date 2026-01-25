package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSRAIInstruction extends RISCVInstruction {
    public RISCVSRAIInstruction(RISCVRegisterOperand rs1, RISCVImmediateOperand imm) {
        super(RISCVOpcode.SRAI, List.of(rs1, imm));
        addResult();
    }
}
