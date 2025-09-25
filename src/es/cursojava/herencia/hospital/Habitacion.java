package es.cursojava.herencia.hospital;

public class Habitacion {

	int numPaciente;
	Enfermo enfermo = new Enfermo("nombre", 100, "Lumbago");
	
	public Habitacion(int numPaciente, Enfermo enfermo) {
		super();
		this.numPaciente = numPaciente;
		this.enfermo = enfermo;
	}
	
	
}
