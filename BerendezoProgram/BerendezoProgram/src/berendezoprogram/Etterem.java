package berendezoprogram;

import java.util.ArrayList;

public class Etterem {
    private int maxAsztalDb;
    private ArrayList<Asztal> asztalLista;

    /* VIGYÁZAT: ez referencia, ezen
    keresztül tudjuk módosítani az asztalLista
    adattagot, olyan, mintha public lenne*/
    public ArrayList<Asztal> getAsztalLista() {
        return asztalLista;
    }
    
    public Etterem(int maxAsztalDb) {
        if(maxAsztalDb < 1) {maxAsztalDb = 1;}
        this.maxAsztalDb = maxAsztalDb;
        
        asztalLista = new ArrayList<>();
    }
    
    public void ujAsztal(Asztal asztal){
        if(asztalLista.size() < maxAsztalDb){
            asztalLista.add(asztal);
            System.out.println("új asztal felvéve!");
        }else{
            System.out.println("nem fér el több asztal!");
        }
    }
    
    public void megterit(int index){
        asztalLista.get(index).megterit();
    }
    
    public void megteritMind(){
        int db = asztalLista.size();
        for (int i = 0; i < db; i++) {
            megterit(i);
        }
        //vagy:
        for (Asztal asztal : asztalLista) {
            asztal.megterit();
        }
    }
    
    public void asztalokAllapota(){
        for (Asztal asztal : asztalLista) {
            System.out.println(asztal);
        }
    }
}
