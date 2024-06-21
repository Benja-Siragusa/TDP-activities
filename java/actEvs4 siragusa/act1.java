import java.io.*;
/*
 * Escribir un programa en java que permita ingresar su apellido, nombre y edad. Mostrar por pantalla
 */
public class act1{
    public static void main(String[] ar) throws IOException{
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String nombre, apellido, edad;

        System.out.print("ingrese su nombre: ");
        nombre = ext.readLine();
        System.out.print("ingrese su apellido: ");
        apellido = ext.readLine();
        System.out.print("ingrese su edad: ");
        edad = ext.readLine();

        System.out.println("su nombre es "+nombre+" su apellido "+apellido+" y su edad "+edad+" años");
    }    
}
