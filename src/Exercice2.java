
public class Exercice2 {
    public int plusGrandCarreInf (int nombre) {
        int calcul;
        calcul = (int)Math.floor(Math.sqrt(nombre)) ;
        return calcul * calcul;
    }
    public int plusPetitCarreSup (int nombre) {
        int calcul;
        calcul = (int)Math.ceil(Math.sqrt(nombre));
        return calcul * calcul;
    }
}