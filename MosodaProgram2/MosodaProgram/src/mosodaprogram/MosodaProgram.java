package mosodaprogram;

public class MosodaProgram {

    public static void main(String[] args) {
        Ruha r = new Ruha("Péter");//ez nem fog leégni a mosodával együtt....
        Mosoda mosoda = new Mosoda();
        //mosoda.felvesz(new Ruha("Péter"));
        mosoda.felvesz(r);
        mosoda.felvesz(new Ing("Pál"));
        
        System.out.println("Mosoda ruhái:");
        System.out.println(mosoda);
        
        System.out.println("mosás után");
        System.out.println("Mosoda ruhái:");
        mosoda.mos();
        System.out.println(mosoda);
        mosoda.mos();
        System.out.println(mosoda);
        
        mosoda.leeg();
        mosoda.mos();
        System.out.println(mosoda);
        
        System.out.println("r: " + r);
        
//        
//        System.out.println("Péter kiveszi a ruhájá:");
//        System.out.println(mosoda.kiad("Péter"));
//        
//        System.out.println("Mosoda ruhái:");
//        System.out.println(mosoda);
    }
    
}
