package ApprocheObjet.listes.tests;

import java.util.ArrayList;

public class TestListeString {

    public static void main(String[] args)
    {
        ArrayList<String> liste=new ArrayList<String>();
        liste.add("Nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Pau");
        liste.add("Marseille");
        liste.add("Tarbes");

        int longueur=liste.size();
        int longuest=0;
        int longuestIndex=0;
        for (int i=0;i<longueur;i++)
        {
            if (longuest<liste.get(i).length())
            {
                longuest=liste.get(i).length();
                longuestIndex=i;
            }
        }
        System.out.println("Prermier élément le plus long au rang "+longuestIndex+" : "+liste.get(longuestIndex));

        for (int i=0;i<longueur;i++)
        {
            liste.set(i,liste.get(i).toUpperCase());
        }
        for (int i=0;i<longueur;i++)
        {
            System.out.println("Élément au rang "+i+" : "+liste.get(i));
        }

        for (int i=0;i<longueur;i++)
        {
            if(String.valueOf(liste.get(i).charAt(0)).equals("N"))
            {
                liste.remove(i);
                longueur--;
            }
        }
        for (int i=0;i<longueur;i++)
        {
            System.out.println("Élément au rang "+i+" : "+liste.get(i));
        }

    }

}
