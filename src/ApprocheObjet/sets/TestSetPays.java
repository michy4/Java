package ApprocheObjet.sets;

import java.util.HashSet;

public class TestSetPays {
    public static void main(String[] args) {
        HashSet<Pays> tests = new HashSet<>();
        tests.add(new Pays("USA",328200000,62794));
        tests.add(new Pays("France",66990000,41463));
        tests.add(new Pays("Allemagne",83020000,47603));
        tests.add(new Pays("UK",66650000,42943));
        tests.add(new Pays("Italie",60360000,34483));
        tests.add(new Pays("Japon",126500000,39289));
        tests.add(new Pays("Chine",1393000000,9770));
        tests.add(new Pays("Russie",144500000,11288));
        tests.add(new Pays("Inde",1353000000,2009));

        int plusHautPibHab=0;
        String paysPlusHautPibHab="";
        for(Pays test : tests)
        {
            if (test.pibHab>plusHautPibHab)
            {
                plusHautPibHab=test.pibHab;
                paysPlusHautPibHab=test.nom;
            }
        }

        System.out.println("Le pays avec le plus grand PIB / habitant : "+paysPlusHautPibHab+" avec : "+plusHautPibHab);

        int plusPetitPibHab=-1;
        Pays paysPlusPetitPibHab=new Pays("",0,0);
        int j=0;
        for(Pays test : tests)
        {
            if(plusPetitPibHab==-1)
            {
                plusPetitPibHab=test.pibHab;
                paysPlusPetitPibHab=test;
            }
            else
            {
                if (test.pibHab<plusPetitPibHab)
                {
                    plusPetitPibHab=test.pibHab;
                    paysPlusPetitPibHab=test;
                }
            }
            j++;
        }
        tests.add(new Pays(paysPlusPetitPibHab.nom.toUpperCase(),paysPlusPetitPibHab.nbHab,paysPlusPetitPibHab.pibHab));
        tests.remove(paysPlusPetitPibHab);

        for(Pays test : tests)
        {
            System.out.println(test.nom);
        }

    }
}
