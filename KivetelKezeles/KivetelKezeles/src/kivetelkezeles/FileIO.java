package kivetelkezeles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO {
    /* readAllLines dobhat kivételt, 
    valakinek kezelnie kell
    */
    public void beolvas() throws IOException{
        /* tovább dobjuk, majd kezeli a hívó */
        Files.readAllLines(Paths.get("nincsMeg.txt"));
        
        /* kezeljük helyben: */
        /*try {
            Files.readAllLines(Paths.get("nincsMeg.txt"));
        } catch (IOException ex) {
            //Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("out: Valami hiba történt...");
            System.err.println("err: Valami hiba történt...");
        }*/
    }
}
