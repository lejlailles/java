package sajathierarchia;
public class PolimorfItfHierarchia {
    public static void main(String[] args) {
        SokSzog sokszog = new SokSzog("Sokszög-1");
        HaromSzog hszog = new HaromSzog("Háromszög-1");
        Alakzat[] alakzatok = {sokszog, hszog, new Kor("Kör-1"), new HaromDKor("3D Kör-1")};
        
        System.out.println("Alakzatok:");
        for (Alakzat alakzat : alakzatok) {
            alakzat.rajzol();
        }
        
        System.out.println("\nPontokkal rendelkeznek:");
        Kor k = new Kor("Kör-2");
        //((IPontjaiVannak)k).pontok();//ClassCastException
        for (Alakzat alakzat : alakzatok) {
            if(alakzat instanceof IPontjaiVannak){
                System.out.printf("%s %d pontja van\n",alakzat.nev, ((IPontjaiVannak) alakzat).pontok());
            }
        }
        
        System.out.println("\n3D-ben renderelhető alakzatok:");
        for (Alakzat alakzat : alakzatok) {
            if(alakzat instanceof IRajzol3D){
                System.out.printf("%s\n",alakzat.nev);
            }
        }
    }
}
