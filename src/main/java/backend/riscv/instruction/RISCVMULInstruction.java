package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVMULInstruction extends RISCVInstruction {
    public RISCVMULInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.MUL, List.of(rs1, rs2));
        addResult();
    }
}
