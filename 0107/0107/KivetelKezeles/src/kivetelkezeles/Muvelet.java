package kivetelkezeles;
public class Muvelet {
    void szamol(String szam){
        int c;
        try {
            //NumberFormatException
            int a = Integer.parseInt(szam);
            int b = 1;
            c = a / b;
            System.out.println("eredmény: " + c);
        } catch(NumberFormatException | ArithmeticException ex){
            System.err.println("Hiba történt: ");
            System.err.println(ex.getMessage());
        }
//        } catch (NumberFormatException nx) {
//            System.err.println("A paraméter nem szám!");
//            System.err.println(nx.getMessage());
//        } catch(ArithmeticException ax){
//            System.err.println("A 0 nem lehet osztó!");
//            System.err.println(ax.getMessage());
//            /* volt vmi hiba, nem feltételn kell törekedni 
//            a helyes működésre
//            */
//            //c = 0;
//            //System.out.println("eredmény: " + c);
//        }
    }
}
