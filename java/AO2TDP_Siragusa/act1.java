import java.io.*;

/*Realizar un programa en Java que determine el sueldo semanal de N trabajadores considerando que
se les descuenta 5% de su sueldo si ganan entre 0 y 150 pesos. Se les descuenta 7% si ganan más de
150 pero menos de 300, y 9% si ganan 300 pesos o más. Los datos son horas trabajadas, sueldo por
hora y nombre de cada trabajador. Utilice el ciclo más apropiado. 

salida del programa:
- el nombre del empleado y su sueldo semanal ya con su descuento ya hecho
*/
public class act1 {
    public static void main(String[] ar) throws IOException {
        BufferedReader ext = new BufferedReader(new InputStreamReader(System.in));
        float horas, sueldoXhora;
        int n, i;
        String nombre, dato;

        // pidiendo a cuantos empleados les debemos calcular el sueldo
        System.out.print("ingrese el numero de empleados a los que les calcularemos el sueldo: ");
        dato = ext.readLine();
        n = Integer.parseInt(dato);

        // bucle para poder calcular el sueldo de N empleados
        for (i = 0; i < n; i++) {
            // pidendo los datos, el nombre, las horas y el sueldo por hora de cada empleado
            System.out.print("*************************\ningrese el nombre del empleado: ");
            nombre = ext.readLine();
            System.out.print("ingrese la cantidad de horas que trabajo: ");
            dato = ext.readLine();
            horas = Float.parseFloat(dato);
            System.out.print("ingrese el sueldo x hora que recibe: ");
            dato = ext.readLine();
            sueldoXhora = Float.parseFloat(dato);

            // devolviendo el nombre y su salario semanal llamando al metodoc reado mas
            // abajo para calcular el mismo
            System.out.println("El sueldo semanal de " + nombre + " es de " + sueldo(horas, sueldoXhora) + "$");
        }
    }

    // declarando un metodo para calcular el sueldo semanal
    static float sueldo(float horas, float sueldoXhora) {
        float sueldoSemanal;
        sueldoSemanal = horas * sueldoXhora;
        if (sueldoSemanal > 0 && sueldoSemanal <= 150)
            sueldoSemanal = sueldoSemanal - (sueldoSemanal * (0.05f));
        else if (sueldoSemanal <= 300)
            sueldoSemanal = sueldoSemanal - (sueldoSemanal * (0.07f));
        else
            sueldoSemanal = sueldoSemanal - (sueldoSemanal * (0.09f));
        return sueldoSemanal;
    }
}