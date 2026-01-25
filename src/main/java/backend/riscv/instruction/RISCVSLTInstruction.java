package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVSLTInstruction extends RISCVInstruction {
    public RISCVSLTInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2) {
        super(RISCVOpcode.SLT, List.of(rs1, rs2));
        addResult();
    }
}
