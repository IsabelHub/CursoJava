package es.cursojava.interfaces.producto;

public abstract class Producto {

	private String nombre;
	private double precio;
	private int id;
	private static int contadorIds = 0;
	
	public Producto(String nombre, double precio, int id) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	
		this.id = ++contadorIds;
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public static int getContadorIds() {
		return contadorIds;
	}
	
}
