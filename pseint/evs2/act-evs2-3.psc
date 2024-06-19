Algoritmo sin_titulo
	// Ingresar por teclado N enteros en un proceso repetitivo Repetir hasta que se ingrese un cero. 
	// Al finalizar mostrar el Mayor, la cantidad y el promedio de los valores ingresados. 
	Definir n, mayor, cantidad Como Entero;
	Definir promedio Como Real;
	cantidad <- -1;
	promedio <- 0;
	Repetir
		Escribir 'ingrese un numero';
		Leer n;
		cantidad <- cantidad+1;
		promedio <- promedio+n;
		Si cantidad=1 Entonces
			mayor <- n;
		FinSi
		Si n>mayor Entonces
			mayor <- n;
		FinSi
	Mientras Que n<>0
	promedio <- promedio/cantidad;
	Escribir 'usted ingreso ', cantidad, ' numeros, el mayor fue el ', mayor, ' y el promedio total es de ', promedio;
FinAlgoritmo
