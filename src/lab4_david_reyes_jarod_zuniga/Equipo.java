package lab4_david_reyes_jarod_zuniga;

import java.util.ArrayList;

public abstract class Equipo {
    private String casa;
    private int cpg;
    private int cpp;
    ArrayList<Jugadores> lista;

    public Equipo(String casa, int cpg, int cpp, ArrayList<Jugadores> lista) {
        this.casa = casa;
        this.cpg = cpg;
        this.cpp = cpp;
        this.lista = lista;
        
    }

    public int getCpg() {
        return cpg;
    }

    public void setCpg(int cpg) {
        this.cpg = cpg;
    }

    public int getCpp() {
        return cpp;
    }

    public void setCpp(int cpp) {
        this.cpp = cpp;
    }

    public ArrayList<Jugadores> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugadores> lista) {
        this.lista = lista;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
    public Equipo() {
        super();
    }

    @Override
    public String toString() {
        return "Equipo{" + "casa=" + casa + ", Cantidad de Partidos Ganados=" + cpg + ", Cantidad de partidos perdidos=" + cpp + ", lista=" + lista + '}';
    }
    
    
}
