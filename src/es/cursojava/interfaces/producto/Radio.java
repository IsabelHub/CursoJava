package es.cursojava.interfaces.producto;

public class Radio extends ProductoElectronico implements Consultable, Updatable, Insertable {

	public Radio(String nombre, double precio, int id, String fechaFabricacion) {
		super(nombre, precio, id, fechaFabricacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

}
