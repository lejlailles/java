package kivetelkezeles;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KivetelKezeles {

    public static void main(String[] args) throws IOException {
        //new KonkrOsztaly().metodus();
        //KonkrOsztaly objektum = new KonkrOsztaly();
        //objektum.metodus();
        
        /* IDE által ELLENŐRZÖTT kivétel */
        
        /* Tovább adjuk */
        //new FileIO().beolvas();
        
        /* Helyben kezeltük */
//        try {
//            new FileIO().beolvas();
//        } catch (IOException ex) {
//            //Logger.getLogger(KivetelKezeles.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println("Baj van!");
//            System.out.println(ex.getMessage());
//        }

        /* NEM ELLENŐRZÖTT kivétel */
        new Muvelet().szamol("a");
        
    }
    
}
