package egyenloseg;

import java.util.ArrayList;
import java.util.HashSet;

class Teglalap{
    private double a,b;
    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double terulet(){ return a*b;}

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b 
                + ", ter: " + terulet() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        //hash = 71 * hash + (int)this.terulet();//3.0-3.99999 azonos
        hash = 71 * hash + Double.hashCode(this.terulet());
//        hash = 71 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
//        hash = 71 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teglalap other = (Teglalap) obj;
        if(this.terulet() != other.terulet()){
            return false;
        }
//        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(other.a)) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(other.b)) {
//            return false;
//        }
        return true;
    }
    
    
}

public class Teglalapok {
    public static void main(String[] args) {
        /* Beépített típusok */
        HashSet<Integer> szamHalmaz = new HashSet<>();
        boolean siker;
        siker = szamHalmaz.add(3);
        System.out.println("3 hozzáadva: " + siker);
        
        siker = szamHalmaz.add(2);
        System.out.println("2 hozzáadva: " + siker);
        
        siker = szamHalmaz.add(3);
        System.out.println("3 hozzáadva: " + siker);
        
        siker = szamHalmaz.add(5);
        System.out.println("5 hozzáadva: " + siker);
        
        siker = szamHalmaz.add(2);
        System.out.println("2 hozzáadva: " + siker);
        
        siker = szamHalmaz.add(6);
        System.out.println("6. hozzáadva: " + siker);
        
        System.out.println("számok halmaza:\n" + szamHalmaz);
        
        /* Saját osztállyal */
        Teglalap t1 = new Teglalap(2, 3);
        Teglalap t2 = new Teglalap(1, 6);
        Teglalap t3 = new Teglalap(2, 1);
        ArrayList<Teglalap> teglaLista = new ArrayList<>();
        teglaLista.add(t1);
        teglaLista.add(t2);
        teglaLista.add(t3);
        
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        
        System.out.println("hc1: " + t1.hashCode());
        System.out.println("hc2: " + t2.hashCode());
        System.out.println("hc3: " + t3.hashCode());
        
        System.out.println("t1==t2: " + t1.equals(t2));
        System.out.println("t1==t3: " + t1.equals(t3));
        
        HashSet<Teglalap> teglaHalmaz = new HashSet<>(teglaLista);
        //teglaHalmaz.add(t3);
        int db = teglaHalmaz.size();
        System.out.printf("Téglalapok halmaza (%d):\n%s\n", db, teglaHalmaz);
    }
}
