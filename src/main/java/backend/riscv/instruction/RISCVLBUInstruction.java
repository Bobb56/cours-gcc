package backend.riscv.instruction;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVMemoryOperand;

public class RISCVLBUInstruction extends RISCVLoadInstruction {
    public RISCVLBUInstruction(RISCVMemoryOperand source) {
        super(RISCVOpcode.LBU, source);
    }
}
