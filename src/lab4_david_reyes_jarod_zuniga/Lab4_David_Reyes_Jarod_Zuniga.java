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
                                char resp;
                                System.out.println("1.Gryffindor\n2.Slytherin\n3.Ravenclaw\n4.Hufflepuff");
                                System.out.println("Ingrese la opcion a de la casa a la que desea agregar el equipo");
                                opc = sc.nextInt();
                                String casa = " ";
                                tr = true;
                                while (tr) {
                                    switch (opc) {
                                        case 1:
                                            casa = "Gryffindor";
                                            System.out.println("1.Golpeador \n2.Cazadores\n3.Guardian\n4.Buscadores ");
                                            opc = sc.nextInt();
                                            String no;
                                            double pe,
                                             mu,
                                             ref;
                                            String pos = "",
                                             cap = "";
                                            int c = 0,
                                             g = 0,
                                             go = 0,
                                             ca = 0,
                                             b = 0;
                                            sbtr = true;
                                            while (sbtr == true) {
                                                switch (opc) {
                                                    case 1:
                                                        if (go < 1) {
                                                            System.out.println("Ingrese el nombre del jugador");
                                                            no = sc.nextLine();
                                                            no = sc.nextLine();
                                                            System.out.println("Ingrese el peso de los jugadores");
                                                            pe = sc.nextDouble();
                                                            System.out.println("Ingrese la musculatura de los jugadores");
                                                            mu = sc.nextDouble();
                                                            System.out.println("Ingrese los reflejos de los jugadores");
                                                            ref = sc.nextDouble();
                                                            pos = "Golpeadores";
                                                            System.out.println("es capitan? s/n");
                                                            if (c != 1) {
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Buscador(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            go++;
                                                        } else {
                                                            System.out.println("");
                                                        }
                                                        break;
                                                    case 2:
                                                        if (ca < 3) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            ca++;
                                                        } else {
                                                            System.out.println("Ya hay tres cazadores");
                                                        }
                                                        break;
                                                    case 3:
                                                        if (g < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Cazadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            g++;
                                                        } else {
                                                            System.out.println("Ya existe un guardian");
                                                        }
                                                        break;
                                                    case 4:
                                                        if (b < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Guardian(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            b++;
                                                        } else {
                                                            System.out.println("YA existe un buscador");
                                                        }
                                                        
                                                        break;
                                                    default:
                                                        System.out.println("opcion ingresada es incorrecta");
                                                }
                                            }
                                            tr = false;
                                            break;
                                        case 2:
                                            casa = "Slytherin";
                                            System.out.println("1.Golpeador \n2.Cazadores\n3.Guardian\n4.Buscadores ");
                                            opc = sc.nextInt();
                                            no = "";
                                            pe = 0;
                                            mu = 0;
                                            ref = 0;
                                            pos = "";
                                            cap = "";
                                            c = 0;
                                            g = 0;
                                            go = 0;
                                            ca = 0;
                                            b = 0;
                                            sbtr = true;
                                            while (sbtr == true) {
                                                switch (opc) {
                                                    case 1:
                                                        if (go < 1) {
                                                            System.out.println("Ingrese el nombre del jugador");
                                                            no = sc.nextLine();
                                                            no = sc.nextLine();
                                                            System.out.println("Ingrese el peso de los jugadores");
                                                            pe = sc.nextDouble();
                                                            System.out.println("Ingrese la musculatura de los jugadores");
                                                            mu = sc.nextDouble();
                                                            System.out.println("Ingrese los reflejos de los jugadores");
                                                            ref = sc.nextDouble();
                                                            pos = "Golpeadores";
                                                            System.out.println("es capitan? s/n");
                                                            if (c != 1) {
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Buscador(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            go++;
                                                        } else {
                                                            System.out.println("");
                                                        }
                                                        break;
                                                    case 2:
                                                        if (ca < 3) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            ca++;
                                                        } else {
                                                            System.out.println("Ya hay tres cazadores");
                                                        }
                                                        break;
                                                    case 3:
                                                        if (g < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Cazadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            g++;
                                                        } else {
                                                            System.out.println("Ya existe un guardian");
                                                        }
                                                        break;
                                                    case 4:
                                                        if (b < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Guardian(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            b++;
                                                        } else {
                                                            System.out.println("YA existe un buscador");
                                                        }
                                                        
                                                        break;
                                                    default:
                                                        System.out.println("opcion ingresada es incorrecta");
                                                }
                                            }
                                            tr = false;
                                            tr = false;
                                            break;
                                        case 3:
                                            casa = "Ravenclaw";
                                            System.out.println("1.Golpeador \n2.Cazadores\n3.Guardian\n4.Buscadores ");
                                            opc = sc.nextInt();
                                            no = "";
                                            pe = 0;
                                            mu = 0;
                                            ref = 0;
                                            pos = "";
                                            cap = "";
                                            c = 0;
                                            g = 0;
                                            go = 0;
                                            ca = 0;
                                            b = 0;
                                            sbtr = true;
                                            while (sbtr == true) {
                                                switch (opc) {
                                                    case 1:
                                                        if (go < 1) {
                                                            System.out.println("Ingrese el nombre del jugador");
                                                            no = sc.nextLine();
                                                            no = sc.nextLine();
                                                            System.out.println("Ingrese el peso de los jugadores");
                                                            pe = sc.nextDouble();
                                                            System.out.println("Ingrese la musculatura de los jugadores");
                                                            mu = sc.nextDouble();
                                                            System.out.println("Ingrese los reflejos de los jugadores");
                                                            ref = sc.nextDouble();
                                                            pos = "Golpeadores";
                                                            System.out.println("es capitan? s/n");
                                                            if (c != 1) {
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Buscador(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            go++;
                                                        } else {
                                                            System.out.println("");
                                                        }
                                                        break;
                                                    case 2:
                                                        if (ca < 3) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            ca++;
                                                        } else {
                                                            System.out.println("Ya hay tres cazadores");
                                                        }
                                                        break;
                                                    case 3:
                                                        if (g < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Cazadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            g++;
                                                        } else {
                                                            System.out.println("Ya existe un guardian");
                                                        }
                                                        break;
                                                    case 4:
                                                        if (b < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Guardian(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            b++;
                                                        } else {
                                                            System.out.println("YA existe un buscador");
                                                        }
                                                        
                                                        break;
                                                    default:
                                                        System.out.println("opcion ingresada es incorrecta");
                                                }
                                            }
                                            tr = false;
                                            break;
                                        case 4:
                                            casa = "Hufflepuff";
                                            System.out.println("1.Golpeador \n2.Cazadores\n3.Guardian\n4.Buscadores ");
                                            opc = sc.nextInt();
                                            no = "";
                                            pe = 0;
                                            mu = 0;
                                            ref = 0;
                                            pos = "";
                                            cap = "";
                                            c = 0;
                                            g = 0;
                                            go = 0;
                                            ca = 0;
                                            b = 0;
                                            sbtr = true;
                                            while (sbtr == true) {
                                                switch (opc) {
                                                    case 1:
                                                        if (go < 1) {
                                                            System.out.println("Ingrese el nombre del jugador");
                                                            no = sc.nextLine();
                                                            no = sc.nextLine();
                                                            System.out.println("Ingrese el peso de los jugadores");
                                                            pe = sc.nextDouble();
                                                            System.out.println("Ingrese la musculatura de los jugadores");
                                                            mu = sc.nextDouble();
                                                            System.out.println("Ingrese los reflejos de los jugadores");
                                                            ref = sc.nextDouble();
                                                            pos = "Golpeadores";
                                                            System.out.println("es capitan? s/n");
                                                            if (c != 1) {
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Buscador(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            go++;
                                                        } else {
                                                            System.out.println("");
                                                        }
                                                        break;
                                                    case 2:
                                                        if (ca < 3) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Golpeadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            ca++;
                                                        } else {
                                                            System.out.println("Ya hay tres cazadores");
                                                        }
                                                        break;
                                                    case 3:
                                                        if (g < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Cazadores(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            g++;
                                                        } else {
                                                            System.out.println("Ya existe un guardian");
                                                        }
                                                        break;
                                                    case 4:
                                                        if (b < 1) {
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
                                                                System.out.println("desea que sea capitan? s/n");
                                                                resp = sc.next().charAt(0);
                                                                while (resp != 's' || resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Capitan";
                                                                    c = 1;
                                                                }
                                                            }
                                                            jugadores.add(new Guardian(no, pe, mu, ref, pos, cap));
                                                            sbtr = false;
                                                            b++;
                                                        } else {
                                                            System.out.println("YA existe un buscador");
                                                        }
                                                        
                                                        break;
                                                    default:
                                                        System.out.println("opcion ingresada es incorrecta");
                                                }
                                            }
                                            tr = false;
                                            break;
                                        default:
                                            System.out.println("");
                                    }
                                }
                                equipo.add(new Equipo(casa, 0, 0, jugadores));
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                tr = false;
                                break;
                            default:
                                throw new AssertionError();
                        }
                        
                    }
                
                case 2:
                    System.out.println("1. modificar jugador");
                    System.out.println("2. eliminar jugador");
                    System.out.println("3. listar jugador");
                    System.out.println("4. cancelar");
                    opc = sc.nextInt();
                    while (sbtr == true) {
                        switch (opc) {
                            case 1:
                                
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
                    for (int i = 0; i < equipo.size(); i++) {
                        System.out.println(equipo.get(i));
                    }
                    System.out.println("Ingrese el equipo que desea eliminar");
                    int el=sc.nextInt();
                    equipo.remove(el-1);
                    break;
                
                default:
                    throw new AssertionError();
            }
            
        }
    }
}
