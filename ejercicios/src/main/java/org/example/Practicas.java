package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicas {
    public void calculadora() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¡Bienvenido a Dora la Calculadora!");

        int num1 = 0;
        boolean trycatch1 = false;


        while (!trycatch1) {
            try {
                System.out.println("Introduzca un número.");
                num1 = teclado.nextInt();
                trycatch1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduzca un número válido.");
                teclado.next();
            }
        }

        boolean uno = true;
        while (uno) {

            System.out.println("Introduzca una operación:");
            System.out.println("    + --> Suma");
            System.out.println("    - --> Resta");
            System.out.println("    x --> Multiplicación");
            System.out.println("    / --> División");
            System.out.println("    R --> Raíz cuadrada");

            String operacion = teclado.next();

            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("/") || operacion.equals("R")) {


                if (operacion.equals("R")) {
                    if (num1 >= 0) {
                        System.out.println("La raíz cuadrada de " + num1 + " es " + Math.sqrt(num1));
                    } else {
                        System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    uno = false;
                    } else {
                    int num2 = 0;
                    boolean trycatch2 = false;


                    while (!trycatch2) {
                        try {
                            System.out.println("Introduzca otro número.");
                            num2 = teclado.nextInt();
                            trycatch2 = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Por favor, introduzca un número válido.");
                            teclado.next();
                        }

                        try {
                            switch (operacion) {
                                case "+":
                                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                                    break;
                                case "-":
                                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                                    break;
                                case "x":
                                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                                    break;
                                case "/":
                                    if (num2 == 0) {
                                        System.out.println("Error: No se puede dividir por cero.");
                                    } else {
                                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                                    }
                                    break;
                                default :
                                    System.out.println("La operación introducida no es válida, inténtelo de nuevo.");
                                    break;
                            }
                        } catch (ArithmeticException e) {
                            System.out.println("Ocurrió un error en la operación aritmética.");
                        }

                        uno = false; //
                    }

//                }else{
//                    System.out.println("La operación introducida no es válida, inténtelo de nuevo.");
                }
            }

            teclado.nextLine();
        }
    }
}
