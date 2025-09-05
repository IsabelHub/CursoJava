package es.cursojava.inicio.metodos;

import java.util.Scanner;

import es.cursojava.inicio.utils.Utilidades;

public class Ejercicio5Metodos {

    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int opcion;
			String resultado4="";
			String texto="pandilla";
			do {
				System.out.println("\n ------Elige una opción: -----");
				System.out.println("1.Pintar cuadrado");
				System.out.println("2.Validar email");
				System.out.println("3.");
				System.out.println("4.");
				System.out.println("5.Pintar Tabla multiplicar del número 4: ");
				System.out.println("6.Pintar Tablas de multiplicar entre dos números ");
				System.out.println("7.Intoduce nombre -¿Tendra una T o empezará por A?: ");
				System.out.println("8.Averigua el area, la base, la diagonal y el perimetro de un rectangulo:");
				System.out.println("9. Salir");
				System.out.print("Opción: ");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					cuadrado();   
					break;
				case 2:
					validarEmail(null);
					break;
				case 3:
					
				case 4:
					
				case 5:
					tabla(4);
					break;

				case 6:
					tablas(4, 6);
					break;
				case 7:
					String[] tablaNombres = { "Juan", "Antonio", "ana", "Maria" };
					int numNombres = nombres(tablaNombres);
					System.out.println("Cuantos nombres tienen A y T: " + numNombres);
					break;
				case 8:
					double rectangulo = rectangulo(2, 4);
					System.out.println("El resultado final del rectangulo es: " + rectangulo);
					break;
				case 9:
					String[] resultado = {"Ver productos", "Añadir producto", "Salir"};
					pintaMenu(resultado);
					break;
				case 10:
					String[] resultado2 = {"Ver productos", "Añadir producto", "Salir"};
					
					pintaMenu(resultado2, texto);
					break;
				case 11:
					int resultado3=pideDatoNumerico(texto);
				case 12:
					resultado4=pideDatoCadena(texto);
					break;
				case 13:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción incorrecta, inténtalo de nuevo.");
				}
			} while (opcion != 4);
			sc.close();
		}

	public static void cuadrado()
	{
		System.out.print("Introduce el tamaño del cuadrado: ");
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
	}
	public static void validarEmail(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Introduce mail: ");
			String mail = sc.nextLine();                
			

			if (mail.contains(" ")) {
				System.out.println("Error: El correo contiene espacios en blanco.");
			} else if (!mail.contains("@") || mail.indexOf('@') != mail.lastIndexOf('@')) {
				System.out.println("El correo debe contener exactamente un '@'.");
			} else if (!mail.substring(mail.indexOf('@')).contains(".")) {
				System.out.println("Al menos debe haber un '.' despues de la @");
			}else
				System.out.println("Correcto!");
		}
	public static void tabla(int numero) {
		System.out.println("La tabla de multiplicar del : "+ numero);
	    for (int i = 1; i <= 10; i++) { 
	        System.out.println(i+ "X" + numero + " = "+ i*numero );
	    } 
	    
	}
	public static void tablas(int numero1, int numero2) {
		
		 for (int i=numero1 ; i<=numero2 ; i++ ) {
		    	System.out.println("Tabla del "+i);
		    	
		    	for (int j=1 ; j<=10 ; j++ ) {
		    		System.out.print(i + "X" + j + " = "+ i*j + "\n" );
		    	}
		    }
	}
	public static int nombres(String[] nombres) {

	    int contador=0;
	    for(int i=0; i<nombres.length-1;i++)
	    {	    	
	    	if(nombres[i].startsWith("A")&&(nombres[i].contains("t")))
	    	{
	    		contador++;
	    	}	    	
	    }
	    return contador;
	}
	public static double rectangulo(double base, double altura)
	{
		double resultado=0;
		double area = base * altura;
		double perimetro= 2*area;
		double diagonal =Math.sqrt((Math.pow(area, 2)+Math.pow(base,2)));
		return area+perimetro+diagonal;
	}
	public static void pintaMenu(String[] opciones) {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i]);
		}
		System.out.println("Introduce una opción");
	}

	public static void pintaMenu(String[] opciones, String texto) {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i]);
		}
		System.out.println("Texto:" + texto);
	}	
	public static int pideDatoNumerico (String texto) {
		System.out.println("Texto:" + texto);
		System.out.println("Introduce dato Numerico:  ");
		int datoNumerico=sc.nextInt();
		return datoNumerico;
	}
	public static String pideDatoCadena (String texto) {
		System.out.println("El texto introducido es: "+ texto);
		System.out.println("Introduce texto:  ");
		String textoIntroducido=sc.nextLine();
		return textoIntroducido;
	}
}
