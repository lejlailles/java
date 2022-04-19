package gyakorlo.azonosszemelyek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AzonosSzemelyek {
    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("adatok.txt"));
        
        List<Szemely> szemelyek = new ArrayList<>();
        for (String sor : sorok) {
            szemelyek.add(new Szemely(sor));
        }
        
        Set<Szemely> kulEmberek = new HashSet<>(szemelyek);
        int db = kulEmberek.size();
        System.out.println("név és cím alapján kül.emeberek:");
        System.out.println(db + " fő\n" + kulEmberek);
    }
}
