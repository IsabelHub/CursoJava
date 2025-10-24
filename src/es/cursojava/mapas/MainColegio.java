package es.cursojava.mapas;

public class MainColegio {

	public static void main(String[] args) {
		
		//Ejercicio 1

		// 1. Crear instancia del colegio1
		ColegioMayor colegio1 = new ColegioMayor("CFTIC","Avenida de las Arcas");

		// 2. Crear alumnos
		AlumnoHeredado alumno1 = new AlumnoHeredado("Pedro", "12334", "3 ESO");
		AlumnoHeredado alumno2 = new AlumnoHeredado("Martin", "4567", "1 Primaria");
		AlumnoHeredado alumno3 = new AlumnoHeredado("Carla", "4587", "5 Primaria");
		// ... crear más alumnos

		// 3. Agregar alumnos a aulas
		colegio1.agregarAlumnoAula("aula1", alumno1);
		colegio1.agregarAlumnoAula("aula1", alumno2);
		colegio1.agregarAlumnoAula("aula2", alumno3);

		// 4. Mostrar todas las aulas con sus alumnos
		colegio1.mostrarAlumnosPorAula();
		colegio1.contarAulas();

		// 5. Pedir nombre de aula para mostrar alumnos (opcional)
		// Puede ser con Scanner para pedir input al usuario

		// 6. Buscar aula con alumno de nota más alta
		colegio1.aulaConNotaMasAlta();
		
		
	}

}
