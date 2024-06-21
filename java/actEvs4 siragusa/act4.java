import java.io.*;

/*Escribir programa que lea por teclado el valor del radio de una circunferencia, calcule y muestre por pantalla la longitud y el área de la circunferencia. (Tener en cuenta el tipo de variable a utilizar). */

public class act4 {
    public static void main(String[] args) throws IOException{
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        double radio, longitud, sup;

        System.out.print("ingrese el radio de la circunferencia: ");
        dato = ext.readLine();
        radio = Float.parseFloat(dato);

        longitud = Math.PI *radio*2;
        sup = Math.PI * Math.pow(radio, 2);

        System.out.println("una circunferencia de radio "+radio+" tiene un perimetro de "+longitud+" y una superficie de "+sup);
    }
}
