package es.cursojava.herencia.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermero extends EmpleadosHospital{

	private static final Logger logger =   LoggerFactory.getLogger(Enfermero.class);
	int planta ;
	
	
	public Enfermero(String nombre, int edad, String turno) {
		super(nombre, edad, turno);
		
	}
	
	
	public void atenderPaciente() {
		
	}

}
