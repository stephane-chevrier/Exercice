import java.util.ArrayList;

public class Exercice4 {
    // Création ArrayList des prénoms
    public ArrayList<String> prenom = new ArrayList<String>();

    // Initialisation
    void initialisation() {
        prenom.add("Martin");
        prenom.add("Ludovic");
        prenom.add("Anthony");
        prenom.add("Jo");
        prenom.add("Pierre");
        prenom.add("Efkan");
    }

    // Affichage liste + nombre de lettres
    void describe() {
        // balayage de la ArrayList
        for (String i : prenom) {
            // affichage que des prénoms de plus de 4 caractères
            if (i.length() >= 4 ) {
                System.out.println(i + ":" + i.length());
            }
        }
        // Saut de ligne
        System.out.println();
    }

    // Affichage Liste en majuscule
    void to_upper_case() {
        // balayage de la Arraylist
        for (String i : prenom) {
            // affichage des prenoms en majuscule
            System.out.println(i.toUpperCase());
        }
    }
}
