package bejarhato;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Nevsor ns = new Nevsor();
        
        /* PROBLÉMÁK */
        /* setter lett a getterből */
//        ArrayList<Ember> lista = ns.getLista();
//        for (Ember ember : lista) {
//            System.out.println(ember);
//        }
        
            //az eredeti private listát is módosítja!!!!
//        lista.set(0, new Ember("Xénia", 30));
//        
//        lista = ns.getLista();
//        for (Ember ember : lista) {
//            System.out.println(ember);
//        }
        
        /* MEGOLDÁSOK */
        //nem módosítható listát kapunk
        List<Ember> lista = ns.getUnModLista();
        for (Ember ember : lista) {
            System.out.println(ember);
        }
        
        /* kivételt kapunk a módosítás során */
        //lista.set(0, new Ember("Xénia", 30));//nsupportedOperationException
        
        //nem látjuk a belső adatszerkezet reprezentációját
        Ember[] emberek = ns.getEmberek();
        for (Ember ember : emberek) {
            System.out.println(ember); 
        }
        
        System.out.println("\n másolat:");
        /* másolatot adunk vissza */
        lista = ns.getMasolatLista();
        for (Ember ember : lista) {
            System.out.println(ember);
        }
        
        System.out.println("\n[0] = Xénia");
        lista.set(0, new Ember("Xénia", 30));
        
        lista = ns.getMasolatLista();
        for (Ember ember : lista) {
            System.out.println(ember);
        }
        
        //bejárhatóvá tesszük az tároló -Nevsor- osztályt
        System.out.println("\nbejárható névsor:");
        for (Ember ember : ns) {
            System.out.println(ember);
        }
        
        System.out.println("\nelemek elérése:");
        Iterator it = ns.iterator();
        Ember e = (Ember)it.next();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("első ember: " + e);
    }
}
