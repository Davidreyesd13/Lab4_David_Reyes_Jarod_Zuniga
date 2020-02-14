package lab4_david_reyes_jarod_zuniga;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_David_Reyes_Jarod_Zuniga {

    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();

    public static void main(String[] args) {
        ArrayList equipo = new ArrayList();
        ArrayList jugadores = new ArrayList();
        System.out.println("Bienvenido al programa juegos de Hogwarts");
        System.out.println("");
        System.out.println("|-------------------------*MENU*--------------------------|");
        System.out.println("|1.CRUD Equipo                                            |"
                + "\n|2.CRUD Jugadores                                         |"
                + "\n|3.Simulación del Juego                                   |");
        System.out.println("|---------------------------------------------------------|");
        int opc = sc.nextInt();
        boolean tr = true, sbtr = true;
        while (tr == true) {
            switch (opc) {
                case 1:
                    System.out.println("1. agregar equipos");
                    System.out.println("2. modificar equipos");
                    System.out.println("3. eliminar equipos");
                    System.out.println("4. listar equipos");
                    System.out.println("5. cancelar");
                    opc = sc.nextInt();
                    while (sbtr == true) {
                        switch (opc) {
                            case 1:
                                System.out.println("1.Gryffindor\n2.Slytherin\n3.Ravenclaw\n4.Hufflepuff");
                                System.out.println("Ingrese la opcion a de la casa a la que desea agregar el equipo");
                                opc = sc.nextInt();
                                String casa = " ";
                                tr = true;
                                while (tr) {
                                    switch (opc) {
                                        case 1:
                                            casa = "Gryffindor";
                                            tr = false;
                                            break;
                                        case 2:
                                            casa = "Slytherin";
                                            tr = false;
                                            break;
                                        case 3:
                                            casa = "Ravenclaw";
                                            tr = false;
                                            break;
                                        case 4:
                                            casa = "Hufflepuff";
                                            tr = false;
                                            break;
                                        default:
                                            System.out.println("");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("1. agregar jugador");
                                System.out.println("2. modificar jugador");
                                System.out.println("3. eliminar jugador");
                                System.out.println("4. listar jugador");
                                System.out.println("5. cancelar");
                                opc = sc.nextInt();
                                while (sbtr == true) {
                                    switch (opc) {
                                        case 1:
                                            System.out.println("1.Buscadores\n2.Golpeador\n3.Cazadores\n4.Guardian ");
                                            opc = sc.nextInt();
                                            String pos = "",
                                             cap = "";
                                            int c = 0,
                                             g,
                                             go,
                                             ca,
                                             b;
                                            sbtr = true;
                                            while (sbtr == true) {
                                                switch (opc) {
                                                    case 1:
                                                        System.out.println("Ingrese el nombre del jugador");
                                                        String no = sc.nextLine();
                                                        no = sc.nextLine();
                                                        System.out.println("Ingrese el peso de los jugadores");
                                                        double pe = sc.nextDouble();
                                                        System.out.println("Ingrese la musculatura de los jugadores");
                                                        double mu = sc.nextDouble();
                                                        System.out.println("Ingrese los reflejos de los jugadores");
                                                        double ref = sc.nextDouble();
                                                        pos = "Golpeadores";
                                                        System.out.println("es capitan? s/n");
                                                        if (c != 1) {
                                                            cap = "Capitan";
                                                            c = 1;
                                                        } else {
                                                            System.out.println("Ya existe un capitan");
                                                        }
                                                        jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                        sbtr = false;
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese el nombre del jugador");
                                                        no = sc.nextLine();
                                                        no = sc.nextLine();
                                                        System.out.println("Ingrese el peso de los jugadores");
                                                        pe = sc.nextDouble();
                                                        System.out.println("Ingrese la musculatura de los jugadores");
                                                        mu = sc.nextDouble();
                                                        System.out.println("Ingrese los reflejos de los jugadores");
                                                        ref = sc.nextDouble();
                                                        pos = "Cazadores";
                                                        if (c != 1) {
                                                            cap = "Capitan";
                                                            c = 1;
                                                        } else {
                                                            System.out.println("Ya existe un capitan");
                                                        }
                                                        jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                        sbtr = false;
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese el nombre del jugador");
                                                        no = sc.nextLine();
                                                        no = sc.nextLine();
                                                        System.out.println("Ingrese el peso de los jugadores");
                                                        pe = sc.nextDouble();
                                                        System.out.println("Ingrese la musculatura de los jugadores");
                                                        mu = sc.nextDouble();
                                                        System.out.println("Ingrese los reflejos de los jugadores");
                                                        ref = sc.nextDouble();
                                                        pos = "Guardian";
                                                        if (c != 1) {
                                                            cap = "Capitan";
                                                            c = 1;
                                                        } else {
                                                            System.out.println("Ya existe un capitan");
                                                        }
                                                        jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                        sbtr = false;
                                                        break;
                                                    case 4:
                                                        System.out.println("Ingrese el nombre del jugador");
                                                        no = sc.nextLine();
                                                        no = sc.nextLine();
                                                        System.out.println("Ingrese el peso de los jugadores");
                                                        pe = sc.nextDouble();
                                                        System.out.println("Ingrese la musculatura de los jugadores");
                                                        mu = sc.nextDouble();
                                                        System.out.println("Ingrese los reflejos de los jugadores");
                                                        ref = sc.nextDouble();
                                                        pos = "Buscadores";
                                                        if (c != 1) {
                                                            cap = "Capitan";
                                                            c = 1;
                                                        } else {
                                                            System.out.println("Ya existe un capitan");
                                                        }
                                                        jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                        sbtr = false;
                                                        break;
                                                    default:
                                                        System.out.println("opcion ingresada es incorrecta");
                                                }
                                            }

                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            System.out.println("Gracias");
                                            sbtr = false;
                                            break;
                                        default:
                                            System.out.println("Opcion ingresada incorrecta");
                                    }
                                }
                                tr = false;
                                break;
                            case 3:

                                tr = false;
                                break;
                            default:
                                throw new AssertionError();
                        }

                    }

            }
        }
    }
}
