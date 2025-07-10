package es.cursojava.inicio.strings;
/*
 * Escribe un programa que reciba un String con varias palabras separadas por espacios 
 * y determine cuál es la palabra más larga.
 * */
import java.util.Scanner;

public class PalabraLarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la frase: ");
		String frase = sc.nextLine();
		String palabraActual = "";
		String palabraMasLarga = "";
		int longitudActual = 0;
		int maxLongitud = 0;

		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c != ' ') {
				palabraActual += c;
				longitudActual++;

			} else 
			{
				if (longitudActual > maxLongitud) 
				{
					palabraMasLarga = palabraActual;
					maxLongitud = longitudActual;
				}
				// reiniciar antes de volver a la siguiente iteraacion del for
				palabraActual = " ";
				longitudActual = 0;
			}
		}
		System.out.println("La palabra más larga " + "tiene " + maxLongitud + " caracteres");
	}
}
