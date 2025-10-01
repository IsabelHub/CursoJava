package es.cursojava.interfaces.producto;

public class Hummus extends Alimentos implements Consultable, Insertable, Updatable {

	public Hummus(String nombre, double precio, int id) {
		super(nombre, precio, id);
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
