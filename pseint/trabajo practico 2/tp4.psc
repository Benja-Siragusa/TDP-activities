Algoritmo sin_titulo
	definir n,x,i como entero;
	Escribir "ingrese un numero entre 1 y 10";
	Leer n;
	x <- 1;
	Si n<=10 Entonces
		Si n>=1 Entonces
			Para i<-1 Hasta n Con Paso 1 Hacer
				x <- x * i;
			FinPara
			Escribir "el factorial de ",n," es ",x;
		SiNo
			Escribir "el numero debe encontrarse entre 1 y 10";
		FinSi
	SiNo
		Escribir "el numero debe encontrarse entre 1 y 10";
	FinSi
FinAlgoritmo
