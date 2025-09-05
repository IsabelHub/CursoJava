package es.cursojava.biblioteca;

/*
 * Crea un objeto Biblioteca con una dirección.
Agrega al menos 3 libros.
Muestra la información completa de la biblioteca.
Muestra los libros que tiene la biblioteca
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Biblioteca 1
		Direccion direccion1 = new Direccion("Embajadores", "Madrid", 45700);
		Libro libro1= new Libro("El principito", "Ramoncin", 123456789);
		Libro libro2= new Libro("Donde los escorpiones", "Lorenzo Silva", 987654321);
		Libro libro3= new Libro("La cueva de Hercules", "Miguel Ángel Martínez Artola", 978847954);
		
		Libro[] libros1 = {libro1,libro2,libro3};
		Biblioteca biblioteca1 = new Biblioteca("Isabel Batal",direccion1 , libros1);
		
		System.out.println("--La info de la biblioteca-- " );
		biblioteca1.mostrarInfoBiblioteca();
		
		
		System.out.println("--Los libros que tiene la biblioteca son-- ");
		biblioteca1.mostrarLibros();
		
		/*
		 * crear una segunda biblioteca donde nos creamos libros diferentes
		 * y hacer un metodo y decidir donde hacerlo que nos indique que libros tienen en comun
		 * 
		 * 
		 * */
		
		//Biblioteca 2
		
		Direccion direccion2 = new Direccion("Atocha", "Madrid", 45700);
		Libro libro4= new Libro("Donde los escorpiones", "Ramoncin", 123456789);
		Libro libro5= new Libro("Amores lunaticos", "Lorenzo Silva", 987654321);
		Libro libro6= new Libro("Me quiero, Te quiero", "Miguel Ángel Martínez Artola", 978847954);
		
		Libro[] libros2 = {libro4,libro5,libro6};
		Biblioteca biblioteca2 = new Biblioteca("Fenicia",direccion2 , libros2);
		
		System.out.println("--La info de la biblioteca-- " );
		biblioteca2.mostrarInfoBiblioteca();
		
		
		System.out.println("--Los libros que tiene la biblioteca son-- ");
		biblioteca2.mostrarLibros();
		
		compararBiblioteca(libros1,libros2);
		
	}
	public static void compararBiblioteca(Libro[] libros1, Libro[] libros2 ) {
		for (int i = 0; i<libros2.length; i++) {
			for (int j =0; j<libros1.length;j++)
			{
				if (libros2[i].getTitulo() == libros1[j].getTitulo()) {
				       
				      System.out.println("---En ambas biblotecas existe el mismo titulo. " + "Título en común: " + libros1[j].getTitulo() );
				 }
			}
		   
		}
	}

}
