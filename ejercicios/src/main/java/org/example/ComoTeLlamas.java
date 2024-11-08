package org.example;

import java.util.Scanner;

public class ComoTeLlamas {
    public void comoTeLamas() {
        System.out.println("¿Cómo te llamas?");
        Scanner entradaScanner = new Scanner(System.in);

        String nombre = entradaScanner.nextLine();
        System.out.println("Encantado " + nombre + ", y, ¿A qué curso vas?");
        String curso = entradaScanner.nextLine();
        System.out.println("Vaya, " + curso + " es un curso bastante complicado, " + nombre);
        entradaScanner.close();
    }
}
