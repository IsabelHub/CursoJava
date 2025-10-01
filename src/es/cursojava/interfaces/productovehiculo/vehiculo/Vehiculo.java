package es.cursojava.interfaces.productovehiculo.vehiculo;

public abstract class Vehiculo {
	
	private int id;
	private static int contadorIds = 0;
	
	public Vehiculo(int id) {
        this.id = ++contadorIds;
    }

	public int getId() {
		return id;
	}


}
