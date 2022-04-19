package sutes;

import java.io.IOException;

public class Suto {
    boolean bekapcsolva;

    public boolean isBekapcsolva() {
        return bekapcsolva;
    }

    public void setBekapcsolva(boolean bekapcsolva) {
        this.bekapcsolva = bekapcsolva;
    }

    @Override
    public String toString() {
        return "Suto{" + "bekapcsolva=" + bekapcsolva + '}';
    }
    
    void sut() throws IOException{
        if(Math.random() < .5){
            System.out.println("Minden rendben, a süti elkészült");
        }else{
            throw new IOException();
        }
    }
}
