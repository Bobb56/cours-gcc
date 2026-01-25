package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;
import backend.riscv.operand.RISCVImmediateOperand;

public class RISCVAUIPCInstruction extends RISCVInstruction {
    public RISCVAUIPCInstruction(RISCVImmediateOperand immediate) {
        super(RISCVOpcode.AUIPC, List.of(immediate));
        addResult();
    }
}
