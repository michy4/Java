package fr.diginamic.banque.entities;

public class Cercle implements ObjetGeometrique{

    int rayon;

    public Cercle(int rayon)
    {
        this.rayon=rayon;
    }

    @Override
    public double perimetre() {
        return rayon*2*Math.PI;
    }

    @Override
    public double surface() {
        return rayon*rayon*Math.PI;
    }
}
