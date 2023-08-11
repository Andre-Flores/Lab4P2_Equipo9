
package lab4p2_eqipo9;

/**
 *
 * @author JD
 */
public class fisico extends movimiento {

    private int puntos_poder;
    private int puntos_precision;

    public fisico() {
    }

    public fisico(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public fisico(int puntos_poder, int puntos__precision, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.puntos_poder = puntos_poder;
        this.puntos_precision = puntos_precision;
    }

    public int getPuntos_poder() {
        return puntos_poder;
    }

    public void setPuntos_poder(int puntos_poder) {
        this.puntos_poder = puntos_poder;
    }

    public int getPuntos__precision() {
        return puntos_precision;
    }

    public void setPuntos_precision(int puntos_precision) {
        this.puntos_precision = puntos_precision;
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
        return "fisico{" + "puntos_poder=" + puntos_poder + ", puntos_precision=" + puntos_precision + '}';
    }   
}
