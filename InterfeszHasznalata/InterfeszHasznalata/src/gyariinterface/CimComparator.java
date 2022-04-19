package gyariinterface;

import java.util.Comparator;

public class CimComparator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        return egyik.getCim().compareTo(masik.getCim());
    }
    
}
