package ApprocheObjet.entities;

public class AdressePostale {
    public int numeroRue;
    public String libelleRue;
    public int codePostal;
    public String ville;

    public AdressePostale()
    {

    }

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville)
    {
        this.numeroRue=numeroRue;
        this.libelleRue=libelleRue;
        this.codePostal=codePostal;
        this.ville=ville;
    }

    public int getNumeroRue() {return numeroRue;}
    public String getLibelleRue() {return libelleRue;}
    public int getCodePostal() {return codePostal;}
    public String getVille() {return ville;}

    public void setNumeroRue( int y) {numeroRue = y;}
    public void setlibelleRue( String y) {libelleRue = y;}
    public void setcodePostal( int y) {codePostal = y;}
    public void setville( String y) {ville = y;}


}
