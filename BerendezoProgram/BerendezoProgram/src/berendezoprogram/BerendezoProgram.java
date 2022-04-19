package berendezoprogram;

public class BerendezoProgram {

    public static void main(String[] args) { 
        System.out.println("Szoba:");
        Szoba szoba = new Szoba();
        szoba.asztaltMegterit();
        
        /* Ezt le sem írhatom UML szerint: */
        Redony r = new Redony(5,5);
        //r.rajzol();
        
        //szoba.ujRedony(r);
        szoba.redonytLeenged();
        
        //r.rajzol();
        
        szoba.ujRedony(new Redony(10,10));
        r.rajzol();//nem változott
        szoba.redonytRajzol();//a szobai le lett engedve
        
        System.out.println("Étterem:");
        Etterem etterem = new Etterem(3);
        etterem.ujAsztal(new Asztal(3,6));
        etterem.ujAsztal(new Asztal(3,6));
        etterem.ujAsztal(new Asztal(3,6));
        etterem.ujAsztal(new Asztal(3,6));
        
        System.out.println("--- nincs megterítve:");
        etterem.asztalokAllapota();
        System.out.println("--- 1. megterítve:");
        etterem.megterit(1);
        etterem.asztalokAllapota();
        System.out.println("--- Mind megterítve:");
        etterem.megteritMind();
        etterem.asztalokAllapota();
        
        /* A getter referencián keresztül 
        módosíthatom az osztály belső állapotát */
        //nem is vehetnék fel új asztalt!
        etterem.getAsztalLista().add(new Asztal(1,1));
        etterem.asztalokAllapota();
    }
    
}
