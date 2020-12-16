package ApprocheObjet.listes.tests;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> liste=new ArrayList<Integer>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        int longueur=liste.size();
        for (int i=0;i<longueur;i++)
        {
            System.out.println("Élément au rang "+i+" : "+liste.get(i));
        }

        System.out.println("Taille de la liste : "+liste.size());

        System.out.println("Élement le plus grand : "+Collections.max(liste));

        liste.remove(Collections.min(liste));
        longueur=liste.size();
        for (int i=0;i<longueur;i++)
        {
            System.out.println("Élément au rang "+i+" : "+liste.get(i));
        }

        for (int i=0;i<longueur;i++)
        {
            if(liste.get(i)<0)
            {
                liste.set(i,-liste.get(i));
            }
        }
        for (int i=0;i<longueur;i++)
        {
            System.out.println("Élément au rang "+i+" : "+liste.get(i));
        }

    }
}
