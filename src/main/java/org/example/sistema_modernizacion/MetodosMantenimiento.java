package org.example.sistema_modernizacion;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosMantenimiento {

    static Equipos benjamin = Equipos.BENJAMÍN;
    static Equipos alevin = Equipos.ALEVÍN;
    static Equipos infantil = Equipos.INFANTIL;
    static Equipos cadete = Equipos.CADETE;
    static Equipos juvenil = Equipos.JUVENIL;
    static Equipos senior = Equipos.SENIOR;
    static ArrayList<Masajista> masajistas = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void mostrarMenu() {
        while (true) {
            System.out.print("""
                            
                            === App de mantenimiento del MUTXAMEL FC ===
                            
                            \t[1]. Mantenimiento de masajistas.
                            \t[2]. Consultar equipos.
                            \t[X]. Salir.
                            
                            =============================================
                            
                             Seleccione una opción--->""");

            char opcion = teclado.next().charAt(0);
            teclado.nextLine();

            if (opcion == 'X' || opcion == 'x') {
                System.out.println("Saliendo...");
                System.exit(0);
            }

            elegirOpcion(opcion);
        }
    }

    public static void elegirOpcion(char opcion) {

        switch (opcion) {
            case '1':
                mantenimientoMasajistas();
                break;

            case '2':
                opcionEquipos();
                break;

            default :
                System.out.println("Opción no válida. Saliendo...");
                break;
        }
    }

    public static void mantenimientoMasajistas() {
        while (true) {
            System.out.print("""
                    
                    === Mantenimiento de masajistas ===
                    
                    \t[1]. Añadir nuevo masajista.
                    \t[2]. Modificar datos de masajista existente.
                    \t[X]. Volver al menú principal.
                    
                    =============================================
                    
                     Seleccione una opción--->""");

            char opcion = teclado.next().charAt(0);
            teclado.nextLine();

            if (opcion == 'X' || opcion == 'x') {
                break;
            }

            elegirOpcionMasajista(opcion);
        }
    }

    public static void elegirOpcionMasajista(char opcion) {

        switch (opcion) {
            case '1' :
                añadirMasajista();
                break;

            case '2' :
                modificarMasajista();
                break;

            default :
                System.out.println("Opción no válida. Saliendo...");
                break;
        }
    }

    public static void añadirMasajista(){

        System.out.println("Introduzca los datos del masajista a añadir.");

        System.out.print("Nombre:");
        String nombre = teclado.nextLine();

        System.out.print("Edad: ");
        while (!teclado.hasNextInt()) {
            System.out.println("Por favor, introduzca un número válido.");
            teclado.next();
        }
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Titulación:");
        String titulacion = teclado.nextLine();

        System.out.print("Años de experiencia:");
        while (!teclado.hasNextInt()) {
            System.out.println("Por favor, introduzca un número válido.");
            teclado.next();
        }
        int anyosExp = teclado.nextInt();

        Masajista masajista = new Masajista(nombre, edad, titulacion, anyosExp);
        masajistas.add(masajista);

        System.out.println("Masajista añadido con éxito.");
        System.out.println(masajistas);
    }

    public static void modificarMasajista() {
        if (masajistas.isEmpty()) {
            System.out.println("No hay masajistas registrados.");
            return;
        }

        System.out.println("Lista de masajistas:");
        for (int i = 0; i < masajistas.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + masajistas.get(i));
        }

        System.out.print("Seleccione el número del masajista que desea modificar: ");
        int indice = teclado.nextInt() - 1;
        teclado.nextLine();

        if (indice < 0 || indice >= masajistas.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Masajista masajista = masajistas.get(indice);
        System.out.println("Modificando a: " + masajista);

        System.out.print("Nuevo nombre (ENTER para mantener): ");
        String nuevoNombre = teclado.nextLine();
        if (!nuevoNombre.isBlank()) {
            masajista.setNombre(nuevoNombre);
        }

        System.out.print("Nueva edad (ENTER para mantener): ");
        String nuevaEdad = teclado.nextLine();
        if (!nuevaEdad.isBlank()) {
            masajista.setEdad(Integer.parseInt(nuevaEdad));
        }

        System.out.print("Nueva titulación (ENTER para mantener): ");
        String nuevaTitulacion = teclado.nextLine();
        if (!nuevaTitulacion.isBlank()) {
            masajista.setTitulacion(nuevaTitulacion);
        }

        System.out.print("Nuevos años de experiencia (ENTER para mantener): ");
        String nuevosAñosExp = teclado.nextLine();
        if (!nuevosAñosExp.isBlank()) {
            masajista.setAnyosExperiencia(Integer.parseInt(nuevosAñosExp));
        }

        System.out.println("Masajista actualizado: " + masajista);
    }


    public static void opcionEquipos() {
        while (true) {
            System.out.print("""
                    
                    === Equipos ===
                    
                    \t[1]. Benjamín.
                    \t[2]. Alevín.
                    \t[3]. Infantil.
                    \t[4]. Cadete.
                    \t[5]. Juvenil.
                    \t[6]. Senior.
                    \t[X]. Volver al menú principal.
                    
                    =============================================
                    
                     Seleccione una opción--->""");

            char opcion = teclado.next().charAt(0);
            teclado.nextLine();

            if (opcion == 'X' || opcion == 'x') {
                break;
            }

            mostrarEquipo(opcion);
        }
    }

    public static void mostrarEquipo(char opcion){

        switch (opcion){

            case '1':
                System.out.println(benjamin.name());
                break;

            case '2':
                System.out.println(alevin.name());
                break;

                case '3':
                    System.out.println(infantil.name());
                    break;

                case '4':
                    System.out.println(cadete.name());
                    break;

                    case '5':
                    System.out.println(juvenil.name());
                    break;

                    case '6':
                    System.out.println(senior.name());
                    break;

            default:
                System.out.println("Equipo no encontrado");


        }

    }

}
