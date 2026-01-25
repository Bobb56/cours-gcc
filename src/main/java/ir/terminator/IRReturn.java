package ir.terminator;

import java.util.List;

import ir.core.IRValue;
import ir.core.IRVisitor;

public class IRReturn extends IRTerminator {
    public IRReturn(IRValue value) {
        super(List.of());
        if (value != null)
            this.addOperand(value);
    }

    @Override
    public Object accept(IRVisitor<?> v) {
        return v.visitReturnTerminator(this);
    }
}
