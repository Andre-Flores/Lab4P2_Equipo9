
package lab4p2_eqipo9;

import java.util.Scanner;

public class Lab4P2_Eqipo9 {

static Scanner leer = new Scanner(System.in);//para enteros
static Scanner leer2 = new Scanner(System.in);//para strings


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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
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
            int puntos_poder = leer2.nextInt();
            System.out.println("Ingrese los puntos de precision");
            int puntos_precision = leer2.nextInt();
            movimiento[0] = new fisico(puntos_poder, puntos_precision, nombre, descripcion);

        } else if (tipo == 3) {
            System.out.println("Ingrese el nombre del movimiento: ");
            String nombre = leer2.nextLine();
            System.out.println("Ingrese la descripcion del movimiento: ");
            String descripcion = leer2.nextLine();
            System.out.println("Ingrese los puntos de poder");
            int puntos_poderE = leer2.nextInt();
            System.out.println("Ingrese los puntos de precision");
            int puntos_precisionE = leer2.nextInt();
            movimiento[0] = new especial(puntos_poderE, puntos_precisionE, nombre, descripcion);


        }
    }
}
