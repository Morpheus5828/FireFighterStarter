Partie 1
---

Dans un premier temps, mettons en place le pattern MVC qui est bien adapté pour faire
des applications avec des interfaces graphiques. 

Le modele va contenir la partie calcul, la vue, elle s'occupera de la partie graphique, et pour finir le controller fera
la transition entre les deux.

Voici la description de chacun de ces repos:

- View:
  - Grid une abstract class, son rôle est d'initialiser une grille.
  - GridPaint hérité de Grid, comme son nom l'indique, elle va peindre chaque case de la grille.