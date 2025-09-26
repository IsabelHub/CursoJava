package es.cursojava.herencia.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.herencia.hospital.EmpleadosHospital;

public abstract class EmpleadosHospital extends Persona {

	private static final Logger logger = LoggerFactory.getLogger(EmpleadosHospital.class);

	String turno;

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void fichar() {
		logger.info( "El empleado " + getNombre() + "... está fichando");
	}

	@Override
	public void comer() {
		logger.info("Empleado ... comiendo en el comedor");

	}

	
}
