Algoritmo sin_titulo
	definir nota,aprobados,total,i como enteros;
	definir promedio como real;
	aprobados <- 0;
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "ingrese la nota del alumno: ";
		Leer nota;
		Si nota>=6 Entonces
			aprobados <- aprobados +1;
		FinSi
		total <- total+nota;
	FinPara
	Escribir "el numero total de aprobados es de ",aprobados," y el promedio de los diez alumnos es de ",total/10;
FinAlgoritmo
