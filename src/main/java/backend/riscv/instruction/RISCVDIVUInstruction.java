package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVDIVUInstruction extends RISCVInstruction {
    public RISCVDIVUInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.DIVU, List.of(rs1, rs2));
        addResult();
    }
}
