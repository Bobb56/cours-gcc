package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVMemoryOperand;

public abstract class RISCVLoadInstruction extends RISCVInstruction {
    protected RISCVLoadInstruction(RISCVOpcode opcode, RISCVMemoryOperand source) {
        super(opcode, List.of(source));
        addResult();
    }
}
