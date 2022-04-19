package allapotmentes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllapotMentes {
    public static void main(String[] args) {
        Harcos harcos = new Harcos("Kübli");
        harcos.felvesz("Fejsze");
        harcos.felvesz("Pajzs");
        
        System.out.println("A játék jelenlegi állása: ");
        System.out.println(harcos);
        
        mentes(harcos);
        System.out.println("\nKikapcsolom a gépet, de mentjük az állást!\n");
        harcos = null;
        
        System.out.println("A betöltött állás:");
        harcos = betolt();
        System.out.println(harcos);
        //harcos.felvesz("");
    }

    private static void mentes(Harcos harcos) {
        /* Lehetne Files osztály metódusaival a gettereket kiírni */

        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("harcos3.ser"))) {
            //FileOutputStream fajlKi = new FileOutputStream("harcos3.ser");
            //ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(harcos);
            /* aki try() ban van, az aut. lezáródik, nem kell explicit meghívni */
            //objKi.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println(ex);
            //Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static Harcos betolt() {
        Harcos harcos = new Harcos();// null;
        try (ObjectInputStream objKi = new ObjectInputStream(new FileInputStream("harcos3.ser"))) {
            //FileInputStream fajlKi = new FileInputStream("harcos3.ser");
            //ObjectInputStream objKi = new ObjectInputStream(fajlKi);
            //objKi.writeObject(harcos);
            harcos = (Harcos)objKi.readObject();
            harcos.ujId();
            //objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        }catch(InvalidClassException ex){
            System.err.println("Régi verzió nem kompatibilis az új verzióval!");
            System.err.println(ex.getMessage());
        } 
        catch (IOException ex) {
            System.err.println(ex);
            //Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AllapotMentes.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return harcos;
        }
    }
    
}
