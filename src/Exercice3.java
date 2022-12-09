import java.util.ArrayList;

public class Exercice3 {
    // Création de la variable nombre d'or accessible publiquement
    public float nbreOr = (1 + (float)Math.sqrt(5)) / (float)2;
        // Méthod création suite Fibonacci
        public int[] fibo(int nombre) {
            // Initialisation des variables
            int[] suiteFibo = new int[nombre+1];
            suiteFibo[0] = 0;
            suiteFibo[1] = 1;
            int compteur = 2;
            // Boucle de création
            while (compteur <= nombre) {
                suiteFibo[compteur] = suiteFibo[compteur - 1] + suiteFibo[compteur - 2];
                compteur++;
            }
        // afichage de la suite et retour du tableau
        System.out.println("Nombre d'éléments de la suite de Fibonacci : "+(nombre+1));
        return suiteFibo;
    }
    // Fonction qui retourne les 2 derniers entiers qui respectent a/b < epsilon
    ArrayList approximation_fibo(float epsilon) {
        // Estime la taille de la suite de fibonacci nécessaire pour l'approximation demandée
        int nombreElement = (int)(0.1/epsilon);
        // Initialisation des variables
        int compteur = 1;
        float calcul = nbreOr - 1;
        int[] suiteFibo = new int[nombreElement+2];
        ArrayList retour = new ArrayList();
        // création de la suite de Fibonacci
        suiteFibo = fibo(nombreElement);
        // boucle de balayage jusqu'à approximation < epsilon
        do {
            compteur++;
            calcul = (float)suiteFibo[compteur] / suiteFibo[compteur-1];
        }
        while (Math.abs(calcul - nbreOr) > epsilon);
        // Construction de la liste des 2 valeurs de retour
        retour.add(suiteFibo[compteur - 1]);
        retour.add(suiteFibo[compteur]);
        // fin de la fonction
        return retour;
    }

}
