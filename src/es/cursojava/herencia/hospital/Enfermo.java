package es.cursojava.herencia.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.herencia.bandamusica.Instrumento;

public class Enfermo extends Persona{
	
	
	private static final Logger logger = LoggerFactory.getLogger(Instrumento.class);

	String enfermedad;

	public Enfermo(String nombre, int edad,String enfermedad) {
		super(nombre, edad);
		this.enfermedad=enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public boolean comer(){

		if (comer())
		{
			logger.info(getNombre() + "Enfermo ... comiendo en la habitación"  );
		}
		return false;
		
	}

	
	

}
