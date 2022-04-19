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
        //String ki = szin;
        //ki += "\n-------------------\n";
        StringBuilder sb = new StringBuilder(szin);
        //sb.append("\n-------------------------\n");
        String sep = "\n" + separator('-', 25);
        sb.append(sep);
        
        int osszAr = 0;
        for (Etel etel : etelLista) {
            int ar = etel.getAr();
            //ki += etel.getNev() + ar + " Ft\n";
            int h = 15;//leghosszabb nevű étel hossza
            sb.append(String.format("%"+h+"s %5d Ft\n", etel.getNev(), ar));
            osszAr += ar;
        }
        
        //ki += "====================\n";
        //ki += "Összesen: " + osszAr + " Ft\n";
        
        sb.append(separator('=', 25));
        sb.append(String.format("%15s %5d Ft\n", "Összesen:", osszAr));
        
        return sb.toString();
    }

    private String separator(char jel, int hossz) {
        return separator(jel, true, hossz);
    }
    
    private String separator(char jel, boolean sortores, int hossz) {
        String s = "";
        for (int i = 0; i < hossz; i++) {
            s += jel;
        }
        return sortores ? s + "\n" : s;
    }
    
    
    
}
