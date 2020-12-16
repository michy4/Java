package ApprocheObjet.listes.tests;

import ApprocheObjet.listes.Ville;

import java.util.ArrayList;

public class TestVille {

    public static void main(String[] args)
    {
        ArrayList<Ville> liste=new ArrayList<Ville>();
        liste.add(new Ville("Nice", 343000));
        liste.add(new Ville("Carcassonne", 47800));
        liste.add(new Ville("Narbonne", 53400));
        liste.add(new Ville("Lyon", 484000));
        liste.add(new Ville("Foix", 9700));
        liste.add(new Ville("Pau", 77200));
        liste.add(new Ville("Marseille", 850700));
        liste.add(new Ville("Tarbes", 40600));

        int j=0;
        int villeLaPlusPeupleeIndex=0;
        int nbHabMax=0;
        for (Ville ville: liste)
        {
            if(ville.getHab()>nbHabMax)
            {
                villeLaPlusPeupleeIndex=j;
                nbHabMax=ville.getHab();
            }
            j++;
        }
        System.out.println("La ville la plus peuplée est : "+liste.get(villeLaPlusPeupleeIndex).getNom());

        j=0;
        int villeLaMoinsPeupleeIndex=0;
        int nbHabMin=0;
        for (Ville ville: liste)
        {
            if(j==0)
            {
                villeLaMoinsPeupleeIndex=j;
                nbHabMin=ville.getHab();
            }
            else
            {
                if(ville.getHab()<nbHabMin)
                {
                    villeLaMoinsPeupleeIndex=j;
                    nbHabMin=ville.getHab();
                }
            }
            j++;
        }
        liste.remove(villeLaMoinsPeupleeIndex);

        j=0;
        for (Ville ville: liste)
        {
            System.out.println("Ville au rang "+j+" : "+ville.getNom());
        }
    }

}
