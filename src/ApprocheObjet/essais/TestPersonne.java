package ApprocheObjet.essais;

import ApprocheObjet.entities.AdressePostale;
import ApprocheObjet.entities.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale test11 = new AdressePostale(4,"Boulevard Vincent Gâche",44200,"Nantes");
        AdressePostale test21 = new AdressePostale(5014,"Elsmere Avenue",99,"Bethesda");

        Personne test1 = new Personne("Polnareff","Jean-Pierre",test11);
        Personne test2 = new Personne("Kujo","Jotaro",test21);

        System.out.println(test1.prenom+" "+test1.nom+" vit a : "+test1.adresse.numeroRue+" "+test1.adresse.libelleRue+", "+test1.adresse.ville+", "+test1.adresse.codePostal);
        System.out.println(test2.prenom+" "+test2.nom+" vit a : "+test2.adresse.numeroRue+" "+test2.adresse.libelleRue+", "+test2.adresse.ville+", "+test2.adresse.codePostal);
    }
}
