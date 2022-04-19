package feladat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Konyvtar implements Iterable<Konyv>{
    private ArrayList<Konyv> konyvek;

    public Konyvtar() {
        konyvek = new ArrayList<>();
        konyvek.add(new Konyv("cím1", "szerző1"));
        konyvek.add(new Konyv("cím1", "szerző1"));
        konyvek.add(new Konyv("cím2", "szerző2"));
        konyvek.add(new Konyv("cím3", "szerző3"));
        konyvek.add(new Konyv("cím3", "szerző3"));
        konyvek.add(new Konyv("cím3", "szerző3"));
        konyvek.add(new Konyv("cím4", "szerző4"));
        konyvek.add(new Konyv("cím4", "szerző4"));
    }

    @Override
    public Iterator<Konyv> iterator() {
        return konyvek.iterator();
    }
    
    public HashSet<Konyv> egyediKonyvekListaja(){
        return new HashSet<>(konyvek);
    }
}
