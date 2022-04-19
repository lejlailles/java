package kivetelkezeles;
public class Muveletek {
    public void szamol(String szam){
        int c = 0;
        try {
            int a = Integer.parseInt(szam);
            int b = 0;
            c = a / b;
            System.out.println("eredmény: " + c);
        } 
        
        catch (NumberFormatException | ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
//        catch (NumberFormatException ex) {
//            System.err.println("a paramáter nem szám!");
//            /* itt már valami hiba van, itt ne akarjuk
//             a helyes eredményt megjeleníteni!!!
//            */
//            //System.out.println("eredmény: " + c);
//            System.out.println(ex);
//            System.out.println(ex.getMessage());
//        }
//        catch (ArithmeticException ax){
//            System.err.println("az osztó nem lehet 0!");
//            System.out.println(ax.getMessage());
//        }
    }
}
