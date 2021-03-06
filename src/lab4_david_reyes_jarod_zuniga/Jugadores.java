package lab4_david_reyes_jarod_zuniga;

public abstract class Jugadores {

    private String nombre;
    private double peso;
    private double musculatura;
    private double reflejos;
    private String pos;
    private String capitan;

    public Jugadores() {
    }

    public Jugadores(String nombre,double peso, double musculatura, double reflejos, String pos,String capitan) {
        this.nombre = nombre;
        this.peso = peso;
        this.musculatura = musculatura;
        this.reflejos = reflejos;
        this.pos = pos;
        this.capitan = capitan;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(double musculatura) {
        this.musculatura = musculatura;
    }

    public double getReflejos() {
        return reflejos;
    }

    public void setReflejos(double reflejos) {
        this.reflejos = reflejos;
    }
    public abstract double peso();
    public abstract double Musculatura();
    public abstract double Reflejos();
    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", peso=" + peso + ", musculatura=" + musculatura + ", reflejos=" + reflejos + ", pos=" + pos + ", capitan=" + capitan + '}';
    }

  

}
