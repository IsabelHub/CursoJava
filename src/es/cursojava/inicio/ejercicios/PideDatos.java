package es.cursojava.inicio.ejercicios;
import java.util.Scanner;
/*
 * 
 * + Crear el paquete ejercicios dentro del paquete inicio
+ Dentro del paquete ejercicios crear la clase PideDatos con el método main
+ Solicitar dirección: 
	- nombre de calle, 
	- número 
	- población
+ Mostrar los datos recogidos por consola
+ Mostrar: "La calle es grande ": <true o false>, si el número de la calle es mayor de 100 "true" en caso contrario "false"
+ Generar número aleatorio e indicar el numero que se genera y si es > de 0,5 (poniendo true o false)
*/
public class PideDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);	
		System.out.println("Introduce tu direccion: nombre de la calle: ");
		String calle = sc.nextLine();
		
		System.out.println("Introduce tu direccion: numero de la calle: ");
		int numeroCalle= sc.nextInt();

		sc = new Scanner (System.in);
		System.out.println("Introduce tu direccion: poblacion: ");
		String poblacion= sc.nextLine();

		sc.close();
		
		boolean esCierto = numeroCalle>100;
		
		System.out.println("calle: " + calle +"; " + " numero de la calle: " + numeroCalle +"; " + " poblacion: " + poblacion);

		System.out.println("El numero es largo: " + esCierto);
		
		double aleatorio = Math.random();
		System.out.println("El numero aleatorio es: " +aleatorio);
		boolean aleatorioBoolean = aleatorio>0.5;
		System.out.println("El numero aleatorio es mayor que 0.5: " + aleatorioBoolean);
	}

}