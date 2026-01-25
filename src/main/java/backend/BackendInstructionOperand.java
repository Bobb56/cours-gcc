package backend;

public abstract class BackendInstructionOperand implements BackendVisitableObject<Object> {
    @Override
    public Object accept(BackendVisitor<?> v) {
        return v.visitInstructionOperand(this);
    }
}
