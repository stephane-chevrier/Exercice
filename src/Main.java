public class Main {
    // Affichage liste de nombres entiers avec boucle while
    static void enumerate_while(int nombre) {
        int i = 0;
        while (i <= nombre) {
            System.out.println(i++);
        }
    }
    // Affichage liste de nombres entiers avec boucle for
    // static void enumerate_for(int nombre2) {
        for (int i=0;i<=nombre2;i++) {
            System.out.println(i);
        }
    }
    // Affichage liste de nombres entiers pairs avec boucle while
    static void enumerate_even(int nombre3) {
        for (int i = 0; i <= nombre3; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
        // Programme principal
        public static void main(String[] args) {
        // Appel des méthodes
        enumerate_while(100);
        enumerate_for(100);
        enumerate_even (100);
    }
}