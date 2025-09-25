package es.cursojava.herencia.biblioteca;

/*
 * Clase Biblioteca

Atributos: nombre, direccion, libros (Suponemos que en la biblioteca caben 10 libros como mucho)

Métodos:

+ agregarLibro(Libro libro) para añadir un libro.

+ mostrarLibros() para mostrar todos los libros.

+ mostrarInfoBiblioteca() para mostrar dirección y libros.

 * 
 * */

public class Biblioteca {
	
	private String nombre;
	private Direccion direccion ;
	private Libro[] libros = new Libro[10];
		
	public Biblioteca(String nombre, Direccion direccion, Libro[] libros)
	{
		this.nombre=nombre;
		this.direccion=direccion;
		this.libros=libros;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void agregarLibro(Libro libro) {
		// Buscar la primera posición libre (null) y agregar el libro
		for (int i = 0; i < libros.length; i++) {
		    if (libros[i] == null) {
		        libros[i] = libro;
		        break; // Salir del bucle una vez agregado
		    }
		}
	}
	
	public void mostrarLibros() {
		int numLibro=1;

		for (Libro libro : libros) {
			System.out.println("---Libro: " + numLibro);
			if(libro !=null)
			{
				libro.mostrarInfo();
				numLibro++;
			}
			
		}
	}
	
	public void mostrarInfoBiblioteca() {
		direccion.mostrarDireccion();
		//mostrarLibros();
		
	}
}
