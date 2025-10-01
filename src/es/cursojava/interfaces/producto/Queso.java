package es.cursojava.interfaces.producto;

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
