package es.cursojava.inicio.ejercicios.condicionales;
import java.util.Scanner;
/*
 * Si el numero es par, se divide entre dos
	Si es impar se multiplicar por 3 y se le suma 1
	se repite hasta que el valor del numero es 1
 * */
public class ConjeturaCollatz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		double numero = sc.nextDouble();
		double resultado=0;
		do {
			if (numero%2==0) {
				numero = numero/2;
			}else {
				numero = numero*3+1;
			}
			System.out.println(numero);
		}while(numero!=1);
		
		/* //otra version posible
		if (numero == 1) {
			System.out.println("Has introducido el numero: 1. Fin del programa!");
		} else {
			while (numero != 1) {
				if (numero % 2 == 0) {
					numero = numero / 2;
				} else {
					numero = (numero * 3) + 1;
				}
				System.out.println("El resultado es: " + numero);
			}
			System.out.println("¡El número ha llegado a 1! Fin del programa.");
		}
		sc.close(); // buena práctica cerrar el Scanner
		*/
	}

}
