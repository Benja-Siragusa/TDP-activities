Algoritmo sin_titulo
	//debemos mostrar el precio del plato x persona para un evento, si asisten 200 personas o menso el plato vale 95, 
	//si asisten entre 200 y 300 vale 85 y si asisten mas de 300 vale 75
	
	//definimos las variables y solicitamos los datos
	definir pers,precioPlato como entero;
	escribir "cuantas personas tendra el evento?";
	leer pers;
	//hacemos el algoritmo que calcule en base a la cantidad de personas el precio y luego mostramos el relutado
	si pers <= 200 Entonces
		precioPlato <- 95;
	SiNo
		si pers <= 300
			precioPlato <- 85;
		SiNo
			precioPlato <- 75;
		FinSi
	FinSi
	escribir "para ",pers," invitados, el precio por plato es de ",precioPlato,"$ por persona, dando un total de ",pers*precioPlato,"$";
FinAlgoritmo
