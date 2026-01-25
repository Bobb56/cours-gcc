# TP4 - Optimisations

L'objectif de ce quatrième TP est d'implémenter au moins une optimisation appliquée à l'IR. Je donne ci-dessous les différentes analyses que vous pouvez implémenter :

## Propagation de constante, de copie et élimination de code mort en forme SSA


L'objectif de cette partie du TP est d'implémenter les différentes fonctions de simplification de la forme SSA. Comme nous avons vu en cours, réaliser de la propagation de constante, de copie ou de l'élimination de code mort sous la forme SSA est très simple grâce à l'utilisation des valeurs SSA. 

On propose ici d'implémenter les simplifications suivantes : 

**Constant propagation​ :** On trouve les v := c et les v := φ(c1, … cn) où tous les ci sont égaux et on remplace toutes les utilisations de v par la valeur de la constante.​

**Copy propagation​ :** On trouve les x := y et les x := φ(y) et on remplace toutes les utilisations de x par y, en supprimant l'opération. ​

**Constant folding​ :** Quand on trouve un x := a + b avec a et b constants, on peut calculer statiquement le résultat et remplacer par la valeur. ​

**Constant condition​ :** Les branchements conditionnels qui reçoivent une constante peuvent être transformé en un branchement simple vers la bonne destination. ​Attention : il faut adapter les φ dans le bloc qui a moins de prédécesseurs.​

**Unreachable code​ :** Quand un block n’a plus de prédécesseur, il devient inaccessible. Cela réduit les use de certaines variable et les prédécesseurs de certains blocs.​

**Deadcode elimination :** Une opération dont la valeur SSA crée n'a aucune utilisation peut être simplifiée.


Chacunes des fonctions précédentes va supprimier des utilisation d'autres valeurs SSA, ou bien faire que de nouvelles valeurs SSA sont marquées comme constantes, provoquant d'autres opportunités d'optimisations. 
L'optimisation doit donc être implémentée comme un *work-list algorithm* qui garde une liste des IRValue à regarder. On utilisera également une hashmap permettant de savoir si une variable est constante et, dans ce cas, la valeur de la constante.

A chaque passe de l'optimisation, l'algorithme prend une IRValue de la liste des IRValue à étudier, regarde si il est possible d'appliquer l'une des transformation précédentes sur une opération qui utilise l'IRValue. Si c'est la cas, l'IRValue crée par l'opération modifiée est ajoutée à la liste des IRValue à regarder. Si l'opération modifiée est un bloc, on peut essayer d'appliquer *Unreachable code*.

**Question 1 :** Créez une classe `SSAOptimizations` avec un champs contenant la liste des `IROperation` à étudier.

**Question 2 :** Implémentez une fonction `deadcodeElimination(IROperation op)` qui applique la transformation *Deadcode elimination*. La fonction ajoute dans la *worklist* les `IRValue` qui étaient utilisées comme opérande dans l'opération supprimée.
Testez l'algorithme avec uniquement cette simplification en utilisant la fonction d'import de l'IR.

**Question 3 :** Implémentez et intégrez les autres transformations de la liste.


## Elimination de sous-expressions communes

Pour réaliser l'élimination de sous-expressions communes, il faut commencer par réaliser une analyse des *available expressions* puis une analyse des  *reaching expressions* aux points où une transformation serait possible (i.e. aux points où on calcule une expression qui est *available*).
Ces deux analyses peuvent être développée en héritant de la classe permettant de faire des analyses dataflow.

Une fois que l'analyse détermine qu'une transformation est possible, il faut faire le remplacement tout en restant sous le forme SSA. 

## Conditional constant propagation

La troisième transformation proposée est l'analyse sur treilli premettant d'obtenir les variables constantes et les blocks non exécutés. Pour faire cette analyse, il faudra implémenter le treilli proposé en cours et impléménter le *work-list algorithm* vu en cours.

## Autres transformations simples et utiles (Bonus)

En plus des grosses optimisations précédentes, vous pouvez implémenter les transformations suivante :

 - **Simplification du graphe de flot de contrôle :** fusionne deux blocs A et B tels que A n'a que B comme successeur et B n'a que A comme prédécesseur.

