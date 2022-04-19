package alaphasznalat;

import java.io.OutputStream;

public class InterfeszHasznalata {
    public static void main(String[] args) {
        Ajto ajto = new Ajto();
        Esernyo esernyo = new Esernyo();
        
        /* Közös tárolóba rakjuk...: */
        /* Targy osztály az kb az Object
        de ide minden belerakható:
        */
        Object[] objTargyak = {ajto, esernyo, new Boolean("") };
        
        /* viselkedés alapján: */
        IKinyithato[] ikNyithatoTargyak = {ajto, esernyo};

        /* Általában NEM akarunk interface típust példányosítani */
        IKinyithato ik = new IKinyithato() {
            @Override
            public void kinyit() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //ik.kinyit();//UnsupportedOperationException
        
        /* Bármilyen megvalósító osztály példányára hivatkozhat */
        ik = new Ajto();
        ik = new Esernyo();
        ik.kinyit();//"Esernyő nyitása..."
        
        /* Előny: */
        System.out.println("A nyitható tárgyak használata: ");
        for (IKinyithato targy : ikNyithatoTargyak) {
            targy.kinyit();
        }
    }
    
}
