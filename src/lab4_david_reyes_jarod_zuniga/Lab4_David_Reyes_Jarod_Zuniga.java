package lab4_david_reyes_jarod_zuniga;

import java.util.Random;
import java.util.Scanner;

public class Lab4_David_Reyes_Jarod_Zuniga {

   
    
    
    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa juegos de Hogwarts");
        System.out.println("");
        System.out.println("|-------------------------*MENU*--------------------------|");
        System.out.println("|1.CRUD Equipo                                            |"
                       + "\n|2.CRUD Jugadores                                         |"
                +        "\n|3.Simulación del Juego                                   |");
        System.out.println("|---------------------------------------------------------|");
        int opc=sc.nextInt();
        boolean tr=true, sbtr=true;
        while (tr==true) {        
        switch (opc) {
            case 1:
                System.out.println("1. agregar equipos");
                System.out.println("2. modificar equipos");
                System.out.println("3. eliminar equipos");
                System.out.println("4. listar equipos");
                System.out.println("5. cancelar");
                opc=sc.nextInt();
                while (sbtr==true) {
                switch (opc) {
                    case 1:
                        System.out.println("1.Gryffindor\n2.Slytherin\n3.Ravenclaw\n4.Hufflepuff");
                        System.out.println("Ingrese la opcion a de la casa a la que desea agregar el equipo");
                        opc=sc.nextInt();
                        String casa=" ";
                        tr=true;
                        while (tr) {  
                        switch (opc) {
                            case 1: 
                                casa="Gryffindor";
                                tr=false;
                                break;
                            case 2: 
                                casa="Slytherin";
                                tr=false;
                                break;
                            case 3: 
                                casa="Ravenclaw";
                                tr=false;
                                break;
                            case 4: 
                                casa="Hufflepuff";
                                tr=false;
                                break;
                            default:
                                System.out.println("");
                        }
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Gracias");
                        sbtr=false;
                        break;
                    default:
                        System.out.println("Opcion ingresada incorrecta");
                }
                }
                tr = false;
                break;
            case 2:
                
                
                tr=false;
                break;
            case 3:
                
                tr=false;
                break;
            default:
                throw new AssertionError();
        }
        }
        
    }

}
