
package lab4p2_eqipo9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JD
 */
 
public class estado extends movimiento {
    Scanner leer = new Scanner(System.in);
    
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

    
    public int ataque(pokemon poke1, pokemon poke2) {
        Random ran = new Random();
        
        int num=1+ran.nextInt(100);
        
        // la validadcion debe ser en el main
        return num;
        
    }
    
  
   
}
