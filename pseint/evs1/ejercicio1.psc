Algoritmo ejercicio1
	// Ingresar dos (2) enteros por teclado, encontrar y mostrar el Mayor. 
	// En caso de que sean iguales, mostrar mensaje y salir. 
	// Generar Pseudocódigo y Diagrama de Flujo.
	definir Num1,Num2 como enteros;
	Escribir "dame el primer numero: ";
	Leer Num1;
	Escribir "dame el segundo numero: ";
	Leer Num2;
	Si Num1>Num2 Entonces
		Escribir "el mayor numero ingresado fue el ",Num1;
	SiNo
		Si Num1=Num2 Entonces
			Escribir "los dos numeros tienen el mismo valor";
		SiNo
			Escribir "el mayor numero ingresado fue el ",Num2;
		FinSi
	FinSi
FinAlgoritmo
