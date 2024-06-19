Algoritmo ejercicio3
	// Se solicita al usuario que ingrese los valores de X e Y y luego 
	// determina en qué cuadrante se encuentra el punto representado 
	// por esas coordenadas. (ojo cuando X o Y son iguales a cero)
	definir cordX,cordY como real;
	Escribir "ingrese la coordenada X: ";
	Leer cordX;
	Escribir "ingrese la coordenada Y: ";
	Leer cordY;
	Si cordX>0; Entonces
		Si cordY>0; Entonces
			Escribir "su punto se encuentra en el cuadrante 1";
		SiNo
			Si cordY=0; Entonces
				Escribir "su punto se encuentra sobre eje X";
			SiNo
				Escribir "su punto se encuentra en el cuadrante 4";
			FinSi
		FinSi
	SiNo
		Si cordX=0; Entonces
			Si cordY=0; Entonces
				Escribir "su punto se encuentra en el origen del plano cartesiano";
			SiNo
				Escribir "su punto se encuentra sobre el eje Y";
			FinSi
		SiNo
			Si cordY>0 Entonces
				Escribir "su punto se encuentra en el cuadrante 2";
			SiNo
				Si cordY=0 Entonces
					Escribir "su punto se encuentra sobre el eje X";
				SiNo
					Escribir "su punto se encuentra en el cuadrante 3";
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
