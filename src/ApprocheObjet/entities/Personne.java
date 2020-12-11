package ApprocheObjet.entities;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne()
    {

    }

    public Personne(String nom, String prenom, AdressePostale adresse)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
    }

    public void AfficherNomMajuscule()
    {
        System.out.println(this.prenom+" "+this.nom.toUpperCase());
    }

    public void ModifierNom(String nom)
    {
        this.nom=nom;
    }

    public void ModifierPrenom(String prenom)
    {
        this.prenom=prenom;
    }

    public void ModifierPrenom(AdressePostale adresse)
    {
        this.adresse=adresse;
    }

    public String ObtenirNom()
    {
        return this.nom;
    }

    public String ObtenirPrenom()
    {
        return this.prenom;
    }

    public AdressePostale ObtenirAdresse()
    {
        return this.adresse;
    }
}
