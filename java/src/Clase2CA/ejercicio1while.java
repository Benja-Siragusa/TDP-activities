package Clase2CA; // Declaración del paquete

import java.io.*; // Importación de clases necesarias de la biblioteca java.io
public class ejercicio1while { 
    // Este es el método main, el punto de entrada del programa
    public static void main(String[] ar) throws Exception { 
        // Todo lo que está dentro de estos corchetes es parte del método main

        // Configuración de la entrada
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
        
        // Declaración de variables
        int sMayor = 0, sMenor = 0;
        float sueldo, acuMayor=0, acuMenor=0, promedio;
        String dato;

        // Bucle para iterar sobre la cantidad de sueldos ingresados
        do { 
            System.out.print("ingrese el sueldo (ingrese 0 para finalizar)");
            dato = entrada.readLine(); // Leer el sueldo desde la entrada
            sueldo = Float.parseFloat(dato); // Convertir la entrada a un float
            if (sueldo > 20000) { // Condición para contar sueldos mayores a 20000
                sMayor++;
                acuMayor=acuMayor+sueldo;
            } else if(sueldo>1){
                sMenor++;
                acuMenor=acuMenor+sueldo;
            }
        }
        while(sueldo!=0);
        promedio=(acuMayor+acuMenor)/(sMayor+sMenor);
        System.out.println("la cantidad de sueldos dados es de " + (sMayor+sMenor) + "\nla cantidad de sueldos mayores a 20.000 es de " + sMayor + "\nla cantidad de sueldos menores a 20.000 es de " + sMenor+"\nel importe de los sueldos mayores es de "+acuMayor+"\nel importe de los sueldos menores es de "+acuMenor+"\nel importe total de los sueldos es de "+(acuMayor+acuMenor)+"\nel promedio de los sueldos es de "+promedio);
    }
}
