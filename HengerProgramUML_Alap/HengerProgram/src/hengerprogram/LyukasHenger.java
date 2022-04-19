package hengerprogram;

public class LyukasHenger extends TomorHenger{
    
    private double falvast;

    public LyukasHenger(double r, double m, double falvast) {
        this(r, m, falvast, 1);
    }

    public LyukasHenger(double r, double m, double falvast, double fajsuly) {
        super(r, m, fajsuly);
        this.falvast = falvast;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double terfogat() {
        return super.terfogat(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
