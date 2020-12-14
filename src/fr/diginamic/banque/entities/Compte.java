package fr.diginamic.banque.entities;

public class Compte {

    public int numCompte;
    public int soldeCompte;

    public Compte (int numCompte, int soldeCompte)
    {
        this.numCompte=numCompte;
        this.soldeCompte=soldeCompte;
    }

    @Override
    public String toString()
    {
        return this.numCompte+"-"+this.soldeCompte;
    }
}
