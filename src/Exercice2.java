
public class Exercice2 {
    // Fonction de recherche du plus grand carré inférieur
    public int plusGrandCarreInf (int nombre) {
        int calcul = (int)Math.floor(Math.sqrt(nombre)) ;
        return calcul * calcul;
    }
    // Fonction de recherche du plus petit carré supérieur
        public int plusPetitCarreSup (int nombre) {
        int calcul = (int)Math.ceil(Math.sqrt(nombre));
        return calcul * calcul;
    }
}