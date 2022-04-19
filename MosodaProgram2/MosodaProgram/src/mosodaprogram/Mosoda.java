package mosodaprogram;

import java.util.ArrayList;

public class Mosoda {
    private ArrayList<Ruha> ruhaLista;
    private boolean mukodik;

    public Mosoda() {
        ruhaLista = new ArrayList<>();
        mukodik = true;
    }
    
    public void felvesz(Ruha ruha){
        ruhaLista.add(ruha);
    }
    
    public Ruha kiad(String tualjdonos){
        int i = 0;
        int N = ruhaLista.size();
        while(i < N && !(ruhaLista.get(i).getTulaj().equals(tualjdonos))){
            i++;
        }
        Ruha ruha = null;
        if(i < N){
            ruha = ruhaLista.remove(i);
        }
        
        return ruha;
    }
    
    private void mos(Ruha ruha){
        ruha.setTiszta(true);
    }
    
    public void mos(){
        if(mukodik){
            for (Ruha ruha : ruhaLista) {
                mos(ruha);
            }
        }else{
            System.out.println("A mosoda nem üzemel!");
        }
    }

    public void leeg(){
        ruhaLista.clear();
        mukodik = false;
    }
    
    @Override
    public String toString() {
        String ki = "";
        for (Ruha ruha : ruhaLista) {
            ki += ruha + "\n";
        }
        return ki;
    }
    
    
}
