package feladat;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Feladat {
    public static void main(String[] args) {
        /* másolható könyv: */
        Konyv k0 = new Konyv("A programozás művészete", "Code de Art");
        Konyv masolat;
        try {
            masolat = (Konyv)k0.clone();
            masolat.setCim(k0.getCim() + " 2.");
            System.out.println("k0: " + k0);
            System.out.println("masolat: " + masolat);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("könyvtári könyvek:");
        Konyvtar konyvtar = new Konyvtar();
        for (Konyv konyv : konyvtar) {
            System.out.println(konyv);
        }
        
        System.out.println("\nkönyvtári különböző könyvek:");
        for (Konyv konyv : konyvtar.egyediKonyvekListaja()) {
            System.out.println(konyv);
        }
    }
    
}
