package org.example;

import java.util.Scanner;

public class Practica1 {
    public void NumeroSuerte() {
        Scanner entrada = new Scanner(System.in);

        boolean x = true;
        System.out.println("Introduzca su fecha de nacimiento en formato DD/MM/AAAA.");
        while (x) {
            String fecha = entrada.nextLine();

            if (fecha.length() == 10 && fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
                try {
                    int dia = Integer.parseInt(fecha.substring(0,2));
                    int mes = Integer.parseInt(fecha.substring(3,5));
                    int anyo = Integer.parseInt(fecha.substring(6,10));
                    int suma = dia + mes + anyo;

                    if (dia <= 31 && dia >= 1 && mes <= 12 && mes >= 1 && anyo >= 1000 && anyo <= 9999) {
                        System.out.println(dia + "+" + mes + "+" + anyo + "=" + suma);
                        String sumaa = Integer.toString(suma);
                        int anyo1 = Integer.parseInt(sumaa.substring(0,1));
                        int anyo2 = Integer.parseInt(sumaa.substring(1,2));
                        int anyo3 = Integer.parseInt(sumaa.substring(2,3));
                        int anyo4 = Integer.parseInt(sumaa.substring(3,4));
                        int sumaanyo = anyo1 + anyo2 + anyo3 + anyo4;

                        System.out.println(anyo1 + "+" + anyo2 + "+" + anyo3 + "+" + anyo4 + "=" + sumaanyo);
                        System.out.println("¡Su número de la suerte es el " + sumaanyo + "!");

                   x = false;
                    } else {
                       System.out.println("Error, introduzca una fecha válida con días, meses y años correctos.");
                    }
                } catch (NumberFormatException e) {
                 System.out.println("Error, introduzca la fecha en un formato correcto.");
                }
            } else {
                System.out.println("Error, el formato debe ser DD/MM/AAAA.");
            }
        }
    }
}
