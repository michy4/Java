package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{

    double taux;

    public CompteTaux(int numCompte, int soldeCompte, double taux)
    {
        super(numCompte, soldeCompte);
        this.taux=taux;
    }

    @Override
    public String toString()
    {
        return super.toString()+"-"+this.taux;
    }

}
