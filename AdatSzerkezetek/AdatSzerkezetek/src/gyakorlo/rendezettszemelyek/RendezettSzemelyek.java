package gyakorlo.rendezettszemelyek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RendezettSzemelyek {
    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("adatok.txt"));
        
        List<Szemely> szemelyek = new ArrayList<>();
        for (String sor : sorok) {
            szemelyek.add(new Szemely(sor));
        }
        
        System.out.println("kor szerint növ. rendezve:");
        Collections.sort(szemelyek);
        for (Szemely szemely : szemelyek) {
            System.out.println(szemely);
        }
        
        System.out.println("\nkor szerint csökk. rendezve:");
        Collections.sort(szemelyek, Collections.reverseOrder());
        for (Szemely szemely : szemelyek) {
            System.out.println(szemely);
        }
    }
}
