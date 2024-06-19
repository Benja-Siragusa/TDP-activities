Algoritmo sin_titulo
	// Diseñe un programa que permita ingresar una serie de ?n? temperaturas 
	// tomadas en una determinada región. Determinar e imprimir la mayor de ellas.
	Definir temperatura, mayor, i, cantidad Como Entero;
	Escribir 'cuantas temperaturas ingresara?';
	Leer cantidad;
	i <- 0;
	Repetir
		Escribir 'ingrese una temeratura';
		Leer temperatura;
		Si i=0 Entonces
			mayor <- temperatura;
		FinSi
		Si mayor<temperatura Entonces
			mayor <- temperatura;
		FinSi
		i <- i+1;
	Mientras Que i<cantidad
	Escribir 'la temperatura maxima ingresada fue ', mayor;
FinAlgoritmo
