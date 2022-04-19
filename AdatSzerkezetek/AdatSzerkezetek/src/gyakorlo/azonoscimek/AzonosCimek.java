package gyakorlo.azonoscimek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AzonosCimek {
    public static void main(String[] args) {
        try {
            List<String> sorok = Files.readAllLines(Paths.get("adatok.txt"));
            
//            String sor = sorok.get(2);
//            System.out.println(sor);
//            //Péter;Bp;33
//            //Szemely sz1 = new Szemely(nev, cim, 0);
//            Szemely sz1 = new Szemely(sor);
            
            ArrayList<Szemely> szemelyek = new ArrayList<>();
            for (String sor : sorok) {
                szemelyek.add(new Szemely(sor));
            }

            HashSet<String> cimek = new HashSet<>();
            for (Szemely szemely : szemelyek) {
                cimek.add(szemely.getCim());
            }

            System.out.println("Különböző címek:");
            System.out.println(cimek);
            
        } catch (IOException ex) {
            Logger.getLogger(AzonosCimek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
