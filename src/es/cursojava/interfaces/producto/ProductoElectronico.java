package es.cursojava.interfaces.producto;

public class ProductoElectronico extends Producto implements Encendible, Apagable {
	
	private String fechaCaducidad;

	public ProductoElectronico(String nombre, double precio, String fechaCaducidad) {
		super(nombre, precio);
		this.fechaCaducidad= fechaCaducidad;
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
