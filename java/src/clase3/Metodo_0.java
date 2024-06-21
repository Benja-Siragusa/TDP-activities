package clase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metodo_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String name, datoTeclado, sPersona;
        int edad;

        System.out.print("Ingrese el nombre de la Persona: ");
        name = ext.readLine();

        System.out.print("Ingrese la edad de la Persona: ");
        datoTeclado = ext.readLine();
        edad = Integer.parseInt(datoTeclado);

        mostrarPersona(name, edad);

        System.out.print("Ingrese el nombre de la Persona: ");
        name = ext.readLine();

        System.out.print("Ingrese la edad de la Persona: ");
        datoTeclado = ext.readLine();
        edad = Integer.parseInt(datoTeclado);

        sPersona=retornoPersona(name, edad);
        System.out.println(sPersona);
    }

    /* metodo que muestra por pantalla el nombre de usuario */
    static void mostrarPersona(String name, int edad) {
        System.out.println("bienvenido " + name + " UD Tiene " + edad + " años");
    }

    /* metodo que retorna mensajea mostrar */
    static String retornoPersona(String nombre, int edad) {
        String dato;
        dato="\nBuenas tardes "+nombre+" usted tiene "+edad+" años";
        return dato;
    }
} // fin de la clase
