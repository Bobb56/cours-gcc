package compiler.frontend;

import java.util.HashMap;

public class SymbolTableLevel {
	protected HashMap<String, SymbolTableEntry> table;

    public SymbolTableLevel() {
        table = new HashMap<String, SymbolTableEntry>();
    }

    public void put(String name, SymbolTableEntry entry) {
        table.put(name, entry);
    }

    public SymbolTableEntry get(String name) {
        return table.get(name);
    }
}
