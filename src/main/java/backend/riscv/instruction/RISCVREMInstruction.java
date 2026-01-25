package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVREMInstruction extends RISCVInstruction {
    public RISCVREMInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.REM, List.of(rs1, rs2));
        addResult();
    }
}
