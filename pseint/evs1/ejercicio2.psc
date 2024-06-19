Algoritmo ejercicio2
	// Ingresar tres (3) enteros por teclado, encontrar y mostrar el Mayor. 
	// En caso de que sean iguales, mostrar mensaje y salir. 
	// Generar Pseudocódigo y Diagrama de Flujo.
	Definir Num1, Num2, Num3 Como Entero;
	Escribir 'dame el primer numero: ';
	Leer Num1;
	Escribir 'dame el segundo numero: ';
	Leer Num2;
	Escribir 'dame el tercer numero: ';
	Leer Num3;
	Si Num1>=Num2 Entonces
		Si Num1=Num2 Entonces
			Si Num1>=Num3 Entonces
				Si Num1=Num3 Entonces
					Escribir "los tres numeros son iguales, su valor es ",Num1;
				SiNo
					Escribir "el numero ingresado mas grande son el primero y el segundo, cuyo valor es el mismo y es ",Num1;
				FinSi
			SiNo
				Escribir "el numero ingresado mas grande es el tercer ingresado, cuyo valor es ",Num3;
			FinSi
		SiNo
			Si Num1>=Num3 Entonces
				Si Num1=Num3 Entonces
					Escribir "el numero ingresado mas grande son el primero y el tercero, cuyo valor es ",Num1;
				SiNo
					Escribir "el numero mayor ingresado es el primero, cuyo valor es ",Num1;
				FinSi
			SiNo
				Escribir "el numero mayor ingresado es el tercero, su valor es ",Num3;
			FinSi
		FinSi
	SiNo
		Si Num2>=Num3 Entonces
			Si Num2=Num3 Entonces
				Escribir "el mayor numero ingresado son el segundo y el tercero, cuyo valor es ",Num2;
			SiNo
				Escribir "el numero mas grande ingresado es el segundo, cuyo valor es ",Num2;
			FinSi
		SiNo
			Escribir "el mayor numero ingresado es el tercero cuyo valor es ",Num3;
		FinSi
	FinSi
FinAlgoritmo
