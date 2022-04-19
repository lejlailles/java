package adatszerkezetek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Adatszerkezetek {
    public static void main(String[] args) {
        /* Saját osztálynál már kell további kód, a helyes működéshez */
       
        /* dinamikus méretű lista 
         * saját osztály rendezéshez Comparable implementálása
        */
        ArrayList<Integer> szamLista = new ArrayList<>();
        //sima foreach-el bejárható
        szamLista.add(3);
        szamLista.add(5);
        szamLista.add(3);
        szamLista.add(2);
        
        /* csak különbözőeket tároló halmaz 
         * saját osztály különbözőséghez hashCode és equals felül def.
        */
        HashSet<Integer> szamHalmaz = new HashSet<>(szamLista);
        //sima foreach-el bejárható
        
        /* kulcs érték párokat tartalmaz
         * asszociatív tömbnek is hívják
        */
        HashMap<String, Double> atlagok = new HashMap<>();
        atlagok.put("Péter", 3.85);
        atlagok.put("Pál", 4.30);
        atlagok.put("Pál", 4.30);//egyedei legyen a kulcs
        atlagok.put("Ede", 2.5);
        atlagok.put("Xénia", 4.58);
        
        for (Map.Entry<String, Double> entry : atlagok.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.printf("[%s] = %.2f\n", key, value);
        }
    }
}
