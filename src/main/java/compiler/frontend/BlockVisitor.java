package compiler.frontend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockVisitor {
    /**
     * On identifie le chemin associé à un scope par une liste d'entiers
     * représentant pour chacun la direction prise dans chaque noeud de
     * l'arbre lors de l'accès au scope
     */
    protected ArrayList<Integer> currentPath;

    /**
     *  Cet entier stocke le nombre de fils du noeud supérieur -1
     */
    protected int currentScope;

    public BlockVisitor() {
        currentPath = new ArrayList<Integer>();
        currentScope = -1;
    }

    public void enterBlock() {
        currentScope++;
        currentPath.add(currentScope);
        currentScope = -1;
    }

    public void exitBlock() {
        currentScope = currentPath.getLast();
        currentPath.removeLast();
    }

    public ArrayList<Integer> get() {
        return currentPath;
    }

    public List<Integer> copy() {
        return new ArrayList<Integer>(currentPath);
    }
}
