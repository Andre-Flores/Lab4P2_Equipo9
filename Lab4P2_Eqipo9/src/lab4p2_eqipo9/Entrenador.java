package lab4p2_eqipo9;

import java.util.ArrayList;

public class Entrenador {

    private String nombre;
    private int edad;
    private int dinero;
    private pokemon[] equipo = new pokemon[6];
    private ArrayList<pokemon> caja = new ArrayList();

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public pokemon[] getEquipo() {
        return equipo;
    }

    public void setEquipo(pokemon[] equipo) {
        this.equipo = equipo;
    }

    public ArrayList<pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<pokemon> caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", equipo=" + metodo() + ", caja=" + caja + '}';
    }
    
    public String metodo(){
        String sal="";
        for (int i = 0; i < equipo.length; i++) {
            sal+=equipo[i]+", ";
        }
        return sal;
    }
}
