package masolhato;
public class Ember implements Cloneable{
    String nev;
    int kor;
    Ember barat;

    public Ember(String nev, int kor) {
        this(nev, kor, null);//lehetséges NullPointerException
        
        //this.nev = nev;
        //this.kor = kor;
    }
    
    public Ember(String nev, int kor, Ember barat) {
        this.nev = nev;
        this.kor = kor;
        this.barat = barat;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + ", barat=" + barat + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
    
}
