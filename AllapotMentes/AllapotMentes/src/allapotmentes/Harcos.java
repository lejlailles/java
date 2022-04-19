package allapotmentes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Harcos implements Serializable{
    
    /* osztály (static) dolgai nem szerializálódnak */
    private static Random rnd = new Random();
    private static final long serialVersionUID = 3L;
    
    /* láthatóságtól függetlenül minden szerializálódik */
    private String nev;
    private int arany;
    private ArrayList<String> felszereles;
    
    /* kényes vagy generált adatokat nem akarunk szerializálni */
    transient private UUID id;// = UUID.randomUUID();

    public Harcos(){
        this("");
        /* hogy ne legyen kódduplikálás: */
        arany = 0;
        
//        nev = "";//"." vagy "nincs neve"
//        arany = 0;
//        felszereles = new ArrayList<>();
//        //id = 1;
    }
    
    public Harcos(String nev) {
        this.nev = nev;
        arany = rnd.nextInt(10)+1; //3;
        felszereles = new ArrayList<>();
        //id = 1;
        ujId();
    }
    
    public void ujId() {
        id = UUID.randomUUID();
    }
    
    public void felvesz(String targy){
        felszereles.add(targy);
    }
    
    @Override
    public String toString() {
        String felsz = "", sep = System.lineSeparator();
        for (String f : felszereles) {
            felsz += sep + "\t" + f;
        }
        return "Harcos{" + "nev=" + nev + ", arany=" + arany 
                + sep + "felszereles:" + felsz 
                + sep + "ID: " + id
                + sep + '}';
    }
    
    /* biztonságos getterek, ha kell setterek... */

    
}
