package gyakorlo.rendezettszemelyek;

public class Szemely implements Comparable<Szemely>{
    private String nev, cim;
    private int kor;

    //Péter;Bp;33
    public Szemely(String sor){
        //this(sor.split(";")[0], sor.split(";")[1], Integer.parseInt(sor.split(";")[2]));
        String[] s = sor.split(";");
        this.nev = s[0];
        this.cim = s[1];
        this.kor = Integer.parseInt(s[2]);
    }
    
    public Szemely(String nev, String cim, int kor) {
        this(nev + ";" + cim + ";" + kor);
//        this.nev = nev;
//        this.cim = cim;
//        this.kor = kor;
    }

    public String getNev() { return nev; }
    public String getCim() { return cim; }
    public int getKor() { return kor; }

    @Override
    public String toString() {
        return "Szemely{" + "nev=" + nev + ", cim=" + cim + ", kor=" + kor + '}';
    }

    @Override
    public int compareTo(Szemely t) {
       return this.kor - t.kor;
    }
    
    
}
