package mosodaprogram;

public class Ruha {
    private String tulaj;
    private boolean tiszta;
    
    public Ruha(String tulaj) {
        this.tulaj = tulaj;
        tiszta = false;
    }

    public String getTulaj() {
        return tulaj;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    @Override
    public String toString() {
        return "Ruha{" + "tulaj=" + tulaj + ", tiszta=" + tiszta + '}';
    }
    
    
}
