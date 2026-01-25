package backend.riscv.instruction;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVMemoryOperand;

public class RISCVLBInstruction extends RISCVLoadInstruction {
    public RISCVLBInstruction(RISCVMemoryOperand source) {
        super(RISCVOpcode.LB, source);
    }
}
