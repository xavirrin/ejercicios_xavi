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

    public void ej3() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int contador = 0;
        int vect[] = new int[25];
        System.out.println("Introduce un número y te diré cuántas veces aparece en el array.");
        int num = teclado.nextInt();

        for (int i = 0; i < vect.length; i++) {
            vect[i] = aleatorio.nextInt(101);
            System.out.println(vect[i]);
            if (vect[i] == num) {
                contador++;
            }
        }
        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");
    }

    public void ej4() {

        Scanner teclado = new Scanner(System.in);

        int vect[] = {1, 2, 3, 4, 5};
        int vect2[] = new int[vect.length - 1];

        System.out.println("Introduzca qué posición de las 5 quiere borrar (0-1-2-3-4):");
        int posicion = teclado.nextInt();

        if (posicion >= 0 && posicion < vect.length) {

            for (int i = 0, j = 0; i < vect.length; i++) {
                if (i != posicion) {
                    vect2[j++] = vect[i];
                }
            }
            System.out.println("Array original: " + Arrays.toString(vect));
            System.out.println("Array después de eliminar la posición " + posicion + ": " + Arrays.toString(vect2));
        } else {
            System.out.println("La posición ingresada no es válida.");
        }
        teclado.close();
    }

    public void ej5() {


        int vect[] = {1, 2, 3, 4, 5};
        int vectrotado[] = vect.clone(); // Copia del array original

        for (int i = vect.length - 1; i > 0; i--) {
            vectrotado[i] = vect[i - 1];
        }
        vectrotado[0] = vect[vect.length - 1];

        System.out.println("Array original: " + Arrays.toString(vect));
        System.out.println("Array rotado: " + Arrays.toString(vectrotado));
    }

    public void ej6() {

        Scanner teclado = new Scanner(System.in);

        boolean x = true;

        int vect[] = {1, 2, 3, 2, 1};

        for (int i = 0; i < vect.length / 2; i++) {
            if (vect[i] != vect[vect.length - 1 - i]) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("Es simétrico.");
        } else {
            System.out.println("No es simétrico.");
        }
    }

    public void ej7() {

        int vectA[] = {1, 2, 3};
        int vectB[] = {4, 5, 6};
        int vectC[] = new int[vectA.length + vectB.length];
        System.arraycopy(vectA, 0, vectC, 0, 3);
        System.arraycopy(vectB, 0, vectC, 3, 3);
        System.out.println("Vector 1: " + Arrays.toString(vectA));
        System.out.println("Vector 2: " + Arrays.toString(vectB));
        System.out.println("Vector 1 + 2: " + Arrays.toString(vectC));
    }

    public void ej9(){

        String vect[] = {"Uno","Dos","Tres","Cuatro","Cinco","Arboles"};
        String stringmayor = vect[0];
        for(int i = 1 ; i < vect.length ; i++){
            if (stringmayor.length() < vect[i].length()){
                stringmayor = vect[i];
            }
        }
        System.out.println("El string más largo es: " + stringmayor);
    }

    public void ej10(){

        Scanner teclado = new Scanner(System.in);
        String vect[] = {"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};
        System.out.println("Introduce una letra y te diré que palabras del vector empiezan por ella.");
        char letra = teclado.next().toLowerCase().charAt(0);
        boolean ninguno = true;
        System.out.println("Palabras que comienzan por '" + letra + "'.");
        for(int i = 0 ; i < vect.length ; i++){
            if(vect[i].toLowerCase().charAt(0) == letra){
                System.out.println(vect[i]);
                ninguno = false;
            }
        }if(ninguno){
            System.out.println("Ninguna palabra comienza por '" + letra + "'.");
        }
    }

//    public void samurais(){


    }

// Identificar primera letra y contar
//Crea un array de tipo String que guarde palabras
// y pide una letra (char) al usuario. El programa deberá mostrar
// todas las palabras cuya primera letra sea el valor del char que ha introducido el usuario.