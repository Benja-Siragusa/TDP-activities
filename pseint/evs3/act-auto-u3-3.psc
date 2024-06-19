Algoritmo sin_titulo
	// Dado un conjunto ?n? de números enteros, imprimir 
	// aquellos que sean divisibles por k , ingresado desde el teclado.
	Definir n, k, i Como Entero;
	Escribir 'ingrese hasta que numero de enteros comprobaremos los numeros divisibles por K';
	Leer n;
	Escribir 'ingrese el valor K';
	Leer k;
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si i MOD k=0 Entonces
			Escribir i, ' es divisible por ', k;
		FinSi
	FinPara
FinAlgoritmo
