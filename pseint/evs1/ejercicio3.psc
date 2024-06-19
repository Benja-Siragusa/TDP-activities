Algoritmo ejercicio3
	// Realice un algoritmo para determinar cuánto se debe pagar por equis 
	// cantidad de lápices considerando que si son 1000 o más el costo es de $85; 
	// de lo contrario, el precio es de $90. 
	// Represéntelo con el pseudocódigo y el diagrama de flujo.
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
