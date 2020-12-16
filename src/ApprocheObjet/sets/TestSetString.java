package ApprocheObjet.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> tests = new HashSet<>();
        tests.add("USA");//USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
        tests.add("France");
        tests.add("Allemagne");
        tests.add("UK");
        tests.add("Italie");
        tests.add("Japon");
        tests.add("Chine");
        tests.add("Russie");
        tests.add("Inde");

        String longestString="";
        for(String test : tests)
        {
            if (test.length()>longestString.length())
            {
                longestString=test.toString();
            }
        }

        System.out.println("Le pays avec le plus grand nombre de charactères est : "+longestString);

        tests.remove(longestString);

        for(String test:tests)
        {
            System.out.println(test);
        }

    }
}
