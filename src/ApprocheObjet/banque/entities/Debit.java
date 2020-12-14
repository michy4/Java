package ApprocheObjet.banque.entities;

public class Debit extends Operation {

    public Debit(String date, int montant)
    {
        super(date, montant);
    }

    public String afficherType()
    {
        return "Débit";
    }

}
