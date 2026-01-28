package compiler.frontend;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

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
	protected HashMap<List<Integer>, SymbolTableLevel> levelTable;

	/**
	 *  Cet entier stocke le nombre de fils du noeud supérieur -1
	 */
	protected int currentScope;

	/**
	 *  Cette table de hachage associe un contexte de règle de parser au chemin identifiant un scope
	 */
	protected HashMap<ParserRuleContext, ArrayList<Integer>> contextPathMap;

	public SymbolTable() {
		levelTable = new HashMap<List<Integer>, SymbolTableLevel>();
		currentPath = new ArrayList<Integer>();
		currentScope = -1;
	}
	
	public SymbolTableLevel initializeScope(ParserRuleContext ctx) {
		currentScope++;
		currentPath.add(currentScope);
		System.out.println("Init scope current path : " + currentPath);
		List<Integer> currentList = new ArrayList<Integer>(currentPath);
		levelTable.put(currentList, new SymbolTableLevel());
		currentScope = -1;
		System.out.println(Collections.singletonList(levelTable));
		return levelTable.get(currentPath);
	}
	
	public void finalizeScope() {
		currentScope = currentPath.getLast();
		currentPath.removeLast();
	}
	
	public SymbolTableEntry insert(String name) {
		System.out.println("\nINSERT " + name + " at current path: " + currentPath);
		SymbolTableLevel level = levelTable.get(currentPath);
		System.out.println("get level " + level);
		SymbolTableEntry entry = new SymbolTableEntry(name);
		level.put(name, entry);
		return entry;
	}
	
	public SymbolTableEntry lookup(String name) {
		System.out.println("\nLOOKING up for " + name);
		System.out.println(Collections.singletonList(levelTable));

		SymbolTableEntry ret;
		for (int i=currentPath.size() ; i > 0 ; i--) {
			List<Integer> subl = currentPath.subList(0, i);
			SymbolTableLevel level = levelTable.get(subl);
			System.out.println("Lookup level " + subl);

			if (level != null) {
				ret = level.get(name);
				System.out.println("Lookup " + ret);
				if (ret != null)
					return ret;
			}
			else
				System.out.println("!!! LEVEL NULL");
		}
		return null;
		// TODO: try/catch de l'erreur et return un symbolTableEntry caractéristique
	}

	public HashMap<List<Integer>, SymbolTableLevel> getLevelTable() {
		return levelTable;
	}
	
}
