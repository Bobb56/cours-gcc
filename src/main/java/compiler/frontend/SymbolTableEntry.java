package compiler.frontend;

import antlr.SimpleCParser.TypeContext;
import ir.core.IRBlock;
import ir.core.IRValue;

import java.util.HashMap;

public class SymbolTableEntry {
    public String name;
    public TypeContext type;
    protected HashMap<IRBlock, IRValue> values;

    public SymbolTableEntry(String name, TypeContext type) {
        this.name = name;
        this.type = type;
        this.values = new HashMap<>();
    }

    public void addValue(IRBlock block, IRValue value) {
        this.values.put(block, value);
    }
}
