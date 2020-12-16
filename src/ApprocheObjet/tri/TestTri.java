package ApprocheObjet.tri;

import ApprocheObjet.sets.ComparatorHabitant;
import ApprocheObjet.sets.ComparatorPibHabitant;
import ApprocheObjet.sets.Pays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestTri {

    public static void main(String[] args) {
        ArrayList<Pays> tests = new ArrayList<>();
        tests.add(new Pays("USA", 328200000, 62794));
        tests.add(new Pays("France", 66990000, 41463));
        tests.add(new Pays("Allemagne", 83020000, 47603));
        tests.add(new Pays("UK", 66650000, 42943));
        tests.add(new Pays("Italie", 60360000, 34483));
        tests.add(new Pays("Japon", 126500000, 39289));
        tests.add(new Pays("Chine", 1393000000, 9770));
        tests.add(new Pays("Russie", 144500000, 11288));
        tests.add(new Pays("Inde", 1353000000, 2009));

        for(Pays test : tests)
        {
            System.out.println(test.nom+", "+test.nbHab+", "+test.pibHab);
        }

        System.out.println("---");
        Collections.sort(tests);

        for(Pays test : tests)
        {
            System.out.println(test.nom+", "+test.nbHab+", "+test.pibHab);
        }

        System.out.println("---");
        Collections.sort(tests, new ComparatorHabitant());

        for(Pays test : tests)
        {
            System.out.println(test.nom+", "+test.nbHab+", "+test.pibHab);
        }

        System.out.println("---");
        Collections.sort(tests, new ComparatorPibHabitant());

        for(Pays test : tests)
        {
            System.out.println(test.nom+", "+test.nbHab+", "+test.pibHab);
        }
    }
}
