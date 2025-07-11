package es.cursojava.inicio.arrays;
/*
 * solicitar numero de laumnos en clase y por cada alumno pedir su nota y la guardas
 * en una posicion del array.
 * 
 * con la info almacenada en el array indicar:
 * -cuantos alumnos han aprobado
 * - nota media de la clase
 * 
 * */

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;

		int sumaNotas = 0;
		int notasIngresadas = 0;
		int nota = 0;
		int contador = 0;

		System.out.print("¿Cuántos alumnos quieres ingresar?: ");
		int cantidad = sc.nextInt(); // el usuario define el tamaño

		double[] numAlumnos = new double[cantidad];

		do {
			System.out.println("\nElige una opción:");
			System.out.println("1. Añadir las notas de los alumnos");
			System.out.println("2. Cuantos alumnos han aprobado");
			System.out.println("3. Mostrar la nota media de toda el aula");
			System.out.println("4. Salir");
			System.out.print("Opción: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				sumaNotas = 0;
				for (int i = 0; i < numAlumnos.length; i++) {

					System.out.print("Introduce la nota del alumno: " + (i + 1) + ": ");
					nota = sc.nextInt();
					numAlumnos[i] = nota;
					sumaNotas += nota;
				}

				break;
			case 2:
				if (nota >= 5) {
					contador++;
				}

				System.out.print("el numero de alumnos que han aprobado es: " + contador);

				break;
			case 3:

				for (int i = 0; i < numAlumnos.length; i++) {

					System.out.println("Alumno" +"i:" + numAlumnos[i]);
				}

				double promedio = sumaNotas / cantidad;
				System.out.println("La media de toda el aula es: " + promedio);
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
