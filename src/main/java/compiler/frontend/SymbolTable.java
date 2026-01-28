package compiler.frontend;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
	/**
	 * On identifie le chemin associé à un scope par une liste d'entiers
	 * représentant pour chacun la direction prise dans chaque noeud de
	 * l'arbre lors de l'accès au scope
	 */
	protected ArrayList<Integer> currentPath;

	/**
	 * Cette table de hachage associe un SymbolTableLevel à chaque chemin de scope.
	 */
	protected HashMap<ArrayList<Integer>, SymbolTableLevel> levelTable;

	/**
	 *  Cet entier stocke le nombre de fils du noeud supérieur -1
	 */
	protected int currentScope;

	/**
	 *  Cette table de hachage associe un contexte de règle de parser au chemin identifiant un scope
	 */
	protected HashMap<ParserRuleContext, ArrayList<Integer>> contextPathMap;

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
		// TODO: try/catch de l'erreur et return un symbolTableEntry caractéristique
	}

	public HashMap<ArrayList<Integer>, SymbolTableLevel> getLevelTable() {
		return levelTable;
	}
	
}
