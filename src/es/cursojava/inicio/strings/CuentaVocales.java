package es.cursojava.inicio.strings;
import java.util.Scanner;
/*
 * Ejercicio 3
==============================
	Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un 
	String. Ignora las mayúsculas y minúsculas.
 * */
public class CuentaVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa palabra: ");
		String original = sc.nextLine();
		int contador=0; //numero de vocales introducidas
		
		String primero = original.toLowerCase();
		String soloVocales ="";
		char compara = ' ';
		
		for (int i = 0; i < primero.length(); i++) {
			compara =original.charAt(i);
			if(compara =='a' ||compara == 'e' ||compara =='i' ||compara =='o' ||compara =='u') {
				contador ++;
				soloVocales=soloVocales+compara;
			}
		}
		if(soloVocales == "")	
		{
			System.out.print("Hay" + contador +" vocales");
		}
		else
		{
			System.out.print("las " +contador + " vocales encontradas son: " + soloVocales);
		}			
	}
}
