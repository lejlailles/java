package enumhasznalat;

public class Zaszlo {
    //private String szin;
    private SzinFajtak szin;
    
    public Zaszlo(SzinFajtak szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return "Zaszlo{" + "szin=" + szin + '}';
    }
}
