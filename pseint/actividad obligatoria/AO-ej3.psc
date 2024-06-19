Algoritmo sin_titulo
	// "En un establecimiento educativo se desea saber la edad promedio de sus alumnos por sexo, el
	// promedio total, la mayor de las edades por sexo y la cantidad de alumnos total y por sexo. Construya
	// un algoritmo que permita resolver esta situación. El ingreso finaliza cuando se ingresa una edad igual
	// a cero. Represéntelo mediante el diagrama de flujo y el pseudocódigo utilizando el ciclo apropiado"
	Definir edad, sexo, nTotal, nTotalM, nTotalH, mayorM, mayorH Como Entero;
	// definimos todaslas variables enteras en una sola linea y no como en dos como en el diagrama original, agregamos las variables
	// para calcular los mayores y eliminamos las variables de suma ya que la cuenta de promedios la haremos luego de dividir el total
	// de las sumas de edades entre la cantidad de alumnos
	Definir promM, promH, promT Como Real;
	// el diagrama original se referia a empleados en vez de a alumnos, en la siguiente linea asignamos valor 0 a las variables
	nTotal <- 0;
	nTotalM <- 0;
	nTotalH <- 0;
	mayorH <- 0;
	mayorM <- 0;
	promT <- 0;
	promH <- 0;
	promM <- 0;
	Escribir 'ingrese la edad del alumno';
	Leer edad;
	// solicitamos la edad como en el diagrama original para validar correctamente el bucle
	Mientras edad<>0 Hacer
		// solicitamos el sexo y comparamos si es hombre o mujer para agregar los datos en las variables que corresponda
		Escribir 'indique el sexo del alumno, 1 si es hombre, 2 si es mujer';
		Leer sexo;
		Si sexo=1 Entonces
			nTotal <- nTotal+1;
			nTotalH <- nTotalH+1;
			promH <- promH+edad;
			promT <- promT+edad;
			// comprobamos el mayor de las edades
			Si edad>mayorH Entonces
				mayorH <- edad;
			FinSi
		SiNo
			nTotal <- nTotal+1;
			nTotalM <- nTotalM+1;
			promM <- promM+edad;
			promT <- promT+edad;
			// comprobamos el mayor de las edades
			Si edad>mayorM Entonces
				mayorM <- edad;
			FinSi
		FinSi
		// volvemos a solicitar la edad antes de iniciar el bucle para si es 0 no sume datos a las variables
		Escribir 'ingrese la edad de otro alumno';
		Leer edad;
	FinMientras
	// calculamos los promedios ya que en las variables de promedio fuimos sumando todas las edades, las dividimos por los totales
	promH <- promH/nTotalH;
	promM <- promM/nTotalM;
	promT <- promT/nTotal;
	// mostramos ya todos los resultados de manera eficiente y con los calculos ya hechos
	Escribir 'la edad promedio de los alumnos es de ', promT;
	Escribir 'la edad promedio de los hombres es de ', promH;
	Escribir 'la edad promedio de las mujeres es de ', promM;
	Escribir 'el hombre con mas años tiene ', mayorH;
	Escribir 'la mujer con mas años tiene ', mayorM;
	Escribir 'la cantidad de alumnos total es de ', nTotal;
	Escribir 'la cantidad total de varones es de ', nTotalH;
	Escribir 'la cantidad total de mujeres es de ', nTotalM;
FinAlgoritmo
