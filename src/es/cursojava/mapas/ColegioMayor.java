package es.cursojava.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.inicio.Colegio.Alumno;

/**
 * Esta clase representa un colegio que contiene varias aulas, y permite
 * gestionar los alumnos dentro de esas aulas.
 * 
 * Puedes agregar alumnos a aulas, obtener la lista de aulas, buscar el aula con
 * el mejor alumno, etc.
 * 
 * @param
 * @return
 * @author Isabel 
 * @version 2.0
 * 
 */
public class ColegioMayor {

	// Mapa que relaciona el nombre del aula con la lista de alumnos
	// La clave (String) es el nombre del aula, por ejemplo "aula1".
	//El valor (List<Alumno>) es la lista de alumnos que pertenecen a esa aula.
	private HashMap<String, List<Alumno>> aulas;
	private static final Logger logger = LoggerFactory.getLogger(ColegioMayor.class);

	/**
	 * Agrega un alumno a un aula específica. Si el aula no existe, se crea.
	 *
	 * @param aula→Nombre del aula
	 * @param alumno→Alumno que se desea agregar
	 * @throws (si aplica)
	 */
	
	public ColegioMayor() {
		//lo inicializo aqui para evitar NullPointerException.
	    this.aulas = new HashMap<>();
	}

	public void agregarAlumnoAula(String aula, Alumno alumno) {
		
	 // Verificar si el aula ya existe en el HashMap
	    if (!aulas.containsKey(aula)) {
	        // Si no existe, crear una nueva lista vacía para esa aula
	        aulas.put(aula, new ArrayList<>());
	    }
	    
	    // Agregar el alumno a la lista del aula
	    aulas.get(aula).add(alumno);					
	}

	/**
	 * Para recorrer todas las aulas y mostrar sus alumnos
	 * @param
	 * @throws
	 */
	public void mostrarAlumnosPorAula() {
		Set<Entry<String, List<Alumno>>> datos =aulas.entrySet();
	    for (Entry<String, List<Alumno>> entrada : datos) {
	        String nombreAula = entrada.getKey();
	        List<Alumno> alumnos = entrada.getValue();

	        System.out.println("Aula: " + nombreAula);
	        for (Alumno alumno : alumnos) {
	        	logger.info("Aula: " + nombreAula); // se usa toString() automáticamente
	        }
	        logger.info("");  // Loguea una línea vacía
	    }
	}


	/**
	 * Para decir cuántas aulas hay
	 * @param
	 * @throws
	 */

	public void contarAulas() {
	    if (aulas == null || aulas.isEmpty()) {
	        System.out.println("No hay aulas registradas en el colegio.");
	    } else {
	        System.out.println("El colegio tiene " + aulas.size() + " aulas.");
	    }
	}


	/**
	 * Para decir cuántos alumnos hay en cada aula
	 * @param
	 * @throws
	 */

	public void contarAlumnosPorAula() {
	    if (aulas == null || aulas.isEmpty()) {
	        System.out.println("No hay aulas registradas.");
	        return;
	    }

	    for (Map.Entry<String, List<Alumno>> entrada : aulas.entrySet()) {
	        String nombreAula = entrada.getKey();
	        List<Alumno> alumnos = entrada.getValue();
	        System.out.println("El aula " + nombreAula + " tiene " + alumnos.size() + " alumnos.");
	    }
	}


	/**
	 *  Mostrar los alumnos de una aula específica si existe
	 * @param: nombreAula → el nombre del aula cuyos alumnos se desean mostrar
	 * @throws
	 */

	public void mostrarAlumnosDeAula(String nombreAula)
	{
		 // 1. Comprobar si el aula existe en el mapa
	    if (aulas.containsKey(nombreAula)) {
	        // 2. Obtener la lista de alumnos de esa aula
	        List<Alumno> alumnos = aulas.get(nombreAula);

	        // 3. Mostrar la información de cada alumno
	        System.out.println("Alumnos del aula " + nombreAula + ":");
	        for (Alumno alumno : alumnos) {
	            // Supongamos que Alumno tiene un método toString() que devuelve info legible
	            System.out.println(alumno);
	        }
	    } else {
	        // 4. Si el aula no existe, mostrar mensaje de error
	        System.out.println("El aula '" + nombreAula + "' no existe.");
	    }
	}

	/**
	 * Buscar el alumno con la mejor nota y decir en qué aula está
	 * @param
	 * @throws
	 */
	public void aulaConNotaMasAlta() {
	    if (aulas == null || aulas.isEmpty()) {
	        System.out.println("No hay aulas registradas.");
	        return;
	    }

	    String aulaConMejorAlumno = null;
	    Alumno mejorAlumno = null;
	    double mejorNota = Double.MIN_VALUE;

	    // Recorremos todas las aulas y sus alumnos
	    for (Map.Entry<String, List<Alumno>> entrada : aulas.entrySet()) {
	        String nombreAula = entrada.getKey();
	        List<Alumno> alumnos = entrada.getValue();

	        for (Alumno alumno : alumnos) {
	            if (alumno.getNotaMedia() > mejorNota) {
	                mejorNota = alumno.getNotaMedia();
	                mejorAlumno = alumno;
	                aulaConMejorAlumno = nombreAula;
	            }
	        }
	    }

	    if (mejorAlumno != null) {
	        System.out.println("El alumno con la mejor nota media es " + mejorAlumno.getNombre()
	                + " (" + mejorNota + ") y está en el aula " + aulaConMejorAlumno + ".");
	    } else {
	        System.out.println("No hay alumnos registrados.");
	    }
	}


}
