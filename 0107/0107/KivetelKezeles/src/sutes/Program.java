package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {
    public static void main(String[] args) {
        SutiSutes suti = new SutiSutes();
        suti.sutes();
        //Suto suto = suti.getSuto();
        //System.out.println(suto);
        System.out.println(suti.getSutoAllapot());
        
        /*sajna a getter setterként működik
        referencia tyípusoknál!
        */
        //suto.setBekapcsolva(true);
        //System.out.println(suto);
        
//        Suto suto = new Suto();
//        try {
//            suto.setBekapcsolva(true);
//            suto.sut();
//            //suto.setBekapcsolva(false);
//        } catch (IOException ex) {
//            //Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println("Valami baj van...");
//            //suto.setBekapcsolva(false);
//        } finally{
//            suto.setBekapcsolva(false);
//        }
        
        
        //System.out.println(suto);
    }
}
