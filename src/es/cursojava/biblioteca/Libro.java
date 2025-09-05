package es.cursojava.biblioteca;

/*
 * Clase Libro

	Atributos: titulo, autor, isbn.

	Constructor y método mostrarInfo() --> Mostrará los datos del libro

Clase Dirección

	Atributos: calle, ciudad, codigoPostal.

	Constructor y método mostrarDireccion().

Clase Biblioteca

Atributos: nombre, direccion, libros (Suponemos que en la biblioteca caben 10 libros como mucho)

Métodos:

+ agregarLibro(Libro libro) para añadir un libro.

+ mostrarLibros() para mostrar todos los libros.

+ mostrarInfoBiblioteca() para mostrar dirección y libros.

Clase Main

Crea un objeto Biblioteca con una dirección.
Agrega al menos 3 libros.
Muestra la información completa de la biblioteca.
Muestra los libros que tiene la biblioteca
 * */

public class Libro {
	private String titulo;
	private String autor;
	private int isbn;
	
	//constructor:
	
	public Libro (String titulo, String autor, int isbn)
	{
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
		
	}	
	//get y set:
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getIsbn() {
		return isbn;
	}
	
	public void mostrarInfo() {	
		System.out.println("Titulo es: "+ getTitulo());
		System.out.println("Autor es: "+ getAutor());
		System.out.println("ISBN es: "+ getIsbn());
	}
}
