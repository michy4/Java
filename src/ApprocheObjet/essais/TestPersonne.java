package ApprocheObjet.essais;

import ApprocheObjet.entities.AdressePostale;
import ApprocheObjet.entities.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale test11 = new AdressePostale(4,"Boulevard Vincent Gâche",44200,"Nantes");
        AdressePostale test21 = new AdressePostale(5014,"Elsmere Avenue",99,"Bethesda");

        Personne test1 = new Personne("Jean-Pierre","Polnareff",test11);
        Personne test2 = new Personne("Jotaro","Kujo",test21);
    }
}
