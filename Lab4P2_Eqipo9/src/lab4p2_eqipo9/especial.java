/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_eqipo9;


public class especial extends movimiento{
    private int puntos_poderE;
    private int puntos_precisionE;

    public especial() {
    }

    public especial(int puntos_poderE, int puntos_precisionE) {
        this.puntos_poderE = puntos_poderE;
        this.puntos_precisionE = puntos_precisionE;
    }

    public especial(int puntos_poderE, int puntos_precisionE, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.puntos_poderE = puntos_poderE;
        this.puntos_precisionE = puntos_precisionE;
    }

    public int getPuntos_poderE() {
        return puntos_poderE;
    }

    public void setPuntos_poderE(int puntos_poderE) {
        this.puntos_poderE = puntos_poderE;
    }

    public int getPuntos_precisionE() {
        return puntos_precisionE;
    }

    public void setPuntos_precisionE(int puntos_precisionE) {
        this.puntos_precisionE = puntos_precisionE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "especial{" + "puntos_poderE=" + puntos_poderE + ", puntos_precisionE=" + puntos_precisionE + '}';
    }
    
    
}
