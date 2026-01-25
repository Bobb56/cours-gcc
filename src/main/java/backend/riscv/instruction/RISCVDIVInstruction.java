package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVDIVInstruction extends RISCVInstruction {
    public RISCVDIVInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.DIV, List.of(rs1, rs2));
        addResult();
    }
}
