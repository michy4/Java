package ApprocheObjet.entities;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private int codePostal;
    private String ville;

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
