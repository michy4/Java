package ApprocheObjet.banque.entities;

public class Credit extends Operation{

    public Credit(String date, int montant)
    {
        super(date, montant);
    }

    public String afficherType()
    {
        return "Crédit";
    }

}
