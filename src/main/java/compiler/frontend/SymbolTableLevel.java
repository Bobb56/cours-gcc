package compiler.frontend;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableLevel {
	protected HashMap<String, SymbolTableEntry> table;

    public SymbolTableLevel() {
        table = new HashMap<String, SymbolTableEntry>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("(");
        for (Map.Entry<String, SymbolTableEntry> entry : table.entrySet()) {
            result.append(entry.getKey()).append(", ");
        }
        result.append(")");
        return result.toString();
    }

    public void put(String name, SymbolTableEntry entry) {
        table.put(name, entry);
    }

    public SymbolTableEntry get(String name) {
        return table.get(name);
    }
}
