package es.cursojava.inicio.calculadora;

public class Calculadora {

	public static void main(String[] args) {

		double resultado = 0;
		double multiplicaResultado = 1;
		if (args.length < 3) {
			System.out.println("Error " + "Necesitamos que introduzcas minimo 3 argumentos");

		} else {
			System.out.println("correcto haz introducido 3 argumentos");
			String operador = args[0];
			System.out.println("Esta es la operacion a realizar: " + args[0]);

			for (int i = 1; i < args.length; i++) {

				System.out.println("argumento: " + args[i]);

				// friendly reminder
				// la propiedad length o el metodo length()
				// length-> para String
				// length()_> para arrays
				if (operador.equalsIgnoreCase("suma")) {

					resultado = resultado + Double.parseDouble(args[i]);

				} else if (operador.equalsIgnoreCase("resta")) {

					resultado = resultado - Double.parseDouble(args[i]);

				} else if (operador.equalsIgnoreCase("multiplica")) {

					multiplicaResultado = multiplicaResultado * Double.parseDouble(args[i]);
				}
			}
			if (resultado != 0) {
				System.out.println("El valor de la operación es: " + resultado);
			}

			if (multiplicaResultado != 1) {
				System.out.println("El valor de la operación es: " + multiplicaResultado);
			}
		}

	}

}
