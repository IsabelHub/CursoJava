package es.cursojava.interfaces.producto.pojos;

import es.cursojava.interfaces.producto.VehiculosMotorizado;
import es.cursojava.interfaces.producto.interfaces.Consultable;
import es.cursojava.interfaces.producto.interfaces.Deletable;

public class MonopatinElectrico extends VehiculosMotorizado implements Consultable, Deletable{

	
	public MonopatinElectrico(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

}
