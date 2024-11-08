package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExamenPractico {
    public void ppt() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int puntuacionPC = 0;
        int puntuacionPL = 0;

        for (int i = 1; puntuacionPC < 3 && puntuacionPL < 3; i++) {
            System.out.println("Ronda " + i);
            System.out.println("¿Piedra, papel o tijera? (p/a/t)");
            String patPL = teclado.nextLine();
            if (patPL.contains("p") || patPL.contains("a") || patPL.contains("t")) {
                int patPC = random.nextInt(3) + 1;
                String jugadaPC = "";
                switch (patPC) {
                    case 1:
                        jugadaPC = "Piedra";
                        break;
                    case 2:
                        jugadaPC = "Papel";
                        break;
                    case 3:
                        jugadaPC = "Tijera";
                        break;
                    default:
                        System.out.println("ERROR.");
                }
                if (patPL.equals("p") && jugadaPC.equals("Piedra") || patPL.equals("a") && jugadaPC.equals("Papel") || patPL.equals("t") && jugadaPC.equals("Tijera")) {
                    System.out.println("¡Empate! No hay punto para nadie.");
                } else if (patPL.equals("p") && jugadaPC.equals("Tijera") || patPL.equals("a") && jugadaPC.equals("Piedra") || patPL.equals("t") && jugadaPC.equals("Papel")) {
                    System.out.println("El ordenador ha elegido " + jugadaPC);
                    System.out.println("¡Has ganado! +1 punto para ti.");
                    puntuacionPL++;
                    System.out.println("Marcador actual (PC - Player): " + puntuacionPC + "-" + puntuacionPL);
                } else if (patPL.equals("p") && jugadaPC.equals("Papel") || patPL.equals("a") && jugadaPC.equals("Tijera") || patPL.equals("t") && jugadaPC.equals("Piedra")) {
                    System.out.println("El ordenador ha elegido " + jugadaPC);
                    System.out.println("¡Has perdido! +1 punto para el ordenador.");
                    puntuacionPC++;
                    System.out.println("Marcador actual (PC - Player): " + puntuacionPC + "-" + puntuacionPL);
                }
            }
        }

        if (puntuacionPC == 3) {
            System.out.println("Lo siento, el ganador es el ordenador.");
        } else if (puntuacionPL == 3) {
            System.out.println("¡Enhorabuena! Has ganado la partida.");
        }
    }

    public void anyos() {

        Scanner teclado = new Scanner(System.in);
        int anyoactual = 2024;

        boolean x = true;
        while (x) {

            System.out.println("Introduce tu año de nacimiento.");
            try {
                int anyonac = teclado.nextInt();
                if (anyonac > 1900 && anyonac < 2024) {

                    for (int i = 0; anyonac < anyoactual; i++) {
                        System.out.println(anyonac + " - edad: " + i);
                        anyonac++;

                    }
                    x = false;
                } else {
                    System.out.println("El año introducido debe estar entre 1900 y el actual.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se aceptan números enteros.");
                teclado.nextLine();
            }
        }

    }

    public void ej1() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean numcorrecto = false;
        boolean repe = true;

        System.out.println("Acabo de pensar un número [1-100]... ¿Puedes adivinarlo? ¡Tienes 10 intentos!");

        int numrandom = aleatorio.nextInt(0, 100) + 1;
        while (repe) {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Intento " + i + ". Introduce un número: ");
                    int numplayer = teclado.nextInt();
                    if (numplayer < 1 || numplayer > 100) {
                        System.out.println("El número introducido debe estar entre 1 y 100");
                        break;
                    }
                    if (numplayer < numrandom) {
                        System.out.println("Tu número es menor que el que he pensado.");
                    } else if (numplayer > numrandom) {
                        System.out.println("Tu número es mayor que el que he pensado.");
                    } else if (i == 10) {
                        repe = false;
                    } else {
                        System.out.println("Correcto!!! El número era " + numrandom + " .");
                        numcorrecto = true;
                        repe = false;
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo puedes introducir números enteros del 1 al 100.");
                teclado.nextLine();
            }
        }
        if (numcorrecto = false) {
            System.out.println("Lo siento... se han acabado los intentos. Otra vez será!");
        }
    }

    public void ej2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de años bisiestos.");
        System.out.println("Introduzca un año entre 1900 y el actual.");
        System.out.println("Le diré cuántos años bisiestos ha habido desde ese año hasta hoy.");
        int anyoactual = 2024;
        int contadoranyos = 0;

        int anyoint = teclado.nextInt();
        if (anyoint < 1900 || anyoint > anyoactual) {
            System.out.println("El año introducido debe estar entre 1900 y el actual.");
        } else {
            for (int i = anyoint; i <= anyoactual; i++) {
                if (i % 4 == 0 || (i % 100 == 0 && i % 400 == 0)) {
                    System.out.println(i);
                    contadoranyos++;
                }
            }System.out.println("El número de años bisiestos desde " + anyoint + " es de: " + contadoranyos + " .");
        }
    }
}

