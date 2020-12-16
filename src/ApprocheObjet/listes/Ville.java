package ApprocheObjet.listes;

public class Ville {

    String nom;
    int nbHab;

    public Ville(String nom, int nbHab)
    {
        this.nom=nom;
        this.nbHab=nbHab;
    }

    public int getHab(){return this.nbHab;}

    public String getNom(){return this.nom;}

}
