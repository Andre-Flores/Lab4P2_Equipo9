/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_eqipo9;

/**
 *
 * @author JD
 */
public class estado extends movimiento {

    String problema_estado;

    public estado(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public estado(String problema_estado, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.problema_estado = problema_estado;
    }

    public String getProblema_estado() {
        return problema_estado;
    }

    public void setProblema_estado(String problema_estado) {
        this.problema_estado = problema_estado;
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
        return "estado{" + "problema_estado=" + problema_estado + '}';
    }
    
}
