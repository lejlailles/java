package hasonlithato;

public class JuniorKartya extends Bankkartya{
    
    public JuniorKartya(int egyenleg) {
        super(egyenleg);
    }

    @Override
    public String toString() {
        return super.toString() + " --> JuniorKartya{" + '}';
    }
    
    
}
