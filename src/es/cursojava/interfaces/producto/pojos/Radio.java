package es.cursojava.interfaces.producto.pojos;

import es.cursojava.interfaces.producto.ProductoElectronico;
import es.cursojava.interfaces.producto.interfaces.Consultable;
import es.cursojava.interfaces.producto.interfaces.Deletable;

public class Radio extends ProductoElectronico implements Consultable, Deletable {

	public Radio(String nombre, double precio, int id, String fechaFabricacion) {
		super(nombre, precio, id, fechaFabricacion);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	

}
