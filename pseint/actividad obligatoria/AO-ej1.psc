Algoritmo sin_titulo
	// tenemos que definir el area de una figura formada x un semiciruclo unido a dos triangulos recangulo, 
	// donde nos dan un cateto que es el radio del semicirculo y la hipotenusa de un triangulo (ambos triangulos son iguales)
	Definir area, h, altura, r, areaCirculo, areaTriangulo Como Real;
	Escribir 'dame la hipotenusa del triangulo: ';
	Leer h;
	Escribir 'dame el cateto: ';
	Leer r;
	// luego de definir las variables y pedir los datos, calculamos el area
	areaCirculo <- pi*(r*r);
	areaCirculo <- areaCirculo/2;
	// al saber el area, sacamos el area de un circulo con ese radio y lo dividimos en dos
	altura <- ((h*h)-(r*r));
	altura <- raiz(altura);
	// haciendo pitagora (a*a + b*b = h*h), sabiendo que a son los catetos y la h la hipotenusa, 
	// podemos obtener el cateto restante que es la altura de nuestro triangulo
	areaTriangulo <- (r*altura);
	// como son 2 triangulos, sacamos el area de uno sin dividir por dos en su formula para posteriromente evitar multiplicar x 2
	area <- areaCirculo+areaTriangulo;
	Escribir 'el area de la figura es ', area;
FinAlgoritmo
