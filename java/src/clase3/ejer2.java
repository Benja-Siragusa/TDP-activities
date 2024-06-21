package clase3;

import java.io.*;

/* Ingresar un entero por teclado en el programa principal*/
/* Mediante métodos y utilizando el valor ingresado por teclado: 
* calcular el perimetro de un cuadrado -> Metodo Sin Retorno
* calcular la superficie de un cuadrado -> Metodo con Retorno entero
* calcular la long de la circunf. -> Metodo con Retorno float
* calcular la superficie de la circunf. -> Metodo con Retorno double
*Retornar el valor de un nuero especificando si es positivo o no
*/

public class ejer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        int valorInt;
        boolean lMensaje;

        System.out.print("ingrese un entero: ");
        dato = ext.readLine();
        valorInt = Integer.parseInt(dato);

        // muestra el perimetro de un cuadrado de lado valorInt
        perimetroCuadrado(valorInt);

        /* muestra la superficie de un cuadrado */
        System.out.println("la superficie de un cuadrado de lado " + valorInt + " es de " + superfCuadrado(valorInt));

        /* muestra la longitud de una circunferencia */
        System.out.println(
                "la long de una circunferencia de radio " + valorInt + " es de " + longCircunferencia(valorInt));

        /* muestra la superficie de un circulo */
        System.out.println(
                "la superficie de una circunferencia de radio " + valorInt + " es de " + supCircunferencia(valorInt));

        /*
         * comprueba si el numero dado es positivo o negativo en el metodo y depende la
         * salida da mensajes
         */
        lMensaje = esPositivo(valorInt);
        if (lMensaje)
            System.out.println("el valor es positivo");
        else
            System.out.println("el valor es negativo");
    }
    // fin del main

    /* METODOS */
    /* calculando el perimetro de un cuadrado sin retrono*/
    static void perimetroCuadrado(int lado) {
        int perim;
        perim = lado * 4;
        System.out.println("el cuadradp de lado " + lado + " tiene un perimetro de " + perim);
    }

    /* calculando la superficie de un cuadradp con retorno\ pasamos por parametro el lado */
    static int superfCuadrado(int lado) {
        return lado * lado;
    }

    /*
     * calculando la longitud de una circunferencia \ pasamos por parametro el radio
     */
    static float longCircunferencia(int radio) {
        float lCirc;
        final float pi = (float) 3.1416;
        lCirc = 2 * pi * radio;
        return lCirc;
    }

    /*
     * calculando la superficie de una circunferencia \ pasamos por parametro el
     * radio
     */
    static double supCircunferencia(int radio) {
        double aCirc;
        // final float pi = (float)3.1416;
        aCirc = Math.PI * Math.pow(radio, 2);// math.pow elevea radio a la 2, radio seria el elemento a y el 2 el
                                             // elemento b
        return aCirc;
    }

    /* retorna valor booleano si el valor es positivo */
    static boolean esPositivo(int valor) {
        if (valor >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // FIN DE METODOS
}