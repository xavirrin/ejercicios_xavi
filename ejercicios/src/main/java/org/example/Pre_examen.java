package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pre_examen {
    public void ej1() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cantidad");
        int cantidad = teclado.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce número " + i + ":");
            int numm = teclado.nextInt();
            if (numm > 0) {
                System.out.println("El numero " + numm + " es mayor que 0.");
            } else if (numm < 0) {
                System.out.println("El numero " + numm + " es menor que 0.");
            } else {
                System.out.println("El numero " + numm + " es 0.");
            }

        }
    }

    public void ej2() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número.");
        int base = teclado.nextInt();
        int valorbase = base;

        System.out.println("Introduce su exponente.");
        System.out.println("Recuerda que debe ser positivo.");
        int exp = teclado.nextInt();

        while (exp < 0) {
            System.out.println("El exponente debe ser positivo.");
            exp = teclado.nextInt();
        }
        int resultado = 1;

        for (int i = 1; i <= exp; i++) {
            resultado *= valorbase;


            System.out.println(resultado + " x " + valorbase + " = " + (resultado * valorbase));
        }
        System.out.println("El resultado es " + resultado * valorbase);
    }

    public void ej3() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿En cuántas cuotas desea pagar?");
        int total = 0;
        boolean x = true;
        while (x) {
            try {
                int cuotas = teclado.nextInt();
                if (cuotas > 0) {

                    int cuota = 10;

                    for (int i = 1; i <= cuotas; i++) {
                        System.out.println("Cuota " + i + ": " + cuota);
                        total = cuota;
                        cuota += cuota;

                    }
                    System.out.println("El precio total de su condensador de fluzo es " + total + "€.");
                    x = false;
                } else {
                    System.out.println("El número de cuotas debe ser al menos 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir números.");
                teclado.nextLine();
            }
        }
    }

    public void ej4() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la nota de su examen.");
        try {
            int nota = teclado.nextInt();

            switch (nota) {
                case 0, 1, 2, 3, 4:
                    System.out.println("INSUFICIENTE");
                    break;
                case 5:
                    System.out.println("SUFICIENTE");
                    break;
                case 6:
                    System.out.println("BIEN");
                    break;
                case 7, 8:
                    System.out.println("NOTABLE");
                    break;
                case 9, 10:
                    System.out.println("SOBRESALIENTE");
                    break;
                default:
                    System.out.println("NO VÁLIDO");
            }
        } catch (InputMismatchException e) {
            System.out.println("La nota debe ser numérica.");
        }
    }

    public void ej5() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 5 sueldos.");

        System.out.println("Sueldo 1.");
        int sueldo1 = teclado.nextInt();

        System.out.println("Sueldo 2.");
        int sueldo2 = teclado.nextInt();

        System.out.println("Sueldo 3.");
        int sueldo3 = teclado.nextInt();

        System.out.println("Sueldo 4.");
        int sueldo4 = teclado.nextInt();

        System.out.println("Sueldo 5.");
        int sueldo5 = teclado.nextInt();

        int sueldomaximo = sueldo1;

        if (sueldo2 > sueldomaximo) {
            sueldomaximo = sueldo2;
        }
        if (sueldo3 > sueldomaximo) {
            sueldomaximo = sueldo3;
        }
        if (sueldo4 > sueldomaximo) {
            sueldomaximo = sueldo4;
        }
        if (sueldo5 > sueldomaximo) {
            sueldomaximo = sueldo5;
        }
        System.out.println("El sueldo más alto es " + sueldomaximo);
    }

    public void ej6() {

        Scanner teclado = new Scanner(System.in);
                int edadtotal = 0;
                int alturatotal = 0;
                int edadmedia = 0;
                int alturamedia = 0;

                boolean x = true;

                while (x) {
                    System.out.println("¿Cuántos niños vamos a registrar?");
                    try {
                        int numninyos = teclado.nextInt();
                        if (numninyos < 1) {
                            System.out.println("Lo siento, debe introducir al menos un niño.");
                        } else {
                            System.out.println("De acuerdo, registraremos " + numninyos + " niños.");

                            boolean y = true;
                            while (y) {
                                try {
                                    for (int i = 1; i <= numninyos; i++) {
                                        System.out.println("Introduzca la altura del niño " + i + " en centímetros.");
                                        int edad = teclado.nextInt();
                                        if (edad < 1) {
                                            System.out.println("La edad debe ser de al menos 1 año.");
                                        } else {
                                            System.out.println("Introduzca la edad del niño " + i + ".");
                                            int altura = teclado.nextInt();
                                            if (altura < 1) {
                                                System.out.println("Lo siento, la altura debe ser superior a 1 cm.");
                                            } else {
                                                if (edad > 18) {
                                                    edadtotal = edadtotal + 1;

                                                if (altura > 175) {
                                                    alturatotal = alturatotal + 1;
                                                }
                                                }
                                                edadmedia += edad;
                                                alturamedia += altura;
                                            }
                                        }
                                    }

                                    int edadmediatotal = edadmedia / numninyos;
                                    int alturamediatotal = alturamedia / numninyos;

                                    System.out.println("La edad media es: " + edadmediatotal);
                                    System.out.println("La altura media es: " + alturamediatotal + " cm.");
                                    if (edadtotal > 1 || edadtotal == 0) {
                                        System.out.println("Hay " + edadtotal + " niños mayores de 18 de años.");
                                    } else {
                                        System.out.println("Hay " + edadtotal + " niño mayor de 18 años.");
                                    }
                                    if (alturatotal > 1 || alturatotal == 0) {
                                        System.out.println("Hay " + alturatotal + " niños por encima de los 175 cm.");
                                    } else {
                                        System.out.println("Hay " + alturatotal + " niño por encima de los 175 cm.");
                                    }
                                    y = false;
                                } catch (InputMismatchException er) {
                                    System.out.println("Introduzca números por favor.");
                                    teclado.nextLine();
                                }
                            }
                            x = false;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Introduzca números, por favor.");
                        teclado.nextLine();
                    }
                }
                teclado.close();
            }

            public void ej7(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números vas a registrar?");
        int num = teclado.nextInt();
        if(num<=0){
            System.out.println("El número debe ser mayor que 0.");
        }



            }
        }
//Desarrolla un programa en Java que permita al usuario generar una secuencia de números
// en la que cada número es la suma de los dos anteriores, comenzando desde 0 y 1.
// El programa debe realizar lo siguiente:
//
//Solicitar al usuario que ingrese un número entero positivo que indique cuántos
// términos de la secuencia desea ver.
//Calcular y mostrar la secuencia hasta el número de términos especificado.
//Si el usuario ingresa un número inválido (por ejemplo, un número negativo o cero),
// el programa debe mostrar un mensaje de error y solicitar un nuevo número.
//Ejemplo de Salida:
//Si el usuario introduce un 5, la salida debe ser:
//Secuencia de Números: 0 1 1 2 3
//Si el usuario introduce un 10, la salida debe ser:
//Secuencia de Números: 0 1 1 2 3 5 8 13 21 34