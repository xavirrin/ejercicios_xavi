package org.example;

import java.util.Scanner;

    public class ActividadUno {
        public void actividadUno() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un numero: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El numero es positivo.");
            } else if (numero < 0) {
                System.out.println("El numero es negativo.");
            } else {
                System.out.println("El numero es cero (0).");
            }

            scanner.close();

        }
    }

