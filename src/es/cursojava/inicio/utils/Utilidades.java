package es.cursojava.inicio.utils;
/*
 * ====================================================================================
EN la clase Utilidades crear métodos:

+ pintaMenu le vamos a pasar un array de Strings y nos va a mostrar 
todas las opciones que vengan en el array 
y al final va a pintar "Introduce una opción"

+ pintaMenu le vamos a pasar un array de Strings y un String texto. 
Nos va a mostrar todas las opciones que vengan en el array 
y al final nos va pintar el contenido de la variable texto

+ pideDatoNumerico al que le pasamos un String denominado Texto. 
El método tiene que pintar el texto que le pasamos, recoger un dato numérico (int) 
por la consola y devolver el dato que se ha introducido

+ pideDatoCadena al que le pasamos un String denominado Texto. 
El método tiene que pintar el texto que le pasamos, recoger un dato (String)  
por la consola y devolver el dato que se ha introducido
 * 
 * */

import java.util.Scanner;

public class Utilidades {

    static Scanner sc = new Scanner(System.in);

	public static int calculaEdad(int anioNacimiento) {
		int anioActual = 2025;
		int edad = anioActual - anioNacimiento;
		return edad;
	}

	public static void pintaMenu(String[] opciones) {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i]);
		}
		System.out.println("Introduce una opción");
	}

	public static void pintaMenu(String[] opciones, String texto) {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i]);
		}
		System.out.println("Texto:" + texto);
	}
	
	public static int pideDatoNumerico (String texto) {
		System.out.println("Texto:" + texto);
		System.out.println("Introduce dato Numerico:  ");
		int datoNumerico=sc.nextInt();
		return datoNumerico;
	}
	public static String pideDatoCadena (String texto) {
		System.out.println("El texto introducido es: "+ texto);
		System.out.println("Introduce texto:  ");
		String textoIntroducido=sc.nextLine();
		return textoIntroducido;
	}
}
