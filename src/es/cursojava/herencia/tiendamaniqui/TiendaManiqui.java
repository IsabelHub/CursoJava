package es.cursojava.herencia.tiendamaniqui;

import es.cursojava.herencia.biblioteca.Libro;

public class TiendaManiqui {

	private String nombre;
	private Maniqui[] maniquies = new Maniqui[3];

	public TiendaManiqui(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * abrirTienda() --> Donde se van a generar todos los objetos +3 Objetos de tipo
	 * Maniqui (2 vestidos y 1 sin vestir)
	 */
	// Crea 3 maniquíes: 2 vestidos con vestido y 1 desvestido public void
	public void abrirTienda() {
		Vestido vestido1 = new Vestido("rojo", 25.0, "M");
		Vestido vestido2 = new Vestido("azul", 30.0, "L");

		maniquies[0] = new Maniqui(vestido1);
		maniquies[1] = new Maniqui(vestido2);
		maniquies[2] = new Maniqui();

		System.out.println("Tienda abierta con 3 maniquíes (2 vestidos y 1 desvestido).");
	}

	/*
	 * - vestirManiquies () --> vestir maniquies (solo vestirá aquellos que están
	 * completamente desnudos)
	 */
	// Viste solo a los maniquíes que están completamente desvestidos
	public void vestirManiquies() {
		System.out.println("\n--- Vestir ---");
		if (maniquies == null) {
			System.out.println("No hay maniquíes disponibles.");
			return;
		}

		for (int i = 0; i < maniquies.length; i++) {
			Maniqui m = maniquies[i];
			if (m != null && m.estaDesvestido()) {
				Boton boton = new Boton("rojo", "S", "Cuadrado");
				Camisa camisa = new Camisa("rojo", 7.5, "M", 7);
				Pantalon pantalon = new Pantalon("azul", 7.5, "M", boton);

				m.vestir(camisa, pantalon);
				System.out.println("Maniquí " + i + " vestido con camisa y pantalón.");
			} else if (m != null) {
				System.out.println("Maniquí " + i + " ya está vestido.");
			} else {
				System.out.println("Maniquí " + i + " es nulo.");
			}
		}

	}

	/*
	 * - mostrarEscaparate() --> Mostrar la información de cada maniqui y el precio
	 * total de la ropa que llevan
	 */
	public void mostrarEscaparate() {
		System.out.println("\n--- ESCAPARATE ---");
		for (int i = 0; i < maniquies.length; i++) {
			System.out.println("Maniquí " + i + ":");
			maniquies[i].mostrarInfoManiqui(); // Llama a un método que imprime info
			System.out.println();
		}
	}

	/*
	 * - cerrarTienda() --> Indicar que cierra la tienda y desvestir a los maniquies
	 */
	public void cerrarTienda() {
		System.out.println("---Cerrar");
		for (int i = 0; i < maniquies.length; i++) {
			if (maniquies[i] != null) {
				System.out.print("\nManiqui " + i + ":");
				maniquies[i].desvestir();
			}
		}
		System.out.println("\nTienda cerrada. Todos los maniquíes han sido desvestidos.");
	}
}
