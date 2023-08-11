
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
    
    
   
}
