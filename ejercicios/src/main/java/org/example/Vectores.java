package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
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

    public void ej9() {

        String vect[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Arboles"};
        String stringmayor = vect[0];
        for (int i = 1; i < vect.length; i++) {
            if (stringmayor.length() < vect[i].length()) {
                stringmayor = vect[i];
            }
        }
        System.out.println("El string más largo es: " + stringmayor);
    }

    public void ej10() {

        Scanner teclado = new Scanner(System.in);
        String vect[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
        System.out.println("Introduce una letra y te diré que palabras del vector empiezan por ella.");
        char letra = teclado.next().toLowerCase().charAt(0);
        boolean ninguno = true;
        System.out.println("Palabras que comienzan por '" + letra + "'.");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].toLowerCase().charAt(0) == letra) {
                System.out.println(vect[i]);
                ninguno = false;
            }
        }
        if (ninguno) {
            System.out.println("Ninguna palabra comienza por '" + letra + "'.");
        }
    }

    public void samurais() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        //GUARDAMOS ARRAYS DE CADA EQUIPO EN LA QUE GUARDAR LA POTENCIA DE CADA UNO DE LOS 7 SAMURIS
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        //CREAMOS 2 BULEANOS PARA CERRAR LA ENTRADA DE POTENCIAS DE EQUIPOS, Y SI
        //EN EL EQUIPO 2 NO ES 30, QUE NO HAYA QUE REPETIR LOS DEL EQUIPO 1
        boolean team1 = false;
        boolean team2 = false;
        //MIENTRAS BULEANO 1 SEA FALSE
        while (!team1) {
            //TRY CATCH PARA EVITAR LETRAS EN LA ENTRADA DE LAS POTENCIAS
            try {
                //VARIABLE PARA COMPROBAR QUE LA POTENCIA TOTAL ES 30
                int suma30 = 0;
                //NUEVO BULEANO PARA COMPROBAR QUE LOS NUMEROS ESTEN ENTRE 1 Y 24
                //Y NO SE ENVIEN DOS MENSAJES DE ERROR
                boolean numvalido = true;

                //COMENZAMOS CON POTENCIAS DE EQUIPO 1
                System.out.println("Equipo 1");
                System.out.println("Introduce potencia de los samuráis:");
                for (int i = 0; i < equipo1.length; i++) {
                    equipo1[i] = teclado.nextInt();
                    //SI ESTA ENTRE 1 Y 24 SEGUIMOS
                    if (equipo1[i] > 0 && equipo1[i] < 25) {
                        suma30 += equipo1[i];
                        //SI NO, ERROR, BULEANO FALSE Y SALIMOS
                    } else {
                        System.out.println("La potencia debe estar entre 1 y 24.");
                        numvalido = false;
                        break;
                    }
                }

                //SI EL BULEANO NO SE HA HECHO FALSE Y HAY 30 DE POTENCIA SEGUIMOS
                if (numvalido && suma30 == 30) {
                    team1 = true;
                    System.out.println("Equipo completado.");
                    //SI NO, ERROR
                } else if (numvalido) {
                    System.out.println("ERROR. La potencia total del equipo 1 no suma 30.");
                }
                //AQUI EL CATCH ANTERIORMENTE DICHO
            } catch (InputMismatchException e) {
                System.out.println("Solo puede introducir números enteros.");
                teclado.nextLine();
            }
        }
        //HACEMOS LO MISMO CON EL EQUIPO 2
        while (!team2) {
            try {
                int suma30 = 0;
                boolean numvalido = true;

                System.out.println("Equipo 2");
                System.out.println("Introduce potencia de los samuráis:");
                for (int i = 0; i < equipo2.length; i++) {
                    equipo2[i] = teclado.nextInt();
                    if (equipo2[i] > 0 && equipo2[i] < 25) {
                        suma30 += equipo2[i];
                    } else {
                        System.out.println("La potencia debe estar entre 1 y 24.");
                        numvalido = false;
                        break;
                    }
                }
                if (numvalido && suma30 == 30) {
                    team2 = true;
                    System.out.println("Equipo completado.");
                } else if (numvalido) {
                    System.out.println("ERROR. La potencia total del equipo 2 no suma 30.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo puede introducir números enteros.");
                teclado.nextLine();
            }
        }
        //COMIENZA LA BATALLA
        System.out.println("¡Empieza la batalla!");
        //CREAMOS UN ALEATORIO ENTRE 7 PARA VER QUE SAMURAI EMPIEZA
        int samurairandom = aleatorio.nextInt(7);
        //PARA MOSTRARLO LE SUMAMOS 1, YA QUE EL SAMURAI 3, ESTARA EN LA POSICION 2 DEL ARRAY
        System.out.println("La batalla inicia con el Samurai " + (samurairandom + 1));
        //CREAMOS UNA VARIABLE DE BAJAS PARA CADA EQUIPO
        int bajas1 = 0;
        int bajas2 = 0;
        //MIENTRAS NINGUN EQUIPO TENG 4 BAJAS SE IRAN ENFRENTADO
        for (int i = samurairandom; bajas1 < 4 && bajas2 < 4; i++) {
            //SI LLEGAMOS AL SAMURAI 7, EN LUGAR DEL 8 SE PASARA AL 1
            if (i == 7) {
                i = 0;
            } //SI GANA SAMURAI 1, EL SAMURAI2 PASA A POTENCIA 0 Y SE LE SUMA UNA BAJA A EQUIPO 2
            if (equipo1[i] > equipo2[i]) {
                System.out.println("Samurai " + (i + 1) + ". " + equipo1[i] + " vs " + equipo2[i] + ". Gana Equipo 1.");
                equipo2[i] = 0;
                bajas2++;
            } else if (equipo2[i] > equipo1[i]) {
                //SI GANA SAMURAI 2, LO MISMO PERO AL REVES
                System.out.println("Samurai " + (i + 1) + ". " + equipo1[i] + " vs " + equipo2[i] + ". Gana Equipo 2.");
                equipo1[i] = 0;
                bajas1++;
            } else {
                //SI EMPATAN, MUEREN AMBOS Y BAJA PARA CADA EQUIPO
                System.out.println("Samurai " + (i + 1) + ". " + equipo1[i] + " vs " + equipo2[i] + ". Empate. Mueren ambos samuráis.");
                equipo1[i] = 0;
                equipo2[i] = 0;
                bajas1++;
                bajas2++;
            }
        }

        // SI EL EQUIPO 1 TIENE MAS BAJAS QUE EL 2 GANA EQUIPO 1
        if (bajas1 < bajas2) {
            System.out.println("¡Ha ganado el Equipo 1!");
            //Y SI NO, GANA EQUIPO 2
        } else {
            System.out.println("¡Ha ganado el Equipo 2!");
        }
    }

    public void vectpractica1() {
        int vect[] = {4, 8, 9, 1, 2, 2, 1, 3};
        int vectaux[] = new int[vect.length];
        int contador = 0;

        Arrays.sort(vect);

        for (int i = 0; i < vect.length - 1; i++) {
            if (vect[i] != vect[i + 1]) {
                vectaux[i] = vect[i];
            }
        }
        if (vect[vect.length - 2] == vectaux[vect.length - 2]) {
            vectaux[vect.length - 1] = vect[vect.length - 1];
        }

        for (int i = 0; i < vectaux.length; i++) {
            if (vectaux[i] != 0) {
                contador++;
            }
        }
        int vectfinal[] = new int[contador];

        for (int i = 0; i < vectaux.length - 1; i++) {
            for (int j = 0; j < vectfinal.length - 1; j++) {
                if (vectaux[i] != 0) {
                    vectfinal[i] = vectaux[j];
                }else{
                    j--;
                }
            }
        }

        System.out.println(Arrays.toString(vect));
        System.out.println(Arrays.toString(vectaux));

    }
}








