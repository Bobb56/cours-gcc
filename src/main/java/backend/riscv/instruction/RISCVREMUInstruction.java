package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVREMUInstruction extends RISCVInstruction {
    public RISCVREMUInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.REMU, List.of(rs1, rs2));
        addResult();
    }
}
