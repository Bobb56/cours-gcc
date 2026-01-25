package backend.riscv.instruction;

import java.util.List;

import backend.riscv.RISCVOpcode;

public class RISCVECALLInstruction extends RISCVInstruction {
    public RISCVECALLInstruction() {
        super(RISCVOpcode.ECALL, List.of());
    }
}
