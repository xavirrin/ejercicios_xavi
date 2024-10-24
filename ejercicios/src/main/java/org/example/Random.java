package org.example;

import java.util.Random;
import java.util.Scanner;

class EjerRandom {
    public void random1(){

        Random random = new Random();

        int num1 = random.nextInt(6)+1;
        System.out.println(num1);
        int num2 = random.nextInt(6)+1;
        System.out.println(num2);

        int suma = (num1 + num2);

        System.out.println(suma);


    }

    public void random2(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int tam = caracteres.length();

        Random random = new Random();

        int longitud_contrasenya = 12;
        int indice;
        String contrasenya="";

        for (int i=0;i<longitud_contrasenya;i++){

            indice = random.nextInt(tam);
            contrasenya += caracteres.charAt(indice);

        }

        System.out.println("contrasenya = " + contrasenya);
    }

    public void random3(){

                Scanner teclado = new Scanner(System.in);
                Random random = new Random();

                System.out.println("Introduce el valor mínimo del rango");
                int min = teclado.nextInt();

                System.out.println("Introduce el valor máximo del rango");
                int max = teclado.nextInt();

                while (min >= max) {
                    System.out.println("El valor mínimo debe ser menor que el valor máximo. Inténtalo de nuevo.");
                    System.out.println("Introduce el valor mínimo del rango: ");
                    min = teclado.nextInt();

                    System.out.println("Introduce el valor máximo del rango: ");
                    max = teclado.nextInt();
                }

                System.out.println("¿Cuántos números aleatorios quieres?");
                int cantidad = teclado.nextInt();

                for (int i = 0; i < cantidad; i++) {
                    int numeroAleatorio = random.nextInt((max - min + 1)) + min;
                    System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
                }

                teclado.close();
            }

    public void random4(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int tam = caracteres.length();

        Random random = new Random();

        int longitud_contrasenya = random.nextInt(6, 8);
        int indice;
        String contrasenya="";

        for (int i=0;i<longitud_contrasenya;i++){

            indice = random.nextInt(tam);
            contrasenya += caracteres.charAt(indice);

        }

        System.out.println("contrasenya = " + contrasenya);

    }
        }





