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

    public void primitiva() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
//BIENVENIDA A LA SUPERPRIMITIVA. EMPEZAMOS PIDIENDO UN BOLETO CON UN FORMATO ESPECIFICO
        System.out.println("\nBienvenido al sorteo de la Primitiva.");
        System.out.println("\n¿Con qué número desea jugar? ");
        System.out.println("\nEl formato debe ser (0-0-0-0-0-0/0)");
        //LE METO YA EL TRY PARA QUE SI EL FORMATO NO ES CORRECTO NO ME PETE
        try {
            //CREAMOS EL BOLETO DEL JUGADOR EN UN STRING
            String boleto = teclado.nextLine();
            //Y BOOLEANO CONTROLANDO EL FORMATO
            boolean formato_boleto = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");
            //SI EL FORMATO ES INCORRECTO: ERROR
            if (!formato_boleto) {
                System.out.println("El formato es incorrecto.");
                //SI NO, SEGUIMOS
            } else {
                //Y LE QUITAMOS MEDIANTE SPLIT LOS GUIONES Y LA BARRA
                String boleto_array[] = boleto.split("[-/]");
                System.out.println(Arrays.toString(boleto_array));
                //CREAMOS UN VECTOR INT
                int boleto_num[] = new int[boleto_array.length];

                //Y VOLCAMOS EN ÉL EL VECTOR STRING
                for (int i = 0; i < boleto_array.length; i++) {
                    boleto_num[i] = Integer.parseInt(boleto_array[i]);
                }
                //CREAMOS BOOLEANO PARA CONTROLAR QUE LOS NUMEROS ESTEN ENTRE 1 Y 49
                boolean boleto_correcto = true;

                for (int i = 0; i < boleto_num.length; i++) {
                    if (i < boleto_num.length - 1 && (boleto_num[i] < 1 || boleto_num[i] > 49)) {
                        System.out.println("Lo siento, los números del boleto deben estar entre 01 y 49.");
                        boleto_correcto = false;
                    } else if (i == boleto_num.length - 1 && (boleto_num[i] < 0 || boleto_num[i] > 9)) {
                        System.out.println("El número del reintegro debe estar entre 0 y 9.");
                        boleto_correcto = false;
                    }
                }
                //EN CASO DE ERROR EL BOOLEANO ES FALSO Y NO SERIAN VALIDOS, SI ES VALIDO SEGUIMOS
                if (boleto_correcto) {
                    System.out.println("El boleto es válido.");
                    //VAMOS CON EL SORTEO
                    //CREAMOS ARRAY PARA EL SORTEO CON LENGHT DEL BOLETO - 1 PARA NO CALCULAR EL REINTEGRO
                    int sorteo_boleto[] = new int[boleto_array.length - 1];
                    for (int i = 0; i < sorteo_boleto.length; i++) {
                        sorteo_boleto[i] = aleatorio.nextInt(49) + 1;
                    }
                    //LO ORDENAMOS
                    Arrays.sort(sorteo_boleto);
                    //Y CREAMOS BOOLEANO FALSO PARA CONTROLAR QUE ESTA ORDENADO Y SIN REPETIDOS
                    boolean boleto_ordenado = false;
                    //MIENTRAS NO ESTE CORRECTO, EMPEZAMOS EL BUCLE HACIENDOLO TRUE, PARA QUE SI NO SE CONVIERTE
                    //AL TERMINAR, PODAMOS SALIR DEL BUCLE, MIENTRAS NO SEA ASI, SEGUIREMOS CALCULANDO RANDOMS
                    while (!boleto_ordenado) {
                        boleto_ordenado = true;

                        for (int i = 0; i < sorteo_boleto.length - 1; i++) {
                            if (sorteo_boleto[i] == sorteo_boleto[i + 1]) {
                                sorteo_boleto[i] = aleatorio.nextInt(49) + 1;
                                boleto_ordenado = false;
                            }
                        }
                        //Y LO VOLVEMOS A ORDENAR
                        Arrays.sort(sorteo_boleto);
                    }
                    System.out.println("\nHa salido:");
                    System.out.println("\t" + Arrays.toString(sorteo_boleto));

                    //AHORA VAMOS A CALCULAR EL NUMERO COMPLEMENTARIO
                    int complementario;
                    //SEGUIMOS CON LOS BOOLEANOS
                    boolean comple_repe = true;
                    //HACEMOS UN DO WHILE PARA QUE AL MENOS LO CALCULE UNA VEZ
                    do {
                        complementario = aleatorio.nextInt(49) + 1;
                        comple_repe = false;
                        //Y SI ESTA REPETIDO LO VOLVEMOS A CALCULAR
                        for (int i = 0; i < sorteo_boleto.length; i++) {
                            if (complementario == sorteo_boleto[i]) {
                                comple_repe = true;
                                break;
                            }
                        }
                    } while (comple_repe);

                    System.out.println("\tNúmero complementario: " + complementario);

//                    sorteo_boleto[6] = complementario;

                    //Y CALCULAMOS UN NUMERO ENTRE 1 Y 10 PARA EL REINTEGRO
                    int reintegro;
                    boolean reintegro_repe = true;
                    //HACEMOS UN DO WHILE PARA QUE AL MENOS LO CALCULE UNA VEZ
                    do {
                        reintegro = aleatorio.nextInt(10);
                        reintegro_repe = false;
                        //Y SI ESTA REPETIDO LO VOLVEMOS A CALCULAR
                        for (int i = 0; i < sorteo_boleto.length; i++) {
                            if (reintegro == sorteo_boleto[i]) {
                                reintegro_repe = true;
                                break;
                            }
                        }
                    } while (reintegro_repe);
                    System.out.println("\tReintegro: " + reintegro);

                    //UNA VEZ TENEMOS EL SORTEO TERMINADO, VAMOS A VER CUANTO HEMOS ACERTADO
                    //CREAMOS CONTADOR DE ACIERTOS
                    int aciertos = 0;
                    //Y HACEMOS DOS BUCLES FOR ANIDADOS PARA IR COMPARANDO TODOS LOS NUMEROS DEL BOLETO SORTEADO
                    //CON CADA NUMERO DE NUESTRO BOLETO INTRODUCIDO
                    for (int i = 0; i < sorteo_boleto.length; i++) {
                        for (int j = 0; j < sorteo_boleto.length; j++) {
                            if (boleto_num[i] == sorteo_boleto[j]) {
                                //Y SI HAY ALGUNA COINCIDENCIA NOS ANOTAMOS UN TANTO
                                aciertos++;
                            }
                        }
                    }
                    //MOSTRAMOS EL RESULTADO
//                    System.out.println("\nHa acertado " + aciertos);
                    switch (aciertos) {
                        case 0:
                            System.out.println("0 aciertos. No premiado.");
                            break;
                        case 1:
                            System.out.println("1 acierto. No premiado.");
                            break;
                        case 2:
                            System.out.println("2 aciertos. No premiado.");
                            break;
                        case 3:
                            System.out.println("3 aciertos. Premio de 5ª categoría.");
                            break;
                        case 4:
                            System.out.println("4 aciertos. Premio de 4ª categoría.");
                            break;
                        case 5:
                            System.out.println("5 aciertos. Premio de 3ª categoría.");
                            break;
                        case 6:
                            if (aciertos == 5) {
                                sorteo_boleto[6] = complementario;
                                boolean complementario_correcto = Arrays.asList(sorteo_boleto).contains(complementario);
                                if (complementario_correcto) {
                                    System.out.println("5 aciertos + número complementario. Premio de 2ª categoría.");
                                }
                            }
                            break;
                        case 7:
                            System.out.println("¡Wow! Has acertado los 6 números y el reintegro. Ya no tendrás que coger el bus nunca más.");
                        default:
                    }
                    if (boleto_num[boleto_num.length - 1] == reintegro) {
                        System.out.println("\n¡Enhorabuena! Te llevas el reintegro");
                    }
                }
            }
            //Y AQUI TENEMOS EL TRY DEL PRINCIPIO QUE CONTROLA EL FORMATO
        } catch (NumberFormatException e) {
            System.out.println("El formato es incorrecto.");
        }
    }

    public void sopa_letras() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la sopa de letras.");
        //COMENZAMOS INICIALIZANDO FILAS Y COLUMNAS PORQUE SI LO HAGO DENTRO DEL TRY CATCH LUEGO NO EXISTEN
        int filas = 0;
        int columnas = 0;
        //CREAMOS BOOLEANO PARA CONDICIONAR UN BUCLE EN EL QUE PIDAMOS UN NUMERO DE FILAS Y DE COLUMNAS
        // Y QUE NO NOS VALGA NINGUNA OTRA COSA QUE NUMEROS
        boolean fc_numeros = false;
        while (!fc_numeros) {
            try {
                System.out.println("Introduce el número de filas que tendrá:");
                //METEMOS FILAS
                filas = teclado.nextInt();
                System.out.println("Ahora el número de columnas:");
                //METEMOS COLUMNAS
                columnas = teclado.nextInt();
                fc_numeros = true; // SALIMOS DEL BUCLE SI ESTAN CORRECTAS
            } catch (InputMismatchException e) {
                System.out.println("Error. Debe introducir solo números.");
                teclado.nextLine(); //LIMPIAMOS EL BUFFER PARA NO ENTRAR EN EL BUCLE INFINITO
            }
        }

        teclado.nextLine(); // ESTO LO HE HECHO PORQUE NO FUNCIONABA SI NO LO HACÍA, NO ENTIENDO MUY BIEN POR QUE LO HAGO
        //PERO DESPUES DE PELEARME UNA HORA CON EL CODIGO, INTERNET ME HA DICHO QUE ME FALTABA ESTO...

        //CREAMOS NUESTRA MATRIZ PARA LA SOPA DE LETRAS CON TAMAÑO ANTES INTRODUCIDO EN FILAS Y COLUMNAS
        String sopa[][] = new String[filas][columnas];

        //Y ABRIMOS FOR PARA EMPEZAR A LLENAR LA SOPA
        for (int i = 0; i < filas; i++) {
            //BOOLEANO PARA ASEGURARME DE QUE EL FORMATO ES CORRECTO, SOLO LETRAS MINS. Y MAYS.
            boolean formato = false;
            while (!formato) {
                //AQUI LE PONGO A LA FIILA I + 1 PARA QUE EL USUARIO LO ENTIENDA MEJOR
                System.out.println("Introduce las letras de la fila " + (i + 1) + " (deben ser " + columnas + " letras):");
                //TRY CATCH PARA CONTROLAR QUE NO SE ROMPA SI HAY MAS LETRAS DE LAS QUE CABEN
                try {
                    String fila = teclado.nextLine();
                    fila = fila.toLowerCase();
                    //SI EL FORMATO ES EL QUE BUSCAMOS Y TIENE EXACTAMENTE EL NUMERO DE LETRAS QUE DE LENGTH,
                    //BOOLEANO TRUE PARA PODER SALIR DEL BUCLE
                    if (fila.matches("[a-zA-Z]+") && fila.length() == columnas) {
                        formato = true;
                    //AQUI VAMOS INTRODUCIENDO CADA LETRA DEL STRING INTRODUCIDO MEDIANTE EL CHARAT(J)
                        //EN LA POSICION I J
                        for (int j = 0; j < columnas; j++) {
                            sopa[i][j] = String.valueOf(fila.charAt(j));
                        }
                    } else {
                        System.out.println("Error. Debes introducir " + columnas + " letras.");
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Error. Debe introducir " + columnas + " letras.");
                }
            }
        }
        //UNA VEZ QUE TENEMOS NUESTRA SOPA DE LETRAS CREADA
        System.out.println("\nSopa de letras creada:");
        //LA MOSTRAMOS.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //VAMOS MOSTRANDO CADA FILA
                System.out.print(sopa[i][j] + " ");
            } // Y LE AÑADIMOS UN PRINLN PARA QUE LA SIGUIENTE FILA QUEDE DEBAJO
            System.out.println();
        }
        //AHORA VAMOS A BUSCAR UNA PALABRA DE IZQ A DCHA Y DE ARRIBA A ABAJO
        System.out.println("Introduce la palabra a buscar:");
        //GUARDAMOS PALABRA
        String palabra = teclado.nextLine();
        //HACEMOS QUE NO DISTINGA ENTRE MAYS Y MINS
        palabra = palabra.toLowerCase();

        //Y HACEMOS LO MISMO QUE ANTES PARA CONTROLAR QUE ESTE TANTO EN MINS COMO EN MAYS PERO SIN NUMEROS
        boolean formato2 = palabra.matches("[a-zA-Z]+");
        //SI ES CORRECTO SEGUIMOS
        if (formato2) { //Y SEPARAMOS LA PALABRA MEDIANTE SPLIT PARA CONVERTIRLA EN ARRAY
            String palabraArray[] = palabra.split("");
            //CREAMOS BOOLEANO PARA DETERMINAR SI ENCONTRAMOS LA PALABRA
            boolean palabra_encontrada = false;
            //DOBLE FOR PARA BUSCAR EN HORIZONTAL Y VERTICAL
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    // Y AHORA VAMOS A BUSCAR SI LA PALABRA INTRODUCIDA ESTA EN HORIZONTAL:
                    //PARA ELLO EMPEZAMOS DESCARTANDO LAS LETRAS QUE NO TENGAN SUFICIENTE ESPACIO A SU DERECHA
                    //COMO PARA SER LA PALABRA CORRECTA. EN CASO DE BUSCAR HOLA, SI HUBIERA UNA H EN LA ULTIMA POSICION
                    //DE UNA FILA, NO EMPEZARIA EL FOR PARA BUSCAR
                    if (j + palabraArray.length <= columnas) {
                        //Y AHORA CREAMOS BOOLEANO PARA VER SI LA LETRA DE LA SOPA VA COINCIDIENDO CON LA QUE BUSCAMOS
                        boolean letra_coincide = true;
                        //CREAMOS FOR PARA QUE MIENTRAS K SEA MENOR QUE EL LENGTH DE LA PALABRA BUSCADA VAYA AUMENTANDO
                        for (int k = 0; k < palabraArray.length; k++) {
                            //Y AQI ESTA LA CLAVE. SI LA POSICION + K ES IGUAL QUE LA POSICION K DE LA PALABRA BUSCADA,
                            //SEGUIMOS BUSCANDO HASTA LLEGAR AL FIN DEL LENTGH DE LA PALABRA BUSCADA
                            //PERO SI NO ES IGUAL, BOOLEANO FALSO,
                            if (!sopa[i][j + k].equals(palabraArray[k])) {
                                letra_coincide = false;
                                j += k; // LE SUMAMOS K A LA POSICION EN LA QUE ESTEMOS PARA QUE NO VUELVA A EMPEZAR
                                //DESDE EL PRINCIPIO Y CAIGA EN EL MISMA LETRA INFINITAMENTE, Y SALIMOS CON BREAK
                                break;
                            }
                        }//SI EL BOOLEANO ES TRUE, LE DAMOS TRUE A PALABRA ENCONTRADA Y LA MOSTRAMOS COMO ENCONTRADA
                        if (letra_coincide) {
                            palabra_encontrada = true;
                            System.out.println("Palabra encontrada!!! En posición " + i + " , " + j + ", en horizontal.");
                        }
                    }
                    //Y SEGUIMOS BUSCANDO EN VERTICAL
                    if (i + palabraArray.length <= filas) {
                        //REPETIMOS MISMA OPERACIN PERO EN VERTICAL,
                        boolean letra_coincide = true;
                        //SUMANDOLE K A I, EN LUGAR DE A J
                        for (int k = 0; k < palabraArray.length; k++) {
                            if (!sopa[i + k][j].equals(palabraArray[k])) {
                                letra_coincide = false;
                                break;
                            }
                        }// SI ENCONTRAMOS PALABRA EN VERTICAL, BOOELANO TRUE Y MOSTRAMOS
                        if (letra_coincide) {
                            palabra_encontrada = true;
                            System.out.println("Palabra encontrada!!! En posición " + i + " , " + j + ", en vertical.");
                        }
                    }
                }
            }
            //SI NO HEMOS VERIFICADO BOOLEANO, NO HEMOS ENCONTRADO PALABRA
            if (!palabra_encontrada) {
                System.out.println("Palabra no encontrada en la sopa de letras.");
            }
        } else {
            System.out.println("La palabra debe contener únicamente letras.");
        }
    }
}