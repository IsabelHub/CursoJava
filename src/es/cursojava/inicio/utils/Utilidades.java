
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

package es.cursojava.inicio.utils;

import java.util.Scanner;

public class Utilidades {

	static Scanner sc = new Scanner(System.in);

	private static String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro",
			"La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };

	private static String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve",
			"atrapa", "conduce", "enciende" };

	private static String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín",
			"la calle", "el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };

	public static String generateRandomPhrase() {
		return sujetos[(int) (Math.random() * 12)] + " " + verbos[(int) (Math.random() * 12)] + " "
				+ complementos[(int) (Math.random() * 12)] + " ";
	}

	// TODO: show letters that have been introduced
	public static void hangMan() {
		// generar frase
		String phrase = generateRandomPhrase();
		System.out.println("la frase es: " + phrase);
		String letters = "";
		String character = "";
		// pedir nombre usuario
		String userName = Utilidades.pideDatoCadena("Ingresa tu nombre");
		// inicializar vidas
		int attemps = 7;
		System.out.println(userName + " vamos a jugar ahorcado, buena suerte!");
		// un ciclo mientras tenga vida o encuentre la frase
		while (attemps > 0) {
			System.out.println("Tienes " + attemps + " vidas");
			printPhraseHangMan(phrase, letters);
			character = Utilidades.pideDatoCadena("Ingresa una letra:");
			letters = letters.concat(character);
			if (!phrase.contains(character)) {
				attemps--;
			}
			// comentario
			if (wasPhraseFound(phrase, letters)) {
				System.out.println("Felicidades " + userName + " has ganado");
				break;
			}
			showLetters(letters);
		}
		if (attemps == 0) {
			System.out.println("Que pena " + userName + ", has perdido!");
		}

	}

	public static void showLetters(String letters) {
		System.out.print("\nLas letras que has introducido son: ");
		for (int i = 0; i < letters.length(); i++) {
			System.out.print(letters.charAt(i) + " ");
		}
		System.out.println();
	}

	public static boolean wasPhraseFound(String phrase, String letters) {
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ' && !letters.contains(String.valueOf(phrase.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public static void printPhraseHangMan(String phrase, String letters) {
		for (int i = 0; i < phrase.length(); i++) {
			if (letters.contains(String.valueOf(phrase.charAt(i)))) {
				System.out.print(phrase.charAt(i));
			} else if (phrase.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print("_");
			}
		}
		System.out.println();
	}

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

	public static int pideDatoNumerico(String texto) {
		System.out.println("Texto:" + texto);
		System.out.println("Introduce dato Numerico:  ");
		int datoNumerico = sc.nextInt();
		return datoNumerico;
	}

	public static String pideDatoCadena(String texto) {
		System.out.println("El texto introducido es: " + texto);
		System.out.println("Introduce texto:  ");
		String textoIntroducido = sc.nextLine();
		return textoIntroducido;
	}
}
