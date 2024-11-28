package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public void pruebas() {

        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[3][4];

        int matriz2[][] = {{12, 32, 44, 1}, {33, 2, 90, 56}};

        System.out.println(matriz2[0][2]);
        System.out.println("Tamaño fila: " + matriz2.length);
        System.out.println("Tamaño columna: " + matriz2[0].length);

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2[i].length; j++) {


                System.out.print(matriz2[i][j] + " ");

            }

            System.out.print("\n");

        }
        for (int[] filas : matriz2) {
            System.out.println(Arrays.toString(filas));
        }

        for (int[] filas : matriz2) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (matriz2[i][j] == 90) {
                    System.out.println("Existe el 90");
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor de la posicion (" + i + "," + j + "):");
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
    }

    public void pruebas2() {

        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {

                if (matriz[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void pruebas3() {

        Scanner teclado = new Scanner(System.in);

        int m1[][] = {{34, 21, 2, 8}, {2, 4, 6, 8}};
        int m2[][] = {{21, 3, 99, 13}, {9, 7, 5, 3}};
        int m3[][] = new int[4][2];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] < m2[i][j]) {
                    m3[i][j] = m2[i][j];
                } else if (m2[i][j] < m1[i][j]) {
                    m3[i][j] = m1[i][j];
                } else {
                    m3[i][j] = m1[i][j];
                }
            }

        }
    }

    public void pruebas4() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int f = aleatorio.nextInt(5) + 1;
        int c = aleatorio.nextInt(5) + 1;
        int m[][] = new int[f][c];

        System.out.println("Matriz: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = aleatorio.nextInt(9) + 1;
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\nSuma de filas: ");
        for (int i = 0; i < f; i++) {
            int contadorFilas = 0;
            for (int j = 0; j < c; j++) {
                contadorFilas += m[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + contadorFilas);
        }

        System.out.println("\nSuma de columnas: ");
        for (int j = 0; j < c; j++) {
            int contadorColumnas = 0;
            for (int i = 0; i < f; i++) {
                contadorColumnas += m[i][j];
            }
            System.out.println("Fila " + (j + 1) + ": " + contadorColumnas);

        }
    }
}
