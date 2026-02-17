package compiler.frontend;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class SymbolTable {
	/**
	 * On identifie le chemin associé à un scope par une liste d'entiers
	 * représentant pour chacun la direction prise dans chaque noeud de
	 * l'arbre lors de l'accès au scope
	 */
	protected BlockVisitor currentPath;

	/**
	 * Cette table de hachage associe un SymbolTableLevel à chaque chemin de scope.
	 */
	protected HashMap<List<Integer>, SymbolTableLevel> levelTable;

	/**
	 *  Cette table de hachage associe un contexte de règle de parser au chemin identifiant un scope
	 */
	protected HashMap<ParserRuleContext, ArrayList<Integer>> contextPathMap;

	public SymbolTable() {
		levelTable = new HashMap<List<Integer>, SymbolTableLevel>();
		currentPath = new BlockVisitor();
	}
	
	public SymbolTableLevel initializeScope(ParserRuleContext ctx) {
		currentPath.enterBlock();
		levelTable.put(currentPath.copy(), new SymbolTableLevel());
		return levelTable.get(currentPath.get());
	}
	
	public void finalizeScope() {
		currentPath.exitBlock();
	}
	
	public SymbolTableEntry insert(String name) {
		SymbolTableLevel level = levelTable.get(currentPath.get());
		SymbolTableEntry entry = new SymbolTableEntry(name);
		level.put(name, entry);
		return entry;
	}
	
	public SymbolTableEntry lookup(String name) {
		SymbolTableEntry ret;
		for (int i=currentPath.get().size() ; i > 0 ; i--) {
			List<Integer> subl = currentPath.get().subList(0, i);
			SymbolTableLevel level = levelTable.get(subl);

			if (level != null) {
				ret = level.get(name);
				if (ret != null)
					return ret;
			}
		}
		return null;
	}

	public HashMap<List<Integer>, SymbolTableLevel> getLevelTable() {
		return levelTable;
	}
	
}
