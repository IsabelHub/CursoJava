package es.cursojava.herencia.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.herencia.biblioteca.Libro;

public class Hospital {

	
		static EmpleadosHospital[] empleados = new EmpleadosHospital[2];
		static String nombre;
		static int[] habitaciones = new int[2];
		static Paciente[] salaDeEspera = new Paciente[3];
		private static final Logger logger = LoggerFactory.getLogger(Hospital.class);

	
		public static void abrirHospital() {
			String[] sintomas1 = { "fiebre", "tos" };
			String[] sintomas2 = { "lumbago", "nauseas" };
			String[] sintomas3 = { "color de cabeza", "dolor abdominal" };

			Paciente paciente1 = new Paciente("Amira", 3, sintomas1);
			Paciente paciente2 = new Paciente("Tamouz", 7, sintomas2);
			Paciente paciente3 = new Paciente("Tanit", 11, sintomas3);

			Paciente[] pacientes = { paciente1, paciente2, paciente3 };

			for (int i = 0; i < pacientes.length; i++) {
				salaDeEspera[i] = pacientes[i];
			}
			Enfermero enfermeroHospital= new Enfermero("Elias", 30, "tarde");
			Doctor doctorHospital = new Doctor("Kim", 40, "tarde", "Oftamologia");
		}
	
	public static void ficharEmpleados(EmpleadosHospital empleado)
	{
		 if (empleado.getTurno().equals("tarde")) {
		        System.out.println("El empleado " + empleado.getNombre() + " ha fichado para el turno de tarde.");
		        // Aquí puedes hacer más lógica, como registrar su asistencia
		    } else {
		        System.out.println("El empleado " + empleado.getNombre() + " no tiene turno de tarde.");
		    }
	}
	public static void horaDeComer(Persona personasHospital)
	{
		//Crear método para poner a todas las personas del hospital a comer
		
		logger.info("¡Es la hora de comer en el hospital!" );
		// Pacientes comen 
		for (Paciente paciente : salaDeEspera) {
			if (paciente != null) {
				paciente.comer();
			}
		}

		// Empleados comen
		for (EmpleadosHospital empleado : empleados) {
			if (empleado != null) {
				empleado.comer();
			}
		}
		
	}
	public static void pasarConsultas()
	{
		
	}

	
}
