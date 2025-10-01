package es.cursojava.interfaces.producto;

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
