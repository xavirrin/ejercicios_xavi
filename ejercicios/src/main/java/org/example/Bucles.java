package org.example;

import java.util.Scanner;

public class Bucles {
    public void bucle1() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la contraseña.");
        boolean x = true;

        while (x) {
            String contrasenya = teclado.nextLine();
            if (contrasenya.equals("pepe")) {
                System.out.println("Contraseña correcta.");
                x = false;
            } else {
                System.out.println("Introduzca una contraseña válida.");

            }
        }

    }

    public void bucle2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Contaré desde cualquier número hasta 1.");
        System.out.println("Introduce uno.");
        int num = teclado.nextInt();

        while (num >= 1) {
            num--;
            System.out.println(num);
        }

    }

    public void bucle3() {
        int num = 0;
        int num2 = 50;

        while (num < 50) {
            num++;
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }

    public void bucle4() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }

    public void bucle5() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int num = teclado.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public void bucle6(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos números quiere sumar?");
        int cuantos = teclado.nextInt();

        int sumaTotal = 0;

        for (int i = 1; i <= cuantos; i++) {
            System.out.println("Inserta nº " + i + ":");
            int numero = teclado.nextInt();
            sumaTotal += numero;
        }

                System.out.println("La suma total de los " + cuantos + " números es: " + sumaTotal);

                teclado.close();
            }

            public void bucle7(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int num = teclado.nextInt();
        int factorial = 1;

        for(int i = 1; i <=num; i++){
            factorial *= i;
        }
                System.out.println("El factorial de " + num + " es " + factorial);
            }

    public void bucle8(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra...");
        String palabra = teclado.nextLine();

        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        System.out.println("La cadena invertida es: " + invertida);
    }
}

