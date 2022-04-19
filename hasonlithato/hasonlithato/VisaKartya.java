package hasonlithato;
public class VisaKartya extends Bankkartya{

    public VisaKartya(int egyenleg) {
        super(egyenleg);
    }

    @Override
    public String toString() {
        return super.toString() + " --> VisaKartya{" + '}';
    }

    
}
