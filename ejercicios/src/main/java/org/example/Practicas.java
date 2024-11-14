package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
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
                                default:
                                    System.out.println("La operación introducida no es válida, inténtelo de nuevo.");
                                    break;
                            }
                        } catch (ArithmeticException e) {
                            System.out.println("Ocurrió un error en la operación aritmética.");
                        }

                        uno = false; //
                    }
                }
            }

            teclado.nextLine();
        }
    }

    public void isbn() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un ISBN de 10 dígitos.");
        System.out.println("Puedes usar '?' para un dígito faltante.");
        String isbn = teclado.nextLine();
        //Pedimos un ISBN y damos la opcion de introducirlo con una ? en vez de un digito para adivinarlo
        if (isbn.length() != 10) {
            System.out.println("El ISBN debe tener exactamente 10 dígitos.");
            //Guardamos el lenght del ISBN, y si no tiene 10 digitos salimos
        } else {
            int suma = 0;
            int multiplicador = 10;
            int posicionFaltante = -1;
            // En caso de que si, creamos 3 variables que utilizaremos a continuacion
            for (int i = 0; i < 10; i++) {
                int ii;
                // Creamos un for para recorrer el isbn con i
                if (isbn.charAt(i) == '?') {
                    //Si detecta que hay una interrogacion,
                    posicionFaltante = i; // Guarda la posición del dígito faltante.
                } else if (i == 9 && isbn.charAt(i) == 'X') {
                    //Si solo detecta 9 digitos y una X,
                    ii = 10;
                    //Le damos a X el valor 10.
                    suma += ii * multiplicador;
                } else {
                    ii = isbn.charAt(i) - '0';

                    if (ii < 0 || ii > 10) {
                        //Si el isbn contiene menos de 0 o mas de 10 digitos
                        System.out.println("El ISBN debe contener solo números o una 'X' al final.");
                    } else {
                        suma += ii * multiplicador;
                        //Vamos acumulando en la suma, la multiplicacion del digito que corresponda,
                        //por la variable multiplicador a la que le hemos dado un valor de 10,
                        //y le vamos restando 1
                    }
                    multiplicador--;
                }
            }
            if (posicionFaltante != -1) {
                // Si posicion faltante ha registrado que hay una ?, dandole a la variable el valor de
                //su posicion:
                int valorFaltante = (11 - (suma % 11)) % 11;
                //Creamos variable que valga el resto de la resta de 11 menos el resto de la suma
                String resultado = (valorFaltante == 10) ? "X" : String.valueOf(valorFaltante);
                //Creamos tambien resultado. Que valdra, si el valor es 10, X, y si no
                //convertimos en cadena el resultado para mostrarlo
                System.out.println("El dígito faltante es: " + resultado);
                //Y mostramos el digito que falta en el isbn para ser correcto
            } else {
                // Si el resto de la division entre la suma y 11 es 0, (si es multiplo de 11)
                if (suma % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                    //El isbn es valido
                } else {
                    System.out.println("El ISBN no es válido.");
                    //En caso contrario es invallido
                }
            }
        }
    }

    public void ruleta() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeros[] = new int[37];
        String colores[] = {"rojo", "negro"};
        String paroimpar[] = {"par", "impar"};
        int fichas = 1000;

        System.out.println("Bienvenido al casino de los sueños.");

        for (int i = 0; i < 37; i++) {
            numeros[i] = i;
        }

        while (fichas > 0) {
            System.out.println("Dispone de " + fichas + " X (Fichas Xavo)");
            System.out.println("Cuántas X quiere apostar?");
            try {
                int fichasplayer = teclado.nextInt();

                if (fichasplayer > fichas || fichasplayer <= 0) {
                    System.out.println("Apuesta inválida. Debe apostar entre 1 y " + fichas + " fichas.");
                    continue;
                }

                fichas -= fichasplayer;

                System.out.println("Introduzca un número entre 0 y 36.");
                try {
                    int numplayer = teclado.nextInt();
                    teclado.nextLine();

                    if (numplayer < 0 || numplayer > 36) {
                        System.out.println("ERROR, el número debe estar entre 0 y 36");
                        fichas += fichasplayer;
                        continue;
                    }

                    if (numplayer == 0) {
                        int sorteo_numeros = numeros[aleatorio.nextInt(numeros.length)];
                        System.out.println("Ha tocado el número " + sorteo_numeros);

                        if (sorteo_numeros == 0) {
                            System.out.println("¡Felicidades! Has acertado con el 0, ganas y todos los demás pierden.");
                            fichas += fichasplayer * 36;
                        } else {
                            System.out.println("Lo siento, no has acertado. Ha salido " + sorteo_numeros + ".");
                        }
                        continue;
                    }

                    System.out.println("Introduzca un color (Rojo / Negro)");
                    String colorplayer = teclado.nextLine().toLowerCase();

                    if (!Arrays.asList(colores).contains(colorplayer)) {
                        System.out.println("Error, el color debe ser 'Rojo' o 'Negro'.");
                        fichas += fichasplayer;
                        continue;
                    }

                    System.out.println("¿Qué elige, par o impar?");
                    String paroimparplayer = teclado.nextLine().toLowerCase();

                    if (!Arrays.asList(paroimpar).contains(paroimparplayer)) {
                        System.out.println("Error, debe ser 'par' o 'impar'.");
                        fichas += fichasplayer;
                        continue;
                    }

                    String sorteo_color = colores[aleatorio.nextInt(colores.length)];
                    int sorteo_numeros = numeros[aleatorio.nextInt(numeros.length)];
                    String sorteo_par = (sorteo_numeros % 2 == 0) ? "par" : "impar";
                    System.out.println("Ha tocado " + sorteo_numeros + " " + sorteo_color + " " + sorteo_par);

                    boolean aciertoNumero = sorteo_numeros == numplayer;
                    boolean aciertoColor = sorteo_color.equals(colorplayer);
                    boolean aciertoParImpar = sorteo_par.equals(paroimparplayer);

                    if (aciertoNumero && aciertoColor && aciertoParImpar) {
                        System.out.println("¡Felicidades! Has acertado en número, color y par/impar.");
                        fichas += fichasplayer * 36 * 4;
                    } else {
                        if (aciertoNumero) {
                            System.out.println("Número " + numplayer + "... ¡Correcto!");
                            fichas += fichasplayer * 36;
                        } else {
                            System.out.println("Número " + numplayer + "... Es incorrecto. Lo siento.");
                        }
                        if (aciertoColor) {
                            System.out.println("Color " + colorplayer + "... ¡Correcto!");
                            fichas += fichasplayer * 2;
                        } else {
                            System.out.println("Color " + colorplayer + "... Es incorrecto. Lo siento.");
                        }
                        if (aciertoParImpar) {
                            System.out.println(paroimparplayer + "... ¡Correcto!");
                            fichas += fichasplayer * 2;
                        } else {
                            System.out.println(paroimparplayer + "... Es incorrecto. Lo siento.");
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Lo siento, solo puede introducir números.");
                    teclado.nextLine();
                    fichas += fichasplayer;
                }
            } catch (InputMismatchException e) {
                System.out.println("Lo siento, solo puede introducir números.");
                teclado.nextLine();
            }
        }
        System.out.println("Te has quedado sin fichas. Gracias por jugar.");
    }
}
//8. El programa debe sortear al azar un color y un número aleatoriamente. Si es par o impar se debe calcular.
//
//9. Mostrar qué color, opción par/impar y número han tocado tras "girar" la ruleta.
//
//10. Verificar si el usuario ha tenido suerte.
//
//Si acierta tanto número como color y que es par/impar (mostrar que HA GANADO).
//Si acierta sólo el color (mostrar que ha acertado el color).
//Si acierta sólo si es par o impar (mostrar que ha acertado que es par/impar).
//Si acierta el número (mostrar que ha acertado el número). En caso de ser 0, notificar que HA GANADO y los demás usuarios de la mesa pierden.
//Si no acierta nada, mostrar que ha perdido.

