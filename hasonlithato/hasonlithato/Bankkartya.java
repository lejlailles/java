package hasonlithato;

public abstract class Bankkartya implements Comparable<Bankkartya>{
    private int egyenleg;

    public Bankkartya(int egyenleg) { this.egyenleg = egyenleg; }
    public int getEgyenleg() { return egyenleg; }

    @Override
    public String toString() {
        return "Bankkartya{" + "egyenleg=" + egyenleg + '}';
    }

    @Override
    public int compareTo(Bankkartya t) {
        return this.egyenleg - t.egyenleg;
    }
    
    
}
