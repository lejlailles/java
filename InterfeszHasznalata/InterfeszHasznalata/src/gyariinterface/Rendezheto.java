package gyariinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Rendezheto {
    public static void main(String[] args) {
        ArrayList<String> nevek = new ArrayList<>();
        nevek.add("Pisti");
        nevek.add("Peti");
        nevek.add("Xenia");
        nevek.add("Misi");
        
        System.out.println("eredeti String:");
        kiir1(nevek);
        
        System.out.println("\nrendezett String: ");
        Collections.sort(nevek);
        kiir1(nevek);
        
        /*--------------------------------*/
        ArrayList<Ember> emberek = new ArrayList<>();
        emberek.add(new Ember("Éva", "Bp", 1997));
        emberek.add(new Ember("Péter", "Miskolc", 1999));
        emberek.add(new Ember("Xénia", "Bp", 1998));
        emberek.add(new Ember("Misi", "Ab", 1995));
        System.out.println("\neredeti osztály: ");
        kiir2(emberek);
        
        System.out.println("\nrendezett (kor) osztály: ");
        Collections.sort(emberek);
        kiir2(emberek);
        
        System.out.println("\nrendezett (név) osztály: ");
        /* hátrány: ismerni kell a NevComparator osztályt */
//        Collections.sort(emberek, new NevComparator());
        
        /* előny: ha van public getter, bármilyen rendezést meg tudunk csinálni */
//        Collections.sort(emberek, new Comparator<Ember>(){
//            @Override
//            public int compare(Ember t, Ember t1) {
//                return t.getNev().compareTo(t1.getNev());
//            }
//            
//        });
        
        /* ha biztosítjuk a rendezést: */
        Collections.sort(emberek, Ember.RendezNev());
        kiir2(emberek);
        
        System.out.println("\nrendezett (cím) osztály: ");
        Collections.sort(emberek, Ember.RendezCim());
        kiir2(emberek);
    }

    private static void kiir1(ArrayList<String> lista) {
        for (String str : lista) {
            System.out.println(str);
        }
    }

    private static void kiir2(ArrayList<Ember> lista) {
        for (Ember ember : lista) {
            System.out.println(ember);
        }
    }
}
