package es.cursojava.inicio.strings;
/*
 * Ejercicio 2
==============================
Escribe un programa que determine si un String ingresado por el usuario 
es un palíndromo (se lee igual de izquierda a derecha que de derecha a
izquierda, ignorando mayúsculas y espacios).
 * 
 * */

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa palabra: ");
		String original = sc.nextLine();
		String alreves = "";
		boolean palindromo = true;

		String primero = original.toLowerCase();

		for (int i = primero.length() - 1; i >= 0; i--) {
			alreves += primero.charAt(i);
		}
		// Comparar
		if (primero.equals(alreves)) {
			System.out.println("Es un palíndromo");
		} else {
			System.out.println("No es un palíndromo");

		}

	}

}
