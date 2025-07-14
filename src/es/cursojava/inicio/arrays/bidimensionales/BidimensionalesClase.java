package es.cursojava.inicio.arrays.bidimensionales;

import java.util.Scanner;

public class BidimensionalesClase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String[][] aulas = new String[2][2]; // 2 aulas, 3 puestos cada una
		do {
			System.out.println("\n ------Elige una opción: -----");
			System.out.println("1.Insertar Alumnos: ");
			System.out.println("2.Mostrar Alumnos: ");
			System.out.println("3.Buscar Alumno: ");
			System.out.println("4.Borrar Alumno.");
			System.out.println("5.Salir.");
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				for (int i = 0; i < aulas.length; i++) {
					for (int j = 0; j < aulas[i].length; j++) {
						if (aulas[i][j] == null) {
							System.out.print("Introduce nombre para aula " + (i + 1) + ", puesto " + (j + 1) + ": ");
							sc = new Scanner(System.in);
							String nombre = sc.nextLine();
							aulas[i][j] = nombre;
						}
					}
				}
				break;
			case 2:
				 for (String[] fila : aulas) {
			            for (String alumno : fila) {
			                System.out.print("\tAlumno:" + alumno + "\t");
			            }
			            System.out.println();
			        }
				break;
			case 3:
				System.out.print("Introduce nombre a buscar: ");
				sc = new Scanner(System.in);
				String cadenaBuscar= sc.nextLine();
				boolean encontrado = false;
				for (int i = 0; i < aulas.length; i++) {
					for (int j = 0; j < aulas[i].length; j++) {
						if (aulas[i][j].contains(cadenaBuscar)) {
							System.out.print("el alumno de nombre: " + cadenaBuscar + " esta en el aula: " + (i + 1) + ", puesto " + (j + 1) + ": ");
							encontrado=true;
						
							
						}
					}
				}
				break;
			case 4:
				System.out.print("Introduce nombre a borrar: ");
				sc = new Scanner(System.in);
				String cadenaBuscarDos= sc.nextLine();
				boolean escierto = false;
				for (int i = 0; i < aulas.length; i++) {
					for (int j = 0; j < aulas[i].length; j++) {
						if (aulas[i][j].contains(cadenaBuscarDos)) {
							aulas[i][j]=null;
							escierto=true;
						
							
						}
					}
				}
			
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción incorrecta, inténtalo de nuevo.");
			}
		} while (opcion != 5);
		sc.close();
	}
}
