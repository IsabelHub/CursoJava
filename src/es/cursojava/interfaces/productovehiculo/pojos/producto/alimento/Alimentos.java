package es.cursojava.interfaces.productovehiculo.pojos.producto.alimento;

import es.cursojava.interfaces.productovehiculo.pojos.producto.Producto;

public abstract class Alimentos extends Producto {
	
	private String fechaCaducidad;

	
	public Alimentos(String nombre, double precio, int id) {
		super(nombre, precio, id);
		// TODO Auto-generated constructor stub
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	


}
