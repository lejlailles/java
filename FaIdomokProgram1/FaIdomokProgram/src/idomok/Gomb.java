package idomok;

public class Gomb extends FaIdom{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }

    @Override
    public double terfogat() {
        return 4 * Math.pow(sugar, 3) * Math.PI / 3;
    }

    @Override
    public int compareTo(FaIdom masik) {
        //return this.terfogat() - masik.terfogat();
        if(this.terfogat() < masik.terfogat()){return -1;}
        else if(this.terfogat() > masik.terfogat()){return 1;}
        else return 0;
    }

    

    

}
