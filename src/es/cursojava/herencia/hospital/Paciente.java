package es.cursojava.herencia.hospital;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.herencia.bandamusica.Instrumento;

public class Paciente extends Persona {
	
	private static final Logger logger = LoggerFactory.getLogger(Instrumento.class);

	//no hace falta otorgarle dimension 
	//porque inicializas el array sintomas directamente desde el constructor,
	String[] sintomas;
	
	Persona persona = new Persona("Isabel", 100);

	

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas=sintomas;
	}



	public String[] getSintomas() {
		return sintomas;
	}


	public boolean comer(){

		if (comer())
		{
			logger.info("Paciente ... comiendo en la cafetería" + getNombre() );
		}
		return false;
		
	}

	
}


