package gyariinterface;
public class Ember implements Comparable<Ember>{
    
    public static NevComparator RendezNev(){
        return new NevComparator();
    }
    
    public static CimComparator RendezCim(){
        return new CimComparator();
    }
    
    private String nev, cim;
    private int szulEv;

    public Ember(String nev, String cim, int szulEv) {
        this.nev = nev;
        this.cim = cim;
        this.szulEv = szulEv;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public int getSzulEv() {
        return szulEv;
    }

    
    
    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + ", szulEv=" + szulEv + '}';
    }

    @Override
    public int compareTo(Ember masik) {
        /* számokra */
        //1:
//        if(this.szulEv > masik.szulEv){
//            return 1;
//        }else if(this.szulEv < masik.szulEv){
//            return -1;
//        }else{
//            return 0;
//        }
        
        //2:
        return this.szulEv - masik.szulEv;
        
        /* NEM számokra */
        //névre, sem 1. sem 2. módszer nem jó
        //return this.nev - masik.nev;
        //return this.nev.compareTo(masik.nev);
    }
}
