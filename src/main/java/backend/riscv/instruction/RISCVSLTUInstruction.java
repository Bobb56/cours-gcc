package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSLTUInstruction extends RISCVInstruction {
    public RISCVSLTUInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.SLTU, List.of(rs1, rs2));
        addResult();
    }
}
