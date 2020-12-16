package ApprocheObjet.sets;

import java.util.Collection;

public class Pays implements Comparable<Pays> {

    public String nom;
    public int nbHab;
    public int pibHab;

    public Pays(String nom, int nbHab, int pibHab)
    {
        this.nom=nom;
        this.nbHab=nbHab;
        this.pibHab=pibHab;
    }

    @Override
    public int compareTo(Pays o) {
        return this.nom.compareTo(o.nom);

        //if(o.pibHab<this.pibHab)
        //{
        //    return 1;
        //}
        //return -1;
    }
}
