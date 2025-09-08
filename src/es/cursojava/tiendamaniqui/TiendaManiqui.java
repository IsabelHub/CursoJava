package es.cursojava.tiendamaniqui;

import es.cursojava.biblioteca.Libro;

/*
 * - abrirTienda() --> Donde se van a generar todos los objetos
		+3 Objetos de tipo Maniqui (2 vestidos y 1 sin vestir)
		
	- vestirManiquies () --> vestir maniquies (solo vestirá aquellos que están completamente desnudos)

	- mostrarEscaparate() --> Mostrar la información de cada maniqui y el precio total de la ropa que llevan

	- cerrarTienda() --> Indicar que cierra la tienda y desvestir a los maniquies
*/

public class TiendaManiqui {

	private String nombre;
	private Maniqui[] maniquies = new Maniqui[3];

	public TiendaManiqui(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * // Crea 3 maniquíes: 2 vestidos con vestido y 1 desvestido public void
	 * abrirTienda() { Vestido vestido1 = new Vestido("rojo", 25.0, "M"); Vestido
	 * vestido2 = new Vestido("azul", 30.0, "L");
	 * 
	 * maniquies[0] = new Maniqui(vestido1); maniquies[1] = new Maniqui(vestido2);
	 * maniquies[2] = new Maniqui();
	 * 
	 * System.out.
	 * println("Tienda abierta con 3 maniquíes (2 vestidos y 1 desvestido)."); }
	 */
	// Viste solo a los maniquíes que están completamente desvestidos
	public void vestirManiquies() {
		for (int i = 0; i < maniquies.length; i++) {
			Maniqui m = maniquies[i];
			if (m != null && m.estaDesvestido()) {
				Boton boton = new Boton("rojo", "S", "Cuadrado");
				Camisa camisa = new Camisa("rojo", 7.5, "M", 7);
				Pantalon pantalon = new Pantalon("azul", 7.5, "M", boton);

				m.vestir(camisa, pantalon);
				System.out.println("Maniquí " + i + " vestido con camisa y pantalón.");
			}
		}
	}

	public void abrirTienda(Maniqui maniqui) {

		// Buscar la primera posición libre (null) y agregar el maniquie
		for (int i = 0; i < maniquies.length - 1; i++) {
			if (maniquies[i] == null) {

				maniquies[i] = maniqui;

				break; // Salir del bucle una vez agregado
			}
		}
		maniquies[2] = new Maniqui(); // creo un maniqui desvestido
		System.out.println("Tienda abierta. Con 3 maniquíes (2 vestidos y 1 desvestido).");

	}

}
