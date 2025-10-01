package es.cursojava.interfaces.productovehiculo.pojos.producto.alimento;

import es.cursojava.interfaces.productovehiculo.interfaces.Consultable;
import es.cursojava.interfaces.productovehiculo.interfaces.Insertable;
import es.cursojava.interfaces.productovehiculo.interfaces.Updatable;

public class Chocolate extends Alimentos implements Consultable, Insertable, Updatable {

	public Chocolate(String nombre, double precio, int id) {
		super(nombre, precio, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

}
