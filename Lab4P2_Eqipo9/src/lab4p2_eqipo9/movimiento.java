
package lab4p2_eqipo9;


public abstract class movimiento {

    String nombre;
    String descripcion;

    public movimiento() {
    }

    public movimiento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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
        return "movimiento{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    public abstract int ataque(pokemon poke1,pokemon poke2);
}
