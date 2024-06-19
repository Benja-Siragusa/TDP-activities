Algoritmo sin_titulo
	// Escribir y ejecutar un programa que simule una calculadora simple. Lee dos enteros y un carácter. 
	// Si el carácter es un "+", se imprime la suma; si es un "-", se imprime la diferencia; si es un "*", 
	// se imprime el producto; si es "/", se imprime el cociente;  y si es "%", se imprime el resto.
	Definir n1, n2 Como Entero;
	Definir car Como Cadena;
	Escribir 'deme el primer numero de la operacion';
	Leer n1;
	Escribir 'deme el segundo numero de la operacion';
	Leer n2;
	Escribir 'indique que operacion desea realizar: suma +, resta -, multiplicacion *, division /, resto %';
	Leer car;
	Segun car Hacer
		'+':
			Escribir 'el resultado de ', n1, car, n2, ' es ', n1+n2;
		'-':
			Escribir 'el resultado de ', n1, car, n2, ' es ', n1-n2;
		'*':
			Escribir 'el resultado de ', n1, car, n2, ' es ', n1*n2;
		'/':
			Escribir 'el resultado de ', n1, car, n2, ' es ', n1/n2;
		'%':
			Escribir 'el resultado de ', n1, car, n2, ' es ', n1 MOD n2;
	FinSegun
FinAlgoritmo
