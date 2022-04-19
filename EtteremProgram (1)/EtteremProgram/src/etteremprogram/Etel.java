package etteremprogram;
public class Etel {
    private String nev;
    private int ar;

    public Etel(String sor) {
        String[] s = sor.split("\\|");
        this.nev = s[0];
        this.ar = Integer.parseInt(s[1]);
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }
    
    
}
