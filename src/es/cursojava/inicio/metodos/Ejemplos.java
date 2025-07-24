package es.cursojava.inicio.metodos;

import es.cursojava.inicio.utils.Utilidades;

public class Ejemplos {

	public static void main(String[] args) {
		//metodo de la clase utilidades:
		int dimeEdad= Utilidades.calculaEdad(1989);
		System.out.println("Tu año de nacimiento es: " + dimeEdad );
		
		System.out.println("Ejercicio1----------------------" );
		Ejercicio1Metodos.tabla(4);
		
		System.out.println("Ejercicio1, apartado B-------------" );
		Ejercicio1Metodos.tablas(4, 6);
		
		System.out.println("Ejercicio2-----------------" );
		String[] tablaNombres = {"Juan", "Antonio", "ana", "Antonia"};
		int numNombres=Ejercicio2Metodos.nombres(tablaNombres);
		System.out.println("Cuantos nombres tienen A y T: " + numNombres);
		
		System.out.println("Ejercicio3---------------" );
		double rectangulo=Ejercicio3Metodos.rectangulo(2, 4);
		System.out.println("El resultado final del rectangulo es: " + rectangulo);
		
		System.out.println("Ejercicio4, apartado A:---------------------- " );
		Utilidades.pintaMenu(new String[]{"Ver productos", "Añadir producto", "Salir"});
		System.out.println("Ejercicio4, apartado B------------------ " );
		System.out.println("Ejercicio4, apartado C------------------" );
		System.out.println(Utilidades.pideDatoNumerico("Hola"));
		System.out.println("Ejercicio4, apartado D-----------------------" );
		Utilidades.pideDatoCadena("Adios");
	}

}
