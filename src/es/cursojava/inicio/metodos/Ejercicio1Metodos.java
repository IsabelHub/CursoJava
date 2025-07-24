
/*
 * 	Ejercicio 1
====================================================================================
	En una clase 
	+ Escribe un método que pinte la tabla de multiplicar de un numero 
	que le pases
	+ Escribe un método que pinte las tablas de multiplicar de los 
	números que estén entre dos números que le pases
	+ Desde el main llamar a los dos métodos

 * */

package es.cursojava.inicio.metodos;

public class Ejercicio1Metodos {

	public static void tabla(int numero) {    
	    System.out.println("La tabla de multiplicar del : "+ numero);
	    for (int i = 1; i <= 10; i++) { 
	        System.out.println(i+ "X" + numero + " = "+ i*numero );
	    }   
	}

	public static void tablas(int numero1, int numero2) {
	    for (int i=numero1 ; i<=numero2 ; i++ ) {
	    	System.out.println("Tabla del "+i);
	    	
	    	for (int j=1 ; j<=10 ; j++ ) {
	    		System.out.print(i + "X" + j + " = "+ i*j + "\n" );
	    	}
	    }
	    
	}

}
