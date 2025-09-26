package es.cursojava.herencia.hospital;

public class Habitacion {

	int numPaciente;
	Enfermo enfermo = new Enfermo("nombre", 100, "Lumbago");
	
	//cuando creas una habitacion no le puedes obligar a tener asignado enfermo
	public Habitacion(int numPaciente) {
		super();
		this.numPaciente = numPaciente;
		
	}
	
	
}
