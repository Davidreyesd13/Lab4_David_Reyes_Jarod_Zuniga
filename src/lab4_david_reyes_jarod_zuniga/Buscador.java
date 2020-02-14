package lab4_david_reyes_jarod_zuniga;

public class Buscador extends Jugadores{
    private double velocidadini=0;
    public Buscador(String nombre, double peso, double musculatura, double reflejos, String pos, String capitan) {
        super(nombre, peso, musculatura, reflejos, pos, capitan);
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

    public double getVelocidadini() {
        return velocidadini;
    }

    public void setVelocidadini(double velocidadini) {
        velocidadini = (200/peso())*7;
    }

    
   
    
}
