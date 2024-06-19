Algoritmo sin_titulo
	Definir n1, n2, n3 Como Entero;
	Escribir 'deme un numero';
	Leer n1;
	Escribir 'deme otro numero';
	Leer n2;
	Escribir 'deme un ultimo numero';
	Leer n3;
	Si n1>n2 Entonces
		Si n2>n3 Entonces
			Escribir "el menor es el ",n3;
		SiNo
			Escribir "el menor es el ",n2;
		FinSi
	SiNo
		Si n1>n3 Entonces
			Escribir "el menor es el ",n3;
		SiNo
			Escribir "el menor es el ",n1;
		FinSi
	FinSi
FinAlgoritmo
