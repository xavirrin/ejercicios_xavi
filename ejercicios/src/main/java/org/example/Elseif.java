package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Elseif {
    public void elseif(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su altura en cm...");

        boolean x = true;

        while(x) {
            try {
                int altura = teclado.nextInt();
                if (altura <= 150 && altura >= 1) {
                    System.out.println("Persona de altura baja...");
                } else if (altura <= 175 && altura > 151) {
                    System.out.println("Persona de altura media...");
                    x = false;
                } else if (altura >= 176) {
                    System.out.println("Persona alta...");
                    x = false;
                } else {
                    System.out.println("La altura introducida no es válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca la altura en centímetros...");
                teclado.nextLine();
            }
        }
}
    public void switchcase(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un número del 1 al 7...");

        String dia = teclado.nextLine();

        switch (dia) {
            case "1":
                System.out.println("1 es lunes");
                break;
            case "2":
                System.out.println("2 es martes");
                break;
            case "3":
                System.out.println("3 es miércoles");
                break;
            case "4":
                System.out.println("4 es jueves");
                break;
            case "5":
                System.out.println("5 es viernes");
                break;
            case "6":
                System.out.println("6 es sábado");
                break;
            case "7":
                System.out.println("7 es domingo");
                break;
            default:
                System.out.println("Error. Introduzca un número entre 1 y 7...");
        }
        }
}

