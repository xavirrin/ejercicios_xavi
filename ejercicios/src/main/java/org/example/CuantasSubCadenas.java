package org.example;

import java.util.Scanner;

public class CuantasSubCadenas {
    public void cuantas(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el texto");
        String texto = entrada.nextLine();
        System.out.println("Introduce la palabra que quieres buscar");
        String palabra = entrada.nextLine();

        String nueva_palabra = " " + palabra + " ";

        String nuevo_texto = texto.replace(" " +palabra+ " ", "");
        int veces = texto.length() - nuevo_texto.length();
        int aparece = veces/palabra.length();

        System.out.println("La palabra " +palabra + " aparece " + aparece + " veces");
    }



}
