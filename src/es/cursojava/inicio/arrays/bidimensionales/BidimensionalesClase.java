package es.cursojava.inicio.arrays.bidimensionales;
import java.util.Scanner;

/*
 * Ejercicio Colegio-Alumnos
==============================================================
Colegio con 2 aulas y 3 puestos en cada aula

1. Insertar Alumnos -> Va a solicitar el nombre de los alumnos para las aulas que tengan puestos disponibles
2. Mostrar Alumnos -> Muestra los alumnos por aula, si un puesto no tiene alumno, mostrar (vacio)
3. Buscar Alumno -> Solicitar texto, Ju, mostrar aula y puesto en el que se encuentra el alumno que contenga el texto introducido
4. Borrar Alumno -> Solcitar nombre, y se borra a todos los alumnos que tengan ese nombre.
5. Salir
 * */


public class BidimensionalesClase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String[][] aulas = new String[2][3]; // 2 aulas, 3 puestos cada una
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
				boolean hayHueco=false;
				for (int i = 0; i < aulas.length; i++) {
					for (int j = 0; j < aulas[i].length; j++) {
						if (aulas[i][j] == null) {
							System.out.print("Introduce nombre para aula " + (i + 1) + ", puesto " + (j + 1) + ": ");
							sc = new Scanner(System.in);
							String nombre = sc.nextLine();
							aulas[i][j] = nombre;													
							hayHueco=false;
						}
					}
				}
				if(!hayHueco) {
					System.out.println("No hay puestos libres! ");
				}
				break;
			case 2:
				for (String[] fila : aulas) {
					for (String alumno : fila) {
						if (alumno == null) {
							System.out.println("No hay alumno asignado en ese puesto.");
						} else {
							System.out.print("\tAlumno:" + alumno + "\t");
						}
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
						//mirar codigo del profe, tiene un truqui para recorrer el 'if'
						if (aulas[i][j]==null) {							
							encontrado=false;												
						}
						else if(aulas[i][j].contains(cadenaBuscar)) {							
								System.out.print("el alumno de nombre: " + cadenaBuscar + " esta en el aula: " + (i + 1) + ", puesto " + (j + 1) + ": ");
					 			encontrado=true;
						}
					}					
				}
				System.out.print("el alumno de nombre: " + cadenaBuscar + " no existe");
				break;
			case 4:
				System.out.print("Introduce nombre a borrar: ");
				sc = new Scanner(System.in);
				String cadenaBuscarDos= sc.nextLine();
				boolean escierto = false;
				for (int i = 0; i < aulas.length; i++) {
					for (int j = 0; j < aulas[i].length; j++) {
						if ( aulas[i][j]!=null && aulas[i][j].contains(cadenaBuscarDos)) {
							aulas[i][j]=null;
							escierto=true;							
						}
						else
							aulas[i][j]=null;
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
