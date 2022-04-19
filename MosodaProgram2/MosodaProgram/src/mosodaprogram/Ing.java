package mosodaprogram;

public class Ing extends Ruha{
    private double szinIntenzitas;

    public Ing(String tulaj) {
        super(tulaj);
        szinIntenzitas = 100.0;
    }

    @Override
    public String toString() {
        String ruha = super.toString();
        return ruha + "\n\t" +
                "Ing{" + "szinIntenzitas=" + szinIntenzitas + '}';
    }

    @Override
    public void setTiszta(boolean tiszta) {
        super.setTiszta(tiszta);
        szinIntenzitas *= .97;
    }
    
    
}
