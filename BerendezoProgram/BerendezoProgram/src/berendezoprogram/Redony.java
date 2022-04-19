package berendezoprogram;

import javax.swing.JOptionPane;

public class Redony {
    /* ADATTAGOK */
    private int szel, maxHossz, aktHossz;
    private boolean zart;
    
    /* KONSTRUKTOR */
    public Redony(int szel, int maxHossz) {
        this.szel = szel;
        this.maxHossz = maxHossz;
        aktHossz = 0;
        zart = true;
    }
    
    /* GETTER */
    public int getSzel(){return szel;}
    public int getMaxHossz(){return maxHossz;}
    public int getAktHossz(){return aktHossz;}
    public boolean isZart(){return zart; }
    
    /* SETTER */
    public void leenged(){ leenged(maxHossz);}
    
    public void leenged(int aktHossz){
        if(aktHossz > maxHossz){ aktHossz = maxHossz;}
        this.aktHossz = aktHossz;
    }
    
    public void felhuz(){ aktHossz = 0; }
    
    public void fenytNemEnged(boolean zart){ this.zart = zart; }
    
    /* SAJÁT */
    public void rajzol(){
        egySor();
        System.out.println("");
        char jel = zart ? ' ' : '-';
        for (int i = 0; i < aktHossz; i++) {
            System.out.print("|");
            egySor(jel, szel-2);
            System.out.println("|");
        }
        egySor('*');
        System.out.println("");
    }

    private void egySor(){ egySor('_');}
    
    private void egySor(char jel) { egySor(jel, szel); }
    
    private void egySor(char jel, int hossz){
        for (int i = 0; i < hossz; i++) {
            System.out.print(jel);
        }
    }
    
    /* FELÜLÍRÁS */
    @Override
    public String toString() {
        return "Redony{" + "szel=" + szel + ", maxMag=" + maxHossz + ", leengedve=" + aktHossz + ", fényt NEM enged át=" + zart + '}';
    }

    
    
    
}
