package es.cursojava.inicio.ejercicios.condicionales;
import java.util.Scanner;
/*
 * 7. Solicitar por consola el numero de números de la serie 
	de Fibonacci que se quieren mostrar
	Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
	ejemplo: intoduzco el num3 Mostraré :0  1  1
	num=6   0  1  1  2  3  5
 * */

public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPrevio = 0;
		int numActual = 1;
		int suma = 0;

		System.out.println("Introduce numero: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("los primeros " + num + " numeros de la serie Fibonacci es: " + numPrevio);
			suma = numPrevio + numActual;
			numPrevio = numActual;
			numActual = suma;
		}
	}
}
