package lab4_david_reyes_jarod_zuniga;

public class Errorcapa8 extends Exception {
    private String casa1;
    private String casa2;

    public Errorcapa8() {
    }

    public Errorcapa8(String casa1, String casa2) {
        this.casa1 = casa1;
        this.casa2 = casa2;
    }
    public void error() throws Errorcapa8{
        throw new Errorcapa8();
        
    }
    public String getCasa1() {
        return casa1;
    }

    public void setCasa1(String casa1) {
        this.casa1 = casa1;
    }

    public String getCasa2() {
        return casa2;
    }

    public void setCasa2(String casa2) {
        this.casa2 = casa2;
    }
    
    @Override
    public String toString() {
        return "Errorcapa8{" + "No hay equipos"+ '}';
    }
    
}
