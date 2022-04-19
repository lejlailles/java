package berendezoprogram;

/*HF:
rajzol elkészítése: ld. komment
szin és fajta enum legyen
a beállított színnel rajzolja ki 
*/

public class Asztal {
    private int szel, hossz;
    private String szin, fajta;
    private boolean megteritve;

    public Asztal(int szel, int hossz) {
        this(szel, hossz, "fehér");
    }

    public Asztal(int szel, int hossz, String szin) {
        this(szel, hossz, szin, "fenyő");
    }

    public Asztal(int szel, int hossz, String szin, String fajta) {
        this.szel = szel;
        this.hossz = hossz;
        this.szin = szin;
        this.fajta = fajta;
        megteritve = false;
    }

    /* GETTER */
    public int getSzel() { return szel; }
    public int getHossz() { return hossz; }
    public String getSzin() { return szin; }
    public String getFajta() { return fajta; }
    public boolean isMegteritve() { return megteritve; }
    
    /* SETTER */
    public void atfest(String szin){ this.szin = szin; }
    public void megterit(){
        megteritve = true;
        System.out.println("asztal megterítve");
    }
    
    public void leszed(){
        megteritve = false;
        System.out.println("Asztal leszedve");
    }
    
    /* SAJÁT */
    public void rajzol(){
        /* felülnézetben az asztal lapját kell kirajzolni,
        pl szel:3, hossz:4
        ha nincs megterítve: 
        ----
        |  |
        |  |
        ----
        ha meg van terítve:
        ----
        |OO|
        |OO|
        ----
        */
    }
    
    /* FELÜLÍRT */
    @Override
    public String toString() {
        return "Asztal{" + "szel=" + szel + ", hossz=" + hossz + ", szin=" + szin + ", fajta=" + fajta + ", megteritve=" + megteritve + '}';
    }
    
}
