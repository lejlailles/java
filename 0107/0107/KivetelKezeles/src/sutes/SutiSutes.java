package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SutiSutes {
    private Suto suto;

    public SutiSutes() {
        suto = new Suto();
    }
    
    public void sutes(){
        suto.setBekapcsolva(true);
        try {
            suto.sut();
        } catch (IOException ex) {
            //Logger.getLogger(SutiSutes.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Valami baj van...");
        }finally{
            suto.setBekapcsolva(false);
        }
    }

    public String getSutoAllapot(){
        return suto.toString();
    }
    
    //Ez valójában egy getter
//    public Suto getSuto() {
//        return suto;
//    }
    
    
}
