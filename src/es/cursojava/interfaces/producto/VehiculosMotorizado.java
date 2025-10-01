package es.cursojava.interfaces.producto;

import es.cursojava.interfaces.producto.interfaces.Apagable;
import es.cursojava.interfaces.producto.interfaces.Encendible;
import es.cursojava.interfaces.producto.pojos.Vehiculo;

public class VehiculosMotorizado extends Vehiculo implements Encendible, Apagable {
	

	private String motor;
	public VehiculosMotorizado(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}



	public String getMotor() {
		return motor;
	}



	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	
}
