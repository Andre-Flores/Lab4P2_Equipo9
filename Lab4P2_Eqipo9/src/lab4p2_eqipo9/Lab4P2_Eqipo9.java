
package lab4p2_eqipo9;


import java.util.Scanner;

public class Lab4P2_Eqipo9 {

static Scanner leer = new Scanner(System.in);//para enteros
static Scanner leer2 = new Scanner(System.in);//para strings


    public static void main(String[] args) {
        
        System.out.println("---Menu de Pokemones---");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1.Registrar entrenador"
                    + "2.Battle factory"
                    + "3.Capturar/Entrenar"
                    + "4.Anadir movimento");
            System.out.println("Ingrese la opcion: ");
            opcion = leer.nextInt();
            if (opcion == 1) {
                   
                
                   
                   
                    
            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {
                System.out.println("Saliendo del menu...");

            } else {
                System.out.println("La opcion ingresada es invalida");
            }

        }//fin while
    }
    
    
   
}
