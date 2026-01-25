package backend.riscv.instruction;

import java.util.List;

import backend.BackendBlock;
import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVRegisterOperand;

public class RISCVBNEInstruction extends RISCVBranchInstruction {
    public RISCVBNEInstruction(RISCVRegisterOperand rs1, RISCVRegisterOperand rs2, BackendBlock target) {
        super(RISCVOpcode.BNE, List.of(rs1, rs2), target);
    }
}
