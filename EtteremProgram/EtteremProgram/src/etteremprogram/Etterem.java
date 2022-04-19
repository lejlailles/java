package etteremprogram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Etterem {
    private ArrayList<Etel> etlap;
    private ArrayList<Asztal> asztalLista;

    public Etterem() throws IOException {
        etlap = new ArrayList<>();
        asztalLista = new ArrayList<>();
        beolvas();
    }
    
    private void beolvas() throws IOException{
        List<String> sorok = Files.readAllLines(Paths.get("etelek.txt"));
        for (String sor : sorok) {
            etlap.add(new Etel(sor));
        }
        
        sorok = Files.readAllLines(Paths.get("asztalok.txt"));
        boolean szin = true;
        Asztal asztal = null;
        for (String sor : sorok) {
            if(szin){
                asztal = new Asztal(sor);
                asztalLista.add(asztal);
                szin = false;
            }else if(!sor.isEmpty()){
                Etel etel = eteltKeres(sor);
                asztal.ujEtel(etel);
            }else{
                szin = true;
                
            }
        }
    }

    private Etel eteltKeres(String etelNev) {
        int i = 0, N = etlap.size();
        while(i < N && !(etlap.get(i).getNev().equals(etelNev))){
            i++;
        }
        if(i < N){
            return etlap.get(i);
        }else{
            return new Etel();
            //return null;//ez veszélyes! Bármikor NullPointerException
        }
    }

    @Override
    public String toString() {
        String ki = "";
        
        for (Asztal asztal : asztalLista) {
            ki += asztal + "\n";
        }
        
        return ki;
    }
    
    
}
