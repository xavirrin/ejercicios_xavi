package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MesaElectoral {
    public void Mas18() {

        System.out.println("Introduce tu nombre.");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre + ". Introduce tu edad.");

        boolean a = true;
        while (a == true) {
            try {
                int edad = teclado.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. Inténtalo de nuevo.");

                } else if (edad >= 18) {
                    int añoNacimiento = 2024 - edad + 18;
                    System.out.println("Enhorabuena " + nombre + ". Puedes votar desde " + añoNacimiento + ".");
                    a = false;
                } else {
                    int edadRestante = 18 - edad;
                    System.out.println("Lo siento " + nombre + ". No puedes votar. Todavía te quedan " + edadRestante + " años.");
                    a = false;}
                }catch(InputMismatchException erro){
                    System.out.println("ERROR. La edad debe estar escrita en números.");
                    teclado.nextLine();
                }
            }
        }
    }

//¿Se te ocurre alguna casuística donde el programa falle? Prueba esto…
//a. Introduce un número negativo cuando preguntes por la edad. ¿Tiene sentido?
//Añade lógica a tu programa para que, en caso de que el usuario introduzca un número negativo, aparezca
//un mensaje de error y vuelva a preguntar la edad mientras no se escriba un valor coherente.