import java.io.BufferedReader;
import java.io.InputStreamReader;
// estas dos lineas de arriba son lo mismo que poner import java.io.*;
public class Demo2 {
    public static void main(String[] args) throws Exception{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String nombre, apellido, color;
        Integer edad;
        System.out.println("ingrese su nombre: ");
        nombre=entrada.readLine();
        System.out.println("ingrese su apellido: ");
        apellido=entrada.readLine();
        System.out.println("ingrese su edad: ");
        edad=Integer.parseInt(entrada.readLine());
        System.out.println("ingrese su color favorito: ");
        color = entrada.readLine();
        System.out.println("\t Bienvenido \nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nColor favorito: "+color);
    }
}