package es.cursojava.inicio.metodos;
/*
 * Ejercicio 2
	====================================================================================
	En una clase 
	+ Escribe un método que reciba un array de Strings con nombres y 
	devuelva el número de nombres que empiecen por A y contengan una t
	+ Desde el main generar el array con los nombres y llamar al método anterior,
	indicar cuantos nombres cumplen esa condición.
 * */
public class Ejercicio2Metodos {
	public static int nombres(String[] nombres) {

	    int contador=0;
	    for(int i=0; i<nombres.length;i++)
	    {	    	
	    	if(nombres[i].startsWith("A")&&(nombres[i].contains("t")))
	    	{
	    		contador++;
	    	}	    	
	    }
	    return contador;
	}

}
