package lab4_david_reyes_jarod_zuniga;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_David_Reyes_Jarod_Zuniga {

    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();

    public static void main(String[] args) {
        int opc = 0;

        ArrayList equipo = new ArrayList();
        ArrayList jugadores = new ArrayList(6);

        //equipo 1
        jugadores.add(new Buscador("Jarod", 150, 100, 12, "Buscador", "Si"));
        jugadores.add(new Cazadores("David", 130, 80, 12, "Cazador", "no"));
        jugadores.add(new Golpeadores("Juan", 120, 95, 12, "Golpeador", "no"));
        jugadores.add(new Cazadores("Jose", 180, 99, 12, "Cazador", "no"));
        jugadores.add(new Golpeadores("Diego", 140, 97, 12, "Golpeador", "no"));
        jugadores.add(new Cazadores("Andrea", 110, 89, 12, "Cazador", "no"));
        jugadores.add(new Guardian("Josue", 170, 88, 12, "Guardian", "no"));
        equipo.add(new Equipo("Gryffindor", 0, 0, jugadores));

        //equipo 2
        jugadores.add(new Buscador("pablo", 150, 100, 12, "Buscador", "Si"));
        jugadores.add(new Cazadores("pedro", 130, 80, 12, "Cazador", "no"));
        jugadores.add(new Golpeadores("carlos", 120, 95, 12, "Golpeador", "no"));
        jugadores.add(new Cazadores("miguel", 180, 99, 12, "Cazador", "no"));
        jugadores.add(new Golpeadores("rambo", 140, 97, 12, "Golpeador", "no"));
        jugadores.add(new Cazadores("chuck norris", 110, 89, 12, "Cazador", "no"));
        jugadores.add(new Guardian("tu crush", 170, 88, 12, "Guardian", "no"));
        equipo.add(new Equipo("Slytherin", 0, 0, jugadores));

        System.out.println("Bienvenido al programa juegos de Hogwarts");
        System.out.println("");
        boolean tr = true, sbtr = true;
        while (tr == true) {
            System.out.println("|-------------------------*MENU*--------------------------|");
            System.out.println("|1.CRUD Equipo                                            |"
                    + "\n|2.CRUD Jugadores                                         |"
                    + "\n|3.Simulación del Juego                                   |");
            System.out.println("|---------------------------------------------------------|");
            try {
                opc = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error capa ocho valor nulo");
            }

            switch (opc) {
                case 1:
                    while (sbtr == true) {
                        System.out.println("1. agregar equipos");
                        System.out.println("2. modificar equipos");
                        System.out.println("3. eliminar equipos");
                        System.out.println("4. listar equipos");
                        System.out.println("5. cancelar");
                        try {
                            opc = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error el valor es nulo");
                        }

                        switch (opc) {
                            case 1:
                                char resp;
                                System.out.println("1.Gryffindor\n2.Slytherin\n3.Ravenclaw\n4.Hufflepuff");
                                System.out.println("Ingrese la opcion a de la casa a la que desea agregar el equipo");
                                try {
                                    opc = sc.nextInt();
                                } catch (Exception e) {
                                    System.out.println("Error el valor es nulo");
                                }
                                String casa = " ";
                                tr = true;
                                while (tr) {
                                    switch (opc) {
                                        case 1:
                                            casa = "Gryffindor";
                                            System.out.println("1.Golpeador \n2.Cazadores\n3.Guardian\n4.Buscadores ");
                                            try {
                                                opc = sc.nextInt();
                                            } catch (Exception e) {
                                                System.out.println("Error el valor es nulo");
                                            }
                                            String no;
                                            double pe,
                                             mu,
                                             ref;
                                            String pos = "",
                                             cap = "no";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                            cap = "no";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                            cap = "no";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                            cap = "no";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                                                while (resp != 's' && resp != 'n') {
                                                                    System.out.println("desea que sea capitan? s/n");
                                                                    resp = sc.next().charAt(0);
                                                                }
                                                                if (resp == 's' || resp == 'S') {
                                                                    cap = "Si";
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
                                for (int i = 0; i < equipo.size(); i++) {
                                    System.out.println(equipo.get(i));
                                }
                                System.out.println("Ingrese el equipo que desea eliminar");
                                int el = sc.nextInt();
                                try {
                                    equipo.remove(el - 1);
                                } catch (Exception e) {
                                    System.out.println("Esta fuera del tamaño");
                                }
                                System.out.println("Equipo eliminado exitosamente");
                                break;
                            case 4:
                                for (int i = 0; i < equipo.size(); i++) {
                                    System.out.println(equipo.get(i));
                                }
                                sbtr = false;
                                tr = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                sbtr = false;
                        }

                    }
                    sbtr = true;

                    tr = true;

                    break;
                case 2:
                    System.out.println("1. modificar jugador");
                    System.out.println("2. eliminar jugador");
                    System.out.println("3. listar jugador");
                    System.out.println("4. cancelar");
                    try {
                        opc = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error el Valor es nulo");
                    }
                    while (sbtr == true) {
                        switch (opc) {
                            case 1:

                                break;
                            case 3:
                                for (int i = 0; i < jugadores.size(); i++) {
                                    if (i < jugadores.size() / 2) {
                                        System.out.print(jugadores.get(i) + "\n");
                                    }else{
                                        System.out.println(jugadores.get(i));
                                    }
                                }

                                sbtr = false;
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
                    break;
                case 3:
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Jugadores del equipo 1");
                        if (!jugadores.isEmpty()) {
                            for (int i = 0; i < jugadores.size(); i++) {
                                
                                System.out.println((i + 1) + ". " + jugadores.get(i));
                            }
                        } 
                        System.out.println("Ingrese el numero de jugador");
                        int pos = sc.nextInt() - 1;
                        if (jugadores.get(pos) instanceof Buscador) {
                            System.out.println("1. hacer jugada\n2. hacer trampa");
                            int opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }else if (jugadores.get(pos)instanceof Cazadores) {
                           System.out.println("1. hacer jugada\n2. hacer trampa");
                            int opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            } 
                        }else if(jugadores.get(pos)instanceof Golpeadores){
                            System.out.println("1. hacer jugada\n2. hacer trampa");
                            int opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            } 
                            
                        }else if(jugadores.get(pos)instanceof Guardian){
                            System.out.println("1. hacer jugada\n2. hacer trampa");
                            int opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            } 
                        }
 
                    }
                    break;

                default:
                    tr = false;
            }
            tr = true;
        }
    }

    public void modojuego(int mod) {

    }

}
