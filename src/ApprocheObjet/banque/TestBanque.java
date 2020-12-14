package ApprocheObjet.banque;

import ApprocheObjet.banque.entities.Compte;
import ApprocheObjet.banque.entities.CompteTaux;
import ApprocheObjet.banque.entities.Credit;
import ApprocheObjet.banque.entities.Debit;
import ApprocheObjet.banque.entities.Operation;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte=new Compte(1,200);
        System.out.println(monCompte.soldeCompte);
        System.out.println(monCompte.toString());
        Compte monCompteTaux=new CompteTaux(2,300,1.2);
        System.out.println(monCompteTaux.toString());
        Operation[] operations={new Credit("12/1/2020",10), new Debit("12/2/2020",20), new Credit("12/3/2020",40), new Debit("12/4/2020",5)};
        int somme=0;
        for( Operation operation: operations )
        {
            System.out.println("("+operation.afficherType()+") "+operation.date+" : "+operation.montant);
            if(operation.afficherType()=="Crédit")
            {
                somme=somme+operation.montant;
            }
            else
            {
                if(operation.afficherType()=="Débit")
                {
                    somme=somme-operation.montant;
                }
            }
        }
        System.out.println(somme);
    }
}
