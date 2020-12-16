package ApprocheObjet.sets;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

    @Override
    public int compare(Pays o1, Pays o2) {
        if(o1.nbHab>o2.nbHab)
        {
            return 1;
        }
        return -1;
    }
}
