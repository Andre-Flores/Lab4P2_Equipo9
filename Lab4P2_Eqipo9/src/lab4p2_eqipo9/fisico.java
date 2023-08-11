
package lab4p2_eqipo9;

import java.util.Random;

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

    
    public int ataque(pokemon poke1, pokemon poke2) {
        
        Random ran = new Random();
        
        int num = 1+ran.nextInt(50);
        // hay que validar cual es el pokemon mas rapido 
        if(poke1.getAtk()>poke2.getDef()){
            num=num*2;
        }
        if(poke1.getAtk()<poke2.getDef()){
            num=num/2;
        }
        if(poke1.getAtk()==poke2.getDef()){
            num=num-poke2.getHp();
        }
        
        return num;
    }
}
