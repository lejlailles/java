package kiralynokoop;

import java.util.Random;
//1
public class Tabla {
    private static Random rnd = new Random();
    
   //2
    private char[][] T;
    private char uresCella;
    
    //3
    public Tabla(char uresCella) {
        //a
        T = new char[8][8];
        //b
        this.uresCella = uresCella;
        //c
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = uresCella;
            }
        }
    }
    
    //4
    //public void megjelenit(){
    public String megjelenit(){//10-hez
        String ki = "";
        for (char[] cs : T) {
            for (char c : cs) {
                //System.out.print(c + "");
                ki += c + "";
            }
            //System.out.println("");
            ki += "\n";
        }
        //System.out.println("");
        ki += "\n";
        
        return ki;
    }
    
    //5
    public void elhelyez(int N){
        int jo = 0;
        while(jo < N){
            int sor = rnd.nextInt(8);
            int oszl = rnd.nextInt(8);
            if(T[sor][oszl] != 'K'){
                T[sor][oszl] = 'K';
                jo++;
            }
        }
    }
    
    //7
    public boolean uresOszlop(int oszlop){
        int i = 0, N = T.length;
        
        while(i < N && !(T[i][oszlop] == 'K')){
            i++;
        }
        return i >= N;
    }
    
    public boolean uresSor(int sor){
        int i = 0, N = T.length;
        
        while(i < N && !(T[sor][i] == 'K')){
            i++;
        }
        return i >= N;
    }
    
    //8
    public int uresOszlopokSzama(){
        int db = 0;
        for (int i = 0; i < 8; i++) {
            if(uresOszlop(i)){
                db++;
            }
        }
        return db;
    }
    
    public int uresSorokSzama(){
        int db = 0;
        for (int i = 0; i < 8; i++) {
            if(uresSor(i)){
                db++;
            }
        }
        return db;
    }
}
