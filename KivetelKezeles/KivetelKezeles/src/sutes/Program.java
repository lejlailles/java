package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {
    public static void main(String[] args) {
        Suto suto = new Suto();
        suto.setBekapcsolva(true);
        try {
            suto.sut();
            //suto.setBekapcsolva(false);
        } catch (IOException ex) {
            //Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Valami hiba történt...");
            //suto.setBekapcsolva(false);
        } finally{
            suto.setBekapcsolva(false);
        }
        
        
        System.out.println(suto);
    }
}
