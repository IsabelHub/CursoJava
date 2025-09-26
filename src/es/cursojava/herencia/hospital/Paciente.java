package es.cursojava.herencia.hospital;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.herencia.hospital.Paciente;

public class Paciente extends Persona {

	private static final Logger logger = LoggerFactory.getLogger(Paciente.class);

	// no hace falta otorgarle dimension
	// porque inicializas el array sintomas directamente desde el constructor,
	String[] sintomas;

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;
	}

	public String[] getSintomas() {
		return sintomas;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		logger.info("Paciente ... comiendo en la cafetería" + getNombre());

	}

	
}

