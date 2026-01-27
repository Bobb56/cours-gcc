package compiler.frontend;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
	protected HashMap<ArrayList<Integer>, SymbolTableLevel> levelTable;
	protected ArrayList<Integer> currentPath;
	protected int currentScope;
	public SymbolTable() {
		levelTable = new HashMap<ArrayList<Integer>, SymbolTableLevel>();
		currentPath = new ArrayList<Integer>();
		currentScope = -1;
	}
	
	public SymbolTableLevel initializeScope(ParserRuleContext ctx) {
		currentScope++;
		currentPath.add(currentScope);
		levelTable.put(currentPath, new SymbolTableLevel());
		currentScope = -1;
		return levelTable.get(currentPath);
	}
	
	public void finalizeScope() {
		currentScope = currentPath.getLast();
		currentPath.removeLast();
	}
	
	public SymbolTableEntry insert(String name) {
		SymbolTableLevel level = levelTable.get(currentPath);
		SymbolTableEntry entry = new SymbolTableEntry(name);
		level.put(name, entry);
		return entry;
	}
	
	public SymbolTableEntry lookup(String name) {
		return levelTable.get(currentPath).get(name);
	}
	
}
