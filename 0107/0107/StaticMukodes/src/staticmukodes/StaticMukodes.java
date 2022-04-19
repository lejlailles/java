package staticmukodes;
public class StaticMukodes {

    static int staticInt;// = 100;
    static{
        staticInt = 100;
    }
    
    static void hibasPeldanySetter(){
        //this.peldanyInt = 123;//hiba
    }
    
    int peldanyInt;

    public StaticMukodes(int peldanyInt) {
        this.peldanyInt = peldanyInt;
        staticInt = -50;
    }
    
    public static void main(String[] args) {
        StaticMukodes m1 = new StaticMukodes(3);
        StaticMukodes m2 = new StaticMukodes(-10);
    }
    
}
