Algoritmo ejercicio3
	// Realice un algoritmo para determinar cu�nto se debe pagar por equis 
	// cantidad de l�pices considerando que si son 1000 o m�s el costo es de $85; 
	// de lo contrario, el precio es de $90. 
	// Repres�ntelo con el pseudoc�digo y el diagrama de flujo.
	definir cantidad,precio como enteros;
	Escribir "ingrese la cantidad de lapices a comprar: ";
	Leer cantidad;
	Si cantidad>=1000; Entonces
		precio <- 85;
	SiNo
		precio <- 90;
	FinSi
	Escribir "por la compra de ",cantidad," de lapices, el costo de cada uno es de ",precio,"$, dando un total de ",cantidad*precio,"$ por todos los lapices";
FinAlgoritmo
