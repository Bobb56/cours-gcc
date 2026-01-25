package backend.riscv.instruction;

import java.util.List;

import backend.LabelledBlock;
import backend.riscv.RISCVOpcode;

public class RISCVJALInstruction extends RISCVInstruction {
    private final LabelledBlock target;

    public RISCVJALInstruction(LabelledBlock target, boolean isGoto) {
        super(RISCVOpcode.JAL, List.of());
        this.target = target;
        
        if (!isGoto) //We don't need the result if it is a goto
        	addResult();
    }

    public LabelledBlock getTarget() {
        return target;
    }
    
    public String toString() {
    	if (this.getResult() == null) {
    		return "j " + target.getLabel(); 
    	}
    	return "jal " + this.getResult() + ", " + target.getLabel();
    }
}
