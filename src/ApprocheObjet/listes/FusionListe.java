package ApprocheObjet.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

//TODO Développements à réaliser ci-dessous

        List<String> liste3 = new ArrayList<String>();
        int longueur=liste1.size();

        if (longueur>liste2.size())
        {
            longueur=liste2.size();

        }
        for (int i=0;i<longueur;i++)
        {
            liste3.add(liste1.get(i));
            liste3.add(liste2.get(i));
        }
    }
}
