package org.example;

import java.util.Scanner;

public class Excepciones {

    public void excepciones () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero...");

        String numero = entrada.nextLine();

        int dividendo = 0;

        System.out.println("Introduce el dividendo");

        if (entrada.hasNextLine()) {

            dividendo = entrada.nextInt();

        }else{
            System.out.println("Error, el formato no es numérico...");
        }
        int num_entero = 0;
        int division = 0;

        System.out.println("El resultado es " + division);

        try {

             num_entero = Integer.parseInt(numero);
            division = dividendo / num_entero;

        } catch (NumberFormatException e1) {

            System.out.println("No has escrito un nñumero..." + e1.getMessage());

        } catch (ArithmeticException e2) {

            System.out.println("El formato no es numérico..." + e2.getMessage());

        }finally{
            if (num_entero != 0) {
                System.out.println("El resultado es " + division);
            }

        }
        }
    }





