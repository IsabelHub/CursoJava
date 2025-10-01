package es.cursojava.interfaces.producto;

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
