package ApprocheObjet.banque.entities;

abstract public class Operation {

    public String date;
    public int montant;
    
    public Operation(String date, int montant)
    {
        this.date=date;
        this.montant=montant;
    }

    abstract public String afficherType();

}
