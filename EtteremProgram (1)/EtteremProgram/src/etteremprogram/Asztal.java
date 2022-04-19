package etteremprogram;

import java.util.ArrayList;

public class Asztal {
    private String szin;
    private ArrayList<Etel> etelLista;

    public Asztal(String szin) {
        this.szin = szin;
        etelLista = new ArrayList<>();
    }

    public void ujEtel(Etel etel){
        etelLista.add(etel);
    }
    
    @Override
    public String toString() {
        String ki = szin;
        ki += "\n-------------------\n";
        
        int osszAr = 0;
        for (Etel etel : etelLista) {
            int ar = etel.getAr();
            ki += etel.getNev() + ar + " Ft\n";
            osszAr += ar;
        }
        
        ki += "====================\n";
        ki += "Összesen: " + osszAr + " Ft\n";
        
        return ki;
    }
    
    
    
}
