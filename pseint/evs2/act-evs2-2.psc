Algoritmo sin_titulo
	// Ingresar por teclado N enteros en un proceso repetitivo Mientras hasta que 
	// se ingrese un cero. Al finalizar mostrar el Mayor, la cantidad y el promedio de los valores ingresados.
	Definir n, mayor, cantidad Como Entero;
	Definir promedio Como Real;
	Escribir 'ingrese un numero';
	Leer n;
	cantidad <- 0;
	promedio <- 0;
	Mientras n<>0 Hacer
		cantidad <- cantidad+1;
		promedio <- promedio+n;
		Si cantidad=1 Entonces
			mayor <- n;
		FinSi
		Si n>mayor Entonces
			mayor <- n;
		FinSi
		Escribir 'ingrese un numero';
		Leer n;
	FinMientras
	promedio <- promedio/cantidad;
	Escribir 'usted ingreso ', cantidad, ' numeros, el mayor fue el ', mayor, ' y el promedio total es de ', promedio;
FinAlgoritmo
