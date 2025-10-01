package es.cursojava.interfaces.producto;

import es.cursojava.interfaces.producto.interfaces.Apagable;
import es.cursojava.interfaces.producto.interfaces.Encendible;

public abstract class ProductoElectronico extends Producto implements Encendible, Apagable {
	
	private String fechaFabricacion;

	public ProductoElectronico(String nombre, double precio, int id, String fechaFabricacion) {
		super(nombre, precio,id);
		this.fechaFabricacion= fechaFabricacion;
	}
	

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}
	

}
