package kivetelkezeles;

import java.io.IOException;

public class KivetelKezeles {
    public static void main(String[] args) throws IOException {
        
        /* Ellenőrzött -JAVA IDE által- kivételek: */
        
        // UnsupportedOperationException
            //new KonkrOsztaly().abstrMet();
        /* helyben: */
        /*try {    
        // NoSuchFileException    
            new FileIO().beolvas();
        } catch (IOException ex) {
            //Logger.getLogger(KivetelKezeles.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("out: Valami hiba történt...");
            System.err.println("err: Valami hiba történt...");
        }*/
        
        /* tovább dobjuk... */
        //new FileIO().beolvas();
        
        /* NEM Ellenőrzött kivételek: */
        
        // NumberFormatException
        new Muveletek().szamol("4");
    }//main
    
}
