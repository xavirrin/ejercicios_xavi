package org.example;

import java.util.Scanner;

public class intentos {
    public void intento(){
        Scanner entrada = new Scanner(System.in);
        int intentos = 9;

        System.out.println("JUGADOR 1; ESCRIBA UNA FRASE.");
        String frase = entrada.nextLine();

        System.out.println("JUGADOR 2; ESCRIBA UNA PALABRA.");
        String palabra = entrada.nextLine();

        while (intentos > 0){
            if (frase.contains(palabra)){
                System.out.println("ENHORABUENA, LA PALABRA ES CORRECTA.");
                intentos = 0;

            }else{
                System.out.println("INTENTO FALLIDO. TE QUEDAN " + intentos + " INTENTOS.");
                intentos -=1;
                palabra = entrada.nextLine();
            }
        }
        if (intentos == 0){
            System.out.println("SE ACABARON LOS INTENTOS.");
        }
    }
}

