package sutes;

import java.io.IOException;

public class Suto {
    private boolean bekapcsolva;

    public boolean isBekapcsolva() {
        return bekapcsolva;
    }

    public void setBekapcsolva(boolean bekapcsolva) {
        this.bekapcsolva = bekapcsolva;
    }

    public void sut() throws IOException{
        if(Math.random() < .5){
            System.out.println("minden rendben, kész a süti!");
        }else{
            throw new IOException();
        }
    }
    
    @Override
    public String toString() {
        return "Suto{" + "bekapcsolva=" + bekapcsolva + '}';
    }
    
    
}
