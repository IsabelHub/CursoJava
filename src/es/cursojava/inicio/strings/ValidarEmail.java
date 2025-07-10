package es.cursojava.inicio.strings;

import java.util.Scanner;

/*
 *Preguntar al usuario por un email
	Le diremos si es valido o no y si no lo es le diremos el motivo

	Validaciones: 
	+ Que no tenga espacios en blanco
	+ Que tenga @, solo 1
	+ Que después de la @ tenga al menos un punto
	+ Que entre la @ y el punto a su derecha haya una separación de dos caracateres
	+ Que despues del último punto haya entre 2 y 6 caracteres
 * */
public class ValidarEmail {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce mail: ");
		String mail = sc.nextLine();
		String caracterActual="";
		int contadorAt=0;
		String sumaCaracter="";
		String caracterPrevio="";
		
		
//		 boolean contieneEspacio = false;
//
//	        for (int i = 0; i < mail.length(); i++) {
//	            char c = mail.charAt(i);
//	            if (c == ' ') {
//	                contieneEspacio = true;
//	            }
//	            if (c == '@') {
//	                contadorAt++;
//	            }
//	        }
//
//	        if (contieneEspacio) {
//	            System.out.println("Error: El correo contiene espacios en blanco.");
//	        } 
//	        if (contadorAt != 1) {
//	            System.out.println("Error: El correo contiene más de un '@'.");
//	        } else {
//	            System.out.println("Correo válido: " + mail);
//	        }
//		
		if(mail.contains(" "))
		{
			System.out.println("Error: El correo contiene espacios en blanco.");
		} else if (!mail.contains("@") || mail.indexOf('@') != mail.lastIndexOf('@'))
		{
			System.out.println("El correo debe contener exactamente un '@'.");
		}
	}

}
