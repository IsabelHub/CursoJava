package es.cursojava.inicio.ejercicios.condicionales;

import java.util.Scanner;

public class NumeroAlumnos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		int numAlumnos = 0;
		double sumaNotas = 0;
		int notasIngresadas = 0;

		do {
			System.out.println("\nElige una opción:");
			System.out.println("1. Cuantos alumnos hay en el aula?");
			System.out.println("2. Añadir las notas de los alumnos");
			System.out.println("3. Mostrar la nota media de toda el aula");
			System.out.println("4. Salir");
			System.out.print("Opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduce número de alumnos: ");
				numAlumnos = sc.nextInt();
				break;
			case 2:
				sumaNotas = 0;
				for (int i = 0; i < numAlumnos; i++) {
					System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
					double nota = sc.nextDouble();
					sumaNotas += nota;
				}
				notasIngresadas = numAlumnos;
				break;
			case 3:
				double promedio = sumaNotas / numAlumnos;
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
