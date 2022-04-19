package sajathierarchia;
public abstract class Alakzat {
    public String nev;

    public Alakzat(String nev) {
        this.nev = nev;
    }
    
    public abstract void rajzol();

    @Override
    public String toString() {
        return "Alakzat{" + "nev=" + nev + '}';
    }
}
