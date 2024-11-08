package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Practica4 {
    public void Multipli3() {
        Scanner teclado = new Scanner(System.in);
        boolean tresCifrasUno = true;
        int num1 = 0;
        while (tresCifrasUno) {
            try {
                System.out.println("Introduce un número de 3 cifras.");
                num1 = teclado.nextInt();
                if (num1 <= 999 && num1 >= 100) {
                    tresCifrasUno = false;
                } else {
                    System.out.println("ERROR, el número debe tener 3 dígitos y no puede ser negativo ni 0.");
                }
            } catch (InputMismatchException err) {
                System.out.println("ERROR, el número no puede contener letras.");
                teclado.nextLine();
            }
        }

        boolean tresCifrasDos = true;
        int num2 = 0;
        while (tresCifrasDos) {
            try {
                System.out.println("Introduce otro número de 3 cifras.");
                num2 = teclado.nextInt();
                if (num2 <= 999 && num2 >= 100) {
                    tresCifrasDos = false;
                } else {
                    System.out.println("ERROR, el número debe tener 3 dígitos y no puede ser negativo ni 0.");
                }
            } catch (InputMismatchException err) {
                System.out.println("ERROR, el número no puede contener letras.");
                teclado.nextLine();
            }
        }

        System.out.println("El producto de la multiplicación es " + num1 * num2);
        System.out.println("El proceso es:");

        String numA = Integer.toString(num1);
        String numB = Integer.toString(num2);

        System.out.println("    " + numA);
        System.out.println("  x " + numB);
        System.out.println("-------------");

        String numB_3 = numB.substring(2, 3);
        String numB_2 = numB.substring(1, 2);
        String numB_1 = numB.substring(0, 1);

        int num_3 = Integer.parseInt(numB_3);
        int num_2 = Integer.parseInt(numB_2);
        int num_1 = Integer.parseInt(numB_1);

        System.out.println("    " + num1 * num_3);
        System.out.println("   " + num1 * num_2 + "x");
        System.out.println("  " + num1 * num_1 + "xx");
        System.out.println("-------------");

        System.out.println("  " + num1 * num2);

    }
}


