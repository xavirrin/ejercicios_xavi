package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Modos {

    public void excepciones() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el divisor: ");
        String numero = teclado.next();

        int dividendo = 0;

        System.out.println("Introduce el dividendo: ");

        if (teclado.hasNextInt()){

            dividendo = teclado.nextInt();
        }else{
            System.out.println("El formato no es numérico...");
        }

        int num_entero = 0;
        int division = 0;

        try{

            num_entero = Integer.parseInt(numero);
            division = dividendo / num_entero;


        }catch (NumberFormatException e1){

            System.out.println("No has escrito un número... " + e1.getMessage());

        }catch (ArithmeticException e2){

            System.out.println("El denominador es 0. División errónea. " + e2.getMessage());

        }finally {
            if (num_entero != 0){
                System.out.println("El resultado es " + division);
            }

        }

    }

    public void actividad(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("BIENVENIDO AL PROGRAMA DE LAS GENERACIONES");
        System.out.println("Elige un modo: ");
        System.out.println("   1. Año nacimiento");
        System.out.println("   2. Edad");

        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        int anyo_nac = 1800;

        boolean error = false ;


        if (modo.equals("1")){

            System.out.println("Introduce un año: ");
            String anyo_nacimiento = teclado.next();

            try{
                anyo_nac = Integer.parseInt(anyo_nacimiento);
            }catch (NumberFormatException e){
                System.out.println("Has introducido un formato erróneo. No es un número.");

            }

            if (anyo_nac<1900 || anyo_nac > anyo_actual){
                System.out.println("El año introducido no es correcto.");
                error = true;
            }


        } else if (modo.equals("2")) {

            int edad = 0;

            System.out.println("Introduce una edad: ");

            if (teclado.hasNextInt()){
                edad = teclado.nextInt();
            }else{
                System.out.println("La edad introducida no tiene un formato válido.");
            }

            if (edad<0){
                System.out.println("La edad introducida no es válida.");
                error=true;
            }else{
                anyo_nac = anyo_actual - edad;
            }

        }else{

            System.out.println("El modo introducido no es correcto.");

        }

        if (error==false){
            if (anyo_nac>= 1900 && anyo_nac<=1927){
                System.out.println("Eres de la Generación sin bautizar");
            } else if (anyo_nac>=1928 && anyo_nac<= 1944) {
                System.out.println("Eres de la Generación Silent");
            } else if (anyo_nac>=1945 && anyo_nac<= 1964) {
                System.out.println("Eres de la Generación Baby Boomers");
            } else if (anyo_nac>=1965 && anyo_nac<= 1981) {
                System.out.println("Eres de la Generación X");
            } else if (anyo_nac>=1982 && anyo_nac<= 1994) {
                System.out.println("Eres de la Generación Millenial");
            } else if (anyo_nac>=1995 && anyo_nac <= anyo_actual) {
                System.out.println("Eres de la Generación Centennials");
            }else{
                System.out.println("No eres de ninguna generación");
            }
        }


    }


}