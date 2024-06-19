Algoritmo ejercicio1
	// Se desea calcular la distancia recorrida por un móvil que tiene 
	// una velocidad constante (m/s) durante un tiempo T(seg), 
	// considerar que es MRU (Movimiento Rectilíneo Uniforme). 
	// Elabore el algoritmo y pseudocódigo correspondiente
	definir velocidad,tiempo,distancia como real;
	Escribir "digiame a que velocidad va el movil em m/s: ";
	Leer velocidad;
	Escribir "digame durante cuanto tiempo anduvo el movil a esa velacidad en segundos: ";
	Leer tiempo;
	distancia <- tiempo*velocidad;
	Escribir "el movil en los ",tiempo," segundos que anduvo a ",velocidad,"m/s recorrio ",distancia," metros.";
FinAlgoritmo
