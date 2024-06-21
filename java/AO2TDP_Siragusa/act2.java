import java.io.*;

/*problema a resolver

Realizar un programa en Java que permita ingresar dos enteros A y B por teclado y calcule mediante
métodos:
- la suma si A y B son iguales.
- el Producto si A es Menor a B. (Utilice sumas sucesivas)
- El cociente si A es Mayor a B. Mostrar Cociente y Resto. (Utilice restas sucesivas). 

salida del programa:
-el resultado de la operacion correspondiente segun la entrada.

todas las variables son de tipo enteras
*/

public class act2 {
    /*
     * en el main pedimos los enetros y depende sus valores llamamos al metodo
     * correspondiente
     * seleccionandolo mediante un if
     */
    public static void main(String[] ar) throws IOException {
        int a, b;
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ingrese el primer entero: ");
        a = Integer.parseInt(ext.readLine());
        System.out.print("ingrese el segundo entero: ");
        b = Integer.parseInt(ext.readLine());
        if (a == b) {
            System.out.println("la suma de los enteros da " + suma(a, b));
        } else if (a < b) {
            System.out.println(a + " multiplicado por " + b + " da " + multiplicacion(a, b));
        } else {
            division(a, b);
        }
    }

    // creamos el metodo para la suma si ambos enteros son iguales
    static int suma(int a, int b) {
        return a + b;
    }

    /*
     * creamos el metodo para la multiplicacion y ponemos un if para poder asignarle
     * signo negativo
     * si la salida debe ser negativa
     */
    static int multiplicacion(int a, int b) {
        int r = 0, i;
        for (i = 0; i < Math.abs(b); i++) {
            r += a;
        }
        if (a < 0 && b > 0) {
            return -Math.abs(r);
        } else {
            return Math.abs(r);
        }
    }

    /* creamos el metodo para encontrar el cociente */
    static void division(int a, int b) {
        int r = 0;
        // caso donde ambos son positivos
        if (a > 0 && b > 0) {
            while (a >= b) {
                r++;
                a -= b;
            }
            System.out
                    .println("la division entre los numeros da un cociente igual a " + r + " y un resto igual a " + a);
        }
        // caso con a positivo y b negativo
        if (a > 0 && b < 0) {
            /*
             * en caso que el valor absoluto de a es menor que el de b damos mensaje de que
             * la
             * division da 0 y el resto es el numero a
             */
            if (Math.abs(a) < Math.abs(b)) {
                System.out.println("la division entre los numeros da un cociente igual a 0 y un resto igual a " + a);
            }
            /*
             * si el absoluto de a es mayor al de b, usamos las restas sucesivas y luego al
             * imprimir
             * imprimimos el valor absoluto del resultado que se guardo como positivo
             */
            else {
                while (a >= Math.abs(b)) {
                    r++;
                    a -= Math.abs(b);
                }
                System.out.println("la division entre los numeros da un cociente igual a " + (-Math.abs(r))
                        + " y un resto igual a " + a);
            }
        }
        /*
         * si los dos son negativos la division entre entero da 0 por lo que le
         * imprimimos el
         * resultado como 0 y el resto es el numero a
         */
        if (a < 0 && b < 0) {
            System.out.println("la division entre los numeros da un cociente igual a 0 y un resto igual a " + a);
        }
    }
}