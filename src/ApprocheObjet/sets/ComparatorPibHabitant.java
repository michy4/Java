package ApprocheObjet.sets;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

    @Override
    public int compare(Pays o1, Pays o2) {
        if(o1.pibHab>o2.pibHab)
        {
            return 1;
        }
        return -1;
    }
}
