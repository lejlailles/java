package sajathierarchia;
public class HaromDKor extends Kor implements IRajzol3D{

    public HaromDKor(String nev) {
        super(nev);
    }

    //a megörökölt metódust kicsit testre kell szabni
    @Override
    public void rajzol() {
        System.out.println("3D kör rajzolása 2D-ben");
    }

    
    
    @Override
    public void rajzol3D() {
        System.out.println("3D kör rajzolása");
    }
    
}
