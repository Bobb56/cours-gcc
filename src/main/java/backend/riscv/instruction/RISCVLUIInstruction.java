package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;

public class RISCVLUIInstruction extends RISCVInstruction {
    public RISCVLUIInstruction(RISCVImmediateOperand immediate) {
        super(RISCVOpcode.LUI, List.of(immediate));
        addResult();
    }
}
