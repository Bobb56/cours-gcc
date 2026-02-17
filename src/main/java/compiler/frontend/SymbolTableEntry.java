package compiler.frontend;

import ir.core.IRBlock;
import ir.core.IRValue;

import java.util.HashMap;

public class SymbolTableEntry {
    public String name;
    protected HashMap<IRBlock, IRValue> values;

    public SymbolTableEntry(String name) {
        this.name = name;
        this.values = new HashMap<>();
    }

    public void addValue(IRBlock block, IRValue value) {
        this.values.put(block, value);
    }
}
