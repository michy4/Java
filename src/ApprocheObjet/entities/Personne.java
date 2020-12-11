package ApprocheObjet.entities;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    public Personne()
    {

    }

    public Personne(String nom, String prenom, AdressePostale adresse)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
    }
}
