package es.cursojava.interfaces.producto.pojos;

import es.cursojava.interfaces.producto.Alimentos;
import es.cursojava.interfaces.producto.interfaces.Consultable;
import es.cursojava.interfaces.producto.interfaces.Insertable;
import es.cursojava.interfaces.producto.interfaces.Updatable;

public class Hummus extends Alimentos implements Consultable, Insertable, Updatable {

	public Hummus(String nombre, double precio, int id) {
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
