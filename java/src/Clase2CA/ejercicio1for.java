package Clase2CA; // Declaración del paquete

import java.io.*; // Importación de clases necesarias de la biblioteca java.io

/*
     * cargar n sueldos en un proceso repetitivo, determinar y mostrar al finalizar
     * la cantidad de cueldos mayores a 20000 y menores o iguales a 20000 y el total
     * de sueldos ingresados
     */
    /*
     * Variables:
     * N int
     * Sueldo float
     * sMayor int
     * sMenor int
     * proceso:
     * obtener sueldo mayor, menor y el total
     * salido:
     * mostrar los datos obtenidos
     */

// Definición de la clase Ejercicio1B
public class ejercicio1for { 
    // Este es el método main, el punto de entrada del programa
    public static void main(String[] ar) throws Exception { 
        // Todo lo que está dentro de estos corchetes es parte del método main

        // Configuración de la entrada
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
        
        // Declaración de variables
        int n, sMayor = 0, sMenor = 0;
        float Sueldo;
        String dato;

        // Solicitar la cantidad de sueldos a comparar
        System.out.print("deme la cantidad de sueldos a comparar: ");
        dato = entrada.readLine(); // Leer la cantidad de sueldos desde la entrada
        n = Integer.parseInt(dato); // Convertir la entrada a un entero

        // Bucle para iterar sobre la cantidad de sueldos ingresados
        for (int i = 0; i < n; i++) { 
            System.out.print("ingrese el sueldo ");
            dato = entrada.readLine(); // Leer el sueldo desde la entrada
            Sueldo = Float.parseFloat(dato); // Convertir la entrada a un float
            if (Sueldo > 20000) { // Condición para contar sueldos mayores a 20000
                sMayor++;
            } else {
                sMenor++;
            }
        }
        
        // Imprimir los resultados
        System.out.println("la cantidad de sueldos dados es de " + n + "\nla cantidad de sueldos mayores a 20.000 es de " + sMayor + "\nla cantidad de sueldos menores a 20.000 es de " + sMenor);
    }
}
