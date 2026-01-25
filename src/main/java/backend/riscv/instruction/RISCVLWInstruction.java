package backend.riscv.instruction;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVMemoryOperand;

public class RISCVLWInstruction extends RISCVLoadInstruction {
    public RISCVLWInstruction(RISCVMemoryOperand source) {
        super(RISCVOpcode.LW, source);
    }
}
