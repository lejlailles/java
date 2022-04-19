package kiralynokoop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Feladatok {
    private Tabla tabla;

    public Feladatok() throws IOException {
        this('#');
    }
    
    public Feladatok(char jel) throws IOException {
        tabla = new Tabla(jel);
        f4();
        f6();
        f9();
        fajlbaIr64Tablat();
    }
    
    public void f4(){
        System.out.println("4. feladat: az üres tábla:");
        System.out.println(tabla.megjelenit());
    }
    
    public void f6(){
        System.out.println("6. feladat: a feltöltött tábla:");
        tabla.elhelyez(8);
        System.out.println(tabla.megjelenit());
    }
    
    public void f9(){
        System.out.println("9. feladat: üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tabla.uresOszlopokSzama());
        System.out.println("sorok: " + tabla.uresSorokSzama());
    }
    
    public static void fajlbaIr64Tablat() throws IOException{
        fajlbaIr64Tablat('*');
    }
    
    public static void fajlbaIr64Tablat(char jel) throws IOException{
        //tabla = new Tabla('#');
        String fn = "tablak64.txt";
        Path path = Paths.get(fn);
        if(Files.exists(path)){
            Files.delete(path);
        }
        //String ki = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 64; i++) {
            Tabla t = new Tabla(jel);
            t.elhelyez(i);
            //ki += t.megjelenit();
            sb.append(t.megjelenit());
        }
        
        //Files.write(path, ki.getBytes());
        Files.write(path, sb.toString().getBytes());
        
        System.out.printf("10. feladat: A \"%s\" elkészült!\n", fn);
    }
}
