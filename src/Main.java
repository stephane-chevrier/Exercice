import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        // Exercice 1
        // Pointage sur Exercice 1
        Exercice1 exo1 = new Exercice1();
        // programme Principal
        exo1.enumerate_while(100);
        exo1.enumerate_for(100);
        exo1.enumerate_even(100);
*/
        // Exercice 2
        // Pointage sur Exercice2
        Exercice2 exo2 = new Exercice2();
        // programme Principal
        // Saisi de l'entier en entrée
        Scanner clavier = new Scanner(System.in);
        int entree = clavier.nextInt();
        // Affichage du résultat
        System.out.println("Plus grand carré inférieur : "+exo2.plusGrandCarreInf(entree));
        System.out.println("Plus petit carré supérieur : "+exo2.plusPetitCarreSup(entree));
    }
}
