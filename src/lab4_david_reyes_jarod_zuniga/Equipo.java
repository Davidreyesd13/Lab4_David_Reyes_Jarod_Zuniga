package lab4_david_reyes_jarod_zuniga;

import java.util.ArrayList;

public abstract class Equipo {
    private String casa;
    private int cpg;
    private int cpp;
    ArrayList<Jugadores> lista;
    private String capitan;

    public Equipo(String casa, int cpg, int cpp, ArrayList<Jugadores> lista, String capitan) {
        this.casa = casa;
        this.cpg = cpg;
        this.cpp = cpp;
        this.lista = lista;
        this.capitan = capitan;
        
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

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
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

    public abstract int cpg();
    public abstract int cpp();
    
    
}
