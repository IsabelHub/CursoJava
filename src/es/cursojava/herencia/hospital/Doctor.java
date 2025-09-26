package es.cursojava.herencia.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor extends EmpleadosHospital{
	
	
	private static final Logger logger =   LoggerFactory.getLogger(Doctor.class);
	String especialidad;

	public Doctor(String nombre, int edad, String turno,String especialidad) {
		super(nombre, edad, turno);
		this.especialidad=especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public boolean diagnosticarPaciente() {
		

		boolean estaEnfermo= false;
		double numEnfermo = Math.random();
		
		if (numEnfermo>8)
		{
			estaEnfermo= true;
		}
		else
		{
			logger.info("El doctor "+ getNombre()+"valora que el paciente no esta enfermo" );
		}
		return estaEnfermo;
	}
	
	
	
}
