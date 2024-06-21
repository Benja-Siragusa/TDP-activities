/*Crear un programa en java que permita ingresar el lado de un cuadrado por teclado y calcule y muestre por pantalla el perímetro y la superficie de la figura mediante dos métodos, uno sin retorno y el otro con retorno. */

import java.io.*;

public class act1{
    public static void main(String[] args) throws IOException{
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        float lado;

        System.out.print("ingrese el lado del cuadrado: ");
        dato = ext.readLine();
        lado = Float.parseFloat(dato);

        /*devolviendo el perimetro con el metodo sin retorno */
        perimetro(lado);

        /*devolviendo el area con el metodo con retorno */
        System.out.println("el cuadradp de lado " + lado + " tiene un area de " + area(lado));
    }

    /*metodo para calcular el perimetro sin retorno */
    static void perimetro(float lado) {
        float perim;
        perim=lado*4;
        System.out.println("el cuadradp de lado " + lado + " tiene un perimetro de " + perim);
    }

    /*metodo para calcular el area con retorno */
    static float area(float lado){
        return lado * lado;
    }
}

