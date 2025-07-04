package es.cursojava.inicio.ejercicios.condicionales;
import java.util.Scanner;
/*
 * 8. Numero tenistas en el top 10 --> 
	+ Pedir por teclado la cantidad de tenistas que se apuntan a un torneo, 
	+ por cada uno de ellos preguntar en que puesto de la ATP se encuentran. 
	+ Indicar cuantos tenistas estarían entre los diez primeros.

 * */
public class Tenista {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		int numTenista = 0;
		int puestoTenista = 0;
		boolean topDiez = false;
		int contadorTop10 = 0;

		do {
			System.out.println("\nElige una opción:");
			System.out.println("1. Cuantos tenistas hay en el torneo?");
			System.out.println("2. En que puesto de la ATP estas?: ");
			System.out.println("3. ¿Cuantos tenistas estan en el top10?: ");
			System.out.println("4. Salir");
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Introduce número de tenistas: ");
				numTenista = sc.nextInt();
				break;
			case 2:
				for (int i = 1; i <= numTenista; i++) {
					System.out.print("Introduce el puesto ATP del tenista " + i + ": ");
					puestoTenista = sc.nextInt();

					boolean esTop10 = (puestoTenista > 0 && puestoTenista <= 10);

					if (esTop10) {
						contadorTop10++;
						System.out.println("Estas ente los diez primeros puestos ");
					} else {
						System.out.println("No estas ente los diez primeros puestos ");
					}
				}
				topDiez = true;
				break;
			case 3:
				System.out.println("Número de tenistas en el top 10: " + contadorTop10);
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción incorrecta, inténtalo de nuevo.");
			}
		} while (opcion != 4);
		sc.close();
	}
}