import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Escribir un programa en java que permita ingresar el Nombre del Usuario, un número entero. Mostrar por pantalla "Bienvenido "el nombre del usuario, el doble y el triple del entero ingresado por teclado, en líneas separadas.

public class act2 {
    public static void main(String[] ar) throws IOException{
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String nombre,n;
        int numero;

        System.out.print("ingrese su nombre de usuario: ");
        nombre = ext.readLine();
        System.out.print("ingrese un numero: ");
        n = ext.readLine();
        numero = Integer.parseInt(n);

        System.out.println(" bienvenido "+nombre+"\nel numero que ingreso es el "+numero+"\nel doble de ese numero es "+numero*2+"\nel triple de ese numero es "+numero*3);
    }
}
