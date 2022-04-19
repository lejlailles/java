package staticmukodes;
/* Debugerrel követhető */
public class StaticMukodes {
    static int staticInt;
    static{
        staticInt = 100;
    }
    
    static void staticHibasSetter(){
        //az osztály (statci) nem éri el a példányt!
        //this.peldanyInt = 13;//HIBA!
    }
    
    
    int peldanyInt;

    public StaticMukodes(int peldanyInt) {
        this.peldanyInt = peldanyInt;
        staticInt = 125;//példány eléri a static-ot
    }

    public static void main(String[] args) {
        int temp = 7;
        StaticMukodes m1 = new StaticMukodes(10);
        StaticMukodes m2 = new StaticMukodes(-15);
        
        StaticMukodes.staticInt = -5;
    }
}
