package ApprocheObjet.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args)
    {
        HashSet<Double> tests=new HashSet<>();
        tests.add(1.5);
        tests.add(8.25);
        tests.add(-7.32);
        tests.add(13.3);
        tests.add(-12.45);
        tests.add(48.5);
        tests.add(0.01);

        for(Double test:tests)
        {
            System.out.println(test);
        }

        System.out.println("Valeur maximale de la liste : "+Collections.max(tests));

        tests.remove(Collections.min(tests));

        for(Double test:tests)
        {
            System.out.println(test);
        }

    }
}
