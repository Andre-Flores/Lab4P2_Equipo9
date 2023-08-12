package lab4p2_eqipo9;

import java.util.ArrayList;
import java.util.Random;
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
                    //battle factory
                    
                    break;
                case 3:
                    // capturar y entrenar 
                    Entrenador Ent = new Entrenador();
                    pokemon pok = new pokemon();
                    listarEntrenadores(entrenadores);

                    System.out.println("Ingrese el entrenador(posicion) con el que quiere capturar o entrenar pokemons: ");
                    int pos = leer.nextInt();

                    System.out.println("Entrenador elegido: " + entrenadores.get(pos-1));

                    int resp = 1;
                    int a = 0;
                    while (resp == 1) {

                        System.out.println("Desea [1]entrenar o [2]capturar: ");
                        int op_ = leer.nextInt();

                        if (op_== 1) {

                            Random rand = new Random();
                            int numRan1, numRan2;
                            
                           
                            listarEntrenadores(entrenadores);
                            System.out.println("seleccione un entrenador: ");
                            int posi = leer.nextInt();

//                            System.out.println("pokemons de la caja");
//                            for (int i = 0; i < Ent.getCaja().size(); i++) {
//                                System.out.println(Ent.getCaja());
//                            }
                            System.out.println("pokemons del equipo");
                            for (int i = 0; i < entrenadores.get(posi).getEquipo().length; i++) {
                                System.out.println(entrenadores.get(posi).getEquipo()[i]);
                            }
                            System.out.println("Seleccione un pokemon: ");
                            int opcionPoke = leer.nextInt();

                            while (opcionPoke < Ent.getEquipo().length) {
                                System.out.println("no hay pokemons en esa posicion..");
                                opcionPoke = leer.nextInt();
                            }

                            numRan1 = 0 + rand.nextInt(2);
                            numRan2 = 100 + rand.nextInt(4999);

                            int total = numRan1 * numRan2;

                            int niveles = total / entrenadores.get(posi).getEquipo()[opcionPoke].getXp_necesaria();
                            int nivelAnt = entrenadores.get(posi).getEquipo()[opcionPoke].getNivel();

                            entrenadores.get(posi).getEquipo()[opcionPoke].setNivel(niveles + nivelAnt);

                            System.out.println("entrenamiento finalizado");
                            
                            

                        } else if (op_ == 2) {
                            
                            listarEntrenadores(entrenadores);
                            System.out.println("ingrese la posicion del entrenador: ");
                            int entrena = leer.nextInt();
                            
                            
                            
                            agregar_pokemon(entrenadores, entrena);

                        } else {
                            System.out.println("Opcion erronea---");
                        }

                        System.out.println("desea continuar trabajando: ");
                        resp = leer.nextInt();

                    }

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

    public static void agregar_pokemon(ArrayList <Entrenador>entrenadores,int pos) {
        movimiento[] movimiento = new movimiento[4];

        System.out.println("ingrese la especie: ");
        String especie = leer2.nextLine();
        System.out.println("ingrese el nivel del pokemon: ");
        int nivel = leer.nextInt();
        System.out.println("Ingrese los puntos de experiencia: ");
        int puntos_xp = leer.nextInt();

        System.out.println("Ingrese la exp necesaria para subir de level:");
        int xp_necesaria = leer.nextInt();
        System.out.println("Ingrese los puntos de vida: ");
        int hp = leer.nextInt();
        System.out.println("Ingrese el ataque: ");
        int atk = leer.nextInt();
        System.out.println("Ingrese la defensa: ");
        int def = leer.nextInt();
        System.out.println("Ingrese el especial: ");
        int sp = leer.nextInt();
        System.out.println("Ingrese la velocidad del pokemon: ");
        int spe = leer.nextInt();
        System.out.println("Ingrese el estado actual: ");
        String estado = leer2.nextLine();
        System.out.println("Lo quiere mandar al equipo? [1-Si\n2-No]");
        int op = leer.nextInt();
        if (op == 1) {
             pokemon Po = new pokemon(especie, nivel, puntos_xp, xp_necesaria, hp, atk, def, sp, spe, estado);
            //Ent.getEquipo();
            for (int i = 0; i < entrenadores.get(pos).getEquipo().length; i++) {
                
                 entrenadores.get(pos).getEquipo()[i] = Po;
                
            }
            System.out.println("Agregado God");
        } else {

           entrenadores.get(pos).getCaja().add(new pokemon(especie, nivel, puntos_xp, xp_necesaria, hp, atk, def, sp, spe, estado));
            System.out.println("Agregado God ");
        }

    }

    public static void agregar_entrenador() {
        System.out.println("Ingrese el nombre del entrenador: ");
        String nombre = leer2.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el dinero en la cuenta: ");
        int dinero = leer.nextInt();

        entrenadores.add(new Entrenador(nombre, edad, dinero));

    }

    public static void listarEntrenadores(ArrayList entrenadores) {

        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + " -" + entrenadores.get(i));
        }
    }
}
