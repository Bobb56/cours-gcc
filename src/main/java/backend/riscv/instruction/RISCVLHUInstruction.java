package backend.riscv.instruction;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVMemoryOperand;

public class RISCVLHUInstruction extends RISCVLoadInstruction {
    public RISCVLHUInstruction(RISCVMemoryOperand source) {
        super(RISCVOpcode.LHU, source);
    }
}
