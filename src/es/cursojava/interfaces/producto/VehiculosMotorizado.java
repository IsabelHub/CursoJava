package es.cursojava.interfaces.producto;

public class VehiculosMotorizado extends Vehiculo implements Encendible, Apagable {
	

	private String motor;
	public VehiculosMotorizado(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}



	public String getMotor() {
		return motor;
	}

	@Override
	public void encender() {
		System.out.println("Vehículo motorizado con motor " + motor + " encendido.");
	}

	@Override
	public void apagar() {
		System.out.println("Vehículo motorizado con motor " + motor + " apagado.");
	}
}
