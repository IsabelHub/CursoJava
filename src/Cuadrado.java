/*
 * 9. Pintar el menu hasta que se puse la opción de salir. 
Elige una opción:
	1. Pintar Cuadrado
	2. Validar email
	3. Añadir Alumno
	4. Salir
Si se pulsa la opción 1, solicitar el tamaño de los lados de un cuadrado y pintar el cuadrado de la siguiente manera:
Por ejemplo si el tamaño es 4:
		****
		*  *
		*  *
		****
 * */
import java.util.Scanner;
public class Cuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("\n ------Elige una opción: -----");
			System.out.println("1.Pintar Cuadrado ");
			System.out.println("2.Validar email : ");
			System.out.println("3.Añadir Alumno : ");
			System.out.println("4.Salir");
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el tamaño del cuadrado: ");
				int tamanio = sc.nextInt();
				for (int i = 0; i < tamanio; i++) {
					for (int j = 0; j < tamanio; j++) {
						if (i == 0 || i == tamanio - 1 || j == 0 || j == tamanio - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println("");
				}
				 
	        
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Opción incorrecta, inténtalo de nuevo.");
			}
		} while (opcion != 4);
		sc.close();
	}
}
