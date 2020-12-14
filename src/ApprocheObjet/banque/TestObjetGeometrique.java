package ApprocheObjet.banque;

import ApprocheObjet.banque.entities.*;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objetGeometriques={new Cercle(6), new Rectangle(3,5)};

        for( ObjetGeometrique objetGeometrique: objetGeometriques )
        {
            System.out.println("Le perimètre est: "+objetGeometrique.perimetre()+", la surface est: "+objetGeometrique.surface());

        }
    }

}
