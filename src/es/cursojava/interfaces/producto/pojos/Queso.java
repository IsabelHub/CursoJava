package es.cursojava.interfaces.producto.pojos;

import es.cursojava.interfaces.producto.Alimentos;
import es.cursojava.interfaces.producto.interfaces.Consultable;


public class Queso extends Alimentos implements Consultable {

	private String tipo;
	
	public Queso(String nombre, double precio, int id, String tipo) {
		super(nombre, precio, id);
		this.tipo=tipo;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	
	
}
