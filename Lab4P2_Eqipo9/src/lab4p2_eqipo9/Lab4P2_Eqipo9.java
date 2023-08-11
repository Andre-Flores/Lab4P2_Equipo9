
package lab4p2_eqipo9;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_Eqipo9 {

static Scanner leer = new Scanner(System.in);//para enteros
static Scanner leer2 = new Scanner(System.in);//para strings
static ArrayList<Entrenador> entrenadores = new ArrayList();
static ArrayList<pokemon> caja = new ArrayList();

    public static void main(String[] args) {
        
        System.out.println("---Menu de Pokemon---");
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1.Registrar entrenador\n"
                    + "2.Battle factory\n"
                    + "3.Capturar/Entrenar\n"
                    + "4.Anadir movimento\n"
                    + "5. salir");
            System.out.println("Ingrese la opcion: \n");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregar_entrenador();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    agregar_movimiento();
                    break;
                case 5: 
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("La opcion ingresada es invalida");
                    break;
            }

        }//fin while
    }
    
    public static void agregar_movimiento() {
        movimiento[] movimiento = new movimiento[4];

        System.out.println("Ingrese el tipo de movimiento [1.Estado\n2.Fisico\n3.Especial]");
        int tipo = leer2.nextInt();
        if (tipo == 1) {
            System.out.println("Ingrese el nombre del movimiento: ");
            String nombre = leer2.nextLine();
            System.out.println("Ingrese la descripcion del movimiento: ");
            String descripcion = leer2.nextLine();
            System.out.println("Ingrese el problema de estado que afecta al rival: ");
            String problema_estado = leer2.nextLine();
            movimiento[0] = new estado(problema_estado, nombre, descripcion);

        } else if (tipo == 2) {
            System.out.println("Ingrese el nombre del movimiento: ");
            String nombre = leer2.nextLine();
            System.out.println("Ingrese la descripcion del movimiento: ");
            String descripcion = leer2.nextLine();
            System.out.println("Ingrese los puntos de poder");
            int puntos_poder = leer.nextInt();
            System.out.println("Ingrese los puntos de precision");
            int puntos_precision = leer.nextInt();
            movimiento[0] = new fisico(puntos_poder, puntos_precision, nombre, descripcion);

        } else if (tipo == 3) {
            System.out.println("Ingrese el nombre del movimiento: ");
            String nombre = leer2.nextLine();
            System.out.println("Ingrese la descripcion del movimiento: ");
            String descripcion = leer2.nextLine();
            System.out.println("Ingrese los puntos de poder");
            int puntos_poderE = leer.nextInt();
            System.out.println("Ingrese los puntos de precision");
            int puntos_precisionE = leer.nextInt();
            movimiento[0] = new especial(puntos_poderE, puntos_precisionE, nombre, descripcion);


        }
    }
    
    public static void agregar_pokemon() {
        movimiento[] movimiento = new movimiento[4];

        System.out.println("ingrese la especie: ");
        String especie = leer2.nextLine();
        System.out.println("ingrese el nivel del pokemon: ");
        int nivel = leer.nextInt();
        System.out.println("Ingrese los puntos de experiencia: ");
        int puntos_xp = leer.nextInt();

        System.out.println("Ingrese los puntos de vida: ");
        int hp = leer.nextInt();
        System.out.println("Ingrese el ataque: ");
        int atk = leer.nextInt();
        System.out.println("Ingrese la defensa: ");
        int def = leer.nextInt();
        System.out.println("Ingrese el especial: ");
        int sp= leer.nextInt();
        System.out.println("Ingrese la velocidad del pokemon: ");
        int spe = leer.nextInt();
        System.out.println("Ingrese el estado actual: ");
        String estado = leer2.nextLine();
         caja.add(new pokemon(especie, nivel, puntos_xp, hp, atk, def, sp, spe, estado));
        
    }
    public static void agregar_entrenador() {
        System.out.println("Ingrese el nombre del entrenador: ");
        String nombre = leer2.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el dinero en la cuenta: ");
        int dinero = leer.nextInt();
        System.out.println("---pokemones del entrenador---");
        agregar_pokemon();
        entrenadores.add(new Entrenador(nombre, edad, dinero));

    }
}
