Algoritmo sin_titulo
	definir nota como caracter;
	Escribir "deme la nota de su examen";
	Leer nota;
	Segun nota Hacer
		"A","a":
			Escribir "su nota es: Excelente";
		"B","b":
			Escribir "su nota es: Notable";
		"C","c":
			Escribir "su nota es: Aprobado";
		De Otro Modo:
			Escribir "su nota es: Desaprobado";
	FinSegun
FinAlgoritmo
