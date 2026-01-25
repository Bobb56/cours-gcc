package backend.riscv.instruction;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVMemoryOperand;

public class RISCVLHInstruction extends RISCVLoadInstruction {
    public RISCVLHInstruction(RISCVMemoryOperand source) {
        super(RISCVOpcode.LH, source);
    }
}
