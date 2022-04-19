package hasonlithato;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Bankkartya> kartyak = new ArrayList<>();
        JuniorKartya j1 = new JuniorKartya(123);
        JuniorKartya j2 = new JuniorKartya(93);
        kartyak.add(j1);
        kartyak.add(j2);
        kartyak.add(new VisaKartya(154));
        kartyak.add(new VisaKartya(231));
        kartyak.add(new VisaKartya(47));
        
        kiir("eredeti:", kartyak);
        
        Collections.sort(kartyak);
        kiir("\nrendezve:", kartyak);
    }

    private static void kiir(String szoveg, ArrayList<Bankkartya> kartyak) {
        System.out.println(szoveg);
        for (Bankkartya k : kartyak) {
            System.out.println(k);
        }
    }
}
