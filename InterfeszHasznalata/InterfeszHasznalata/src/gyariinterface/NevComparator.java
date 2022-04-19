package gyariinterface;

import java.text.Collator;
import java.util.Comparator;

public class NevComparator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        /* az ékezetek nem jók */
        //return egyik.getNev().compareTo(masik.getNev());
        
        /* ékezettel: */
        Collator col = Collator.getInstance();
        return col.compare(egyik.getNev(), masik.getNev());
    }
    
}
