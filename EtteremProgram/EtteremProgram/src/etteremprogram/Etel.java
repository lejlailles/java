package etteremprogram;
public class Etel {
    private String nev;
    private int ar;

    public Etel(){
        /* ha üres a String, akkor is lehetnek kivételek, 
        pl: getNev().charAt(0) -> StringIndexOutOfBoundsException
        */
        this("*kedvezmény", 0);
        /* egy olyan szót adok, ami megjelenhet a számlán, de a 0 Ft nem okoz gondot
         * azonban probléma lehet egy valódi kedvezménynél, ezért van * prefix
        */
    }
    
    public Etel(String nev, int ar){
        this(nev + "|" + ar);
    }
    
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
