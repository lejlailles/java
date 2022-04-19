package berendezoprogram;

public class Szoba {
    private Asztal asztal;
    private Redony redony;

    public Szoba() {
        this.asztal = new Asztal(3,5);
        this.redony = new Redony(2,4);
    }
    
    public void asztaltMegterit(){
        if(!asztal.isMegteritve()){
            asztal.megterit();
        }else{
            System.out.println("Az asztal már megterítve!");
        }
    }
    
    public void redonytLeenged(){
        redonytLeenged(redony.getMaxHossz());
    }
    
    public void redonytLeenged(int hossz){
        redony.leenged(hossz);
    }
    
    public void redonytRajzol(){
        redony.rajzol();
    }
    
    public void ujRedony(Redony redony){
        this.redony = redony;
    }
}
