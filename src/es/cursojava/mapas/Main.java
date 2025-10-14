package es.cursojava.mapas;

public class Main {

	public static void main(String[] args) {
		
		// 1. Crear instancia del colegio
        ColegioMayor colegio = new ColegioMayor();

        // 2. Crear alumnos
        AlumnoHeredado alumno1 = new AlumnoHeredado("Ana", "12334","3 ESO");
        AlumnoHeredado alumno2 = new AlumnoHeredado("Luis", "4567","1 Primaria");
        // ... crear más alumnos

        // 3. Agregar alumnos a aulas
        colegio.agregarAlumnoAula("aula1", alumno1);
        colegio.agregarAlumnoAula("aula1", alumno2);
        colegio.agregarAlumnoAula("aula2", new AlumnoHeredado("María", "4587","5 Primaria"));
        // ... agregar alumnos a más aulas

        // 4. Mostrar todas las aulas con sus alumnos
        colegio.mostrarAlumnosPorAula();

        // 5. Pedir nombre de aula para mostrar alumnos (opcional)
        // Puede ser con Scanner para pedir input al usuario

        // 6. Buscar aula con alumno de nota más alta (si implementaste el método)
        // colegio.mostrarAulaConMejorAlumno();

        // Puedes agregar más interacciones según tus métodos
    }


	

}
