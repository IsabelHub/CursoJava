package es.cursojava.interfaces.producto;

public abstract class Alimentos extends Producto {

	private String fechaCaducidad;

	
	public Alimentos(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	


}
