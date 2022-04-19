package hengerprogram;

public class MertaniHenger {
    private static int hengerDb = 0;
    
    private double r, m;

    public MertaniHenger(double r, double m) {
        this.r = r;
        this.m = m;
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    public double getR() {
        return r;
    }

    public double getM() {
        return m;
    }

    public double terfogat(){
        return 0;
    }
    
    @Override
    public String toString() {
        return "MertaniHenger{" + "r=" + r + ", m=" + m + '}';
    }
    
}
