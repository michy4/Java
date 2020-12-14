package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte=new Compte(1,200);
        System.out.println(monCompte.soldeCompte);
        System.out.println(monCompte.toString());
        Compte monCompteTaux=new CompteTaux(2,300,1.2);
        System.out.println(monCompteTaux.toString());

    }
}
