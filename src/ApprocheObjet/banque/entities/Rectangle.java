package ApprocheObjet.banque.entities;

public class Rectangle implements ObjetGeometrique{

    int longeur;
    int largeur;

    public Rectangle(int longeur, int largeur)
    {
        this.longeur=longeur;
        this.largeur=largeur;
    }

    @Override
    public double perimetre() {
        return (longeur*2)+(largeur*2);
    }

    @Override
    public double surface() {
        return longeur*largeur;
    }

}
