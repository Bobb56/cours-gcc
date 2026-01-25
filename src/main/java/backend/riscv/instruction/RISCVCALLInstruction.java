package backend.riscv.instruction;

import java.util.List;

import backend.BackendFunction;
import backend.riscv.RISCVOpcode;

public class RISCVCALLInstruction extends RISCVInstruction {
    private final BackendFunction function;

    public RISCVCALLInstruction(BackendFunction function) {
        super(RISCVOpcode.CALL, List.of());
        this.function = function;
        addResult();
    }

    public BackendFunction getFunction() {
        return function;
    }
}
