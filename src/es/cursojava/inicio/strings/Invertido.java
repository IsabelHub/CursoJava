package es.cursojava.inicio.strings;
/*
 * Ejercicio 1
==============================
Escribe un programa que reciba un String y devuelva el texto invertido.

*/

public class Invertido {
	public static void main(String[] args) {
		String original = "Hola Mundo";
		
		String invertido = "";
		
        for (int i = original.length()- 1; i >= 0; i--) {
            invertido += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Invertido: " + invertido);
		
		
	}
}