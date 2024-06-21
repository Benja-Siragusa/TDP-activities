import java.io.*;

/*Escribir un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. */

public class act3 {
    public static void main(String[] args) throws IOException{
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        float grados;
        System.out.print("ingrese la temperatura en grados centigrados: ");
        dato = ext.readLine();
        grados = Float.parseFloat(dato);

        System.out.println(grados+"º centigrados es igual a "+(grados*1.8 + 32)+"º fahrenheit");
    }
}
