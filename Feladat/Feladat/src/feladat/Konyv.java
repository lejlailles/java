package feladat;

import java.util.Objects;

public class Konyv implements Cloneable{
    private String cim, szerzo;

    public Konyv(String nev, String szerzo) {
        this.cim = nev;
        this.szerzo = szerzo;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String nev) {
        this.cim = nev;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }
    
    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + ", szerzo=" + szerzo + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.cim);
        hash = 41 * hash + Objects.hashCode(this.szerzo);
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
        final Konyv other = (Konyv) obj;
        if (!Objects.equals(this.cim, other.cim)) {
            return false;
        }
        if (!Objects.equals(this.szerzo, other.szerzo)) {
            return false;
        }
        return true;
    }
    
    
}
