package lab4_david_reyes_jarod_zuniga;

public class Golpeadores extends Jugadores {

    private double fuerza = 0;
    private double agilidad = 0;

    public Golpeadores(String nombre, double peso, double musculatura, double reflejos, String pos, String capitan) {
        super(nombre, peso, musculatura, reflejos, pos, capitan);

    }

    public double getAgilidad() {
        return agilidad;
    }

    @Override
    public double peso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Musculatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Reflejos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        fuerza = (Musculatura() * 2) - 7;
    }

    public void setAgilidad(double agilidad) {
        agilidad = Reflejos() + 7;
    }

}
