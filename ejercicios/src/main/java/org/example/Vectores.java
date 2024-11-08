package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {
    public void ej1() {

        int numeros[] = new int[8];

        Random aleatorios = new Random();

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorios.nextInt(501);
            suma += numeros[i];
        }

        System.out.println("El resultado es " + suma);

    }

        public void ej2() {
            Scanner teclado = new Scanner(System.in);

            int vect[] = new int[3];
            int vectaux[] = new int[3];


            for (int i = 0; i < vect.length; i++) {
                System.out.println("Introduce un número.");
                vect[i] = teclado.nextInt();
            }

            for (int i = 0; i < vect.length; i++) {
                vectaux[i] = vect[vect.length - 1 - i];
            }


            System.out.println("El vector invertido es: " + Arrays.toString(vectaux));
        }
    }
