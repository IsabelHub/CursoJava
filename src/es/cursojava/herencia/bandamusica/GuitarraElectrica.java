package es.cursojava.herencia.bandamusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 	
Clase GuitarraElectrica hereda de Guitarra
	potencia
	
	tocar () --> Tocando muy alto //
 * */

public class GuitarraElectrica extends Guitarra {

	private static final Logger logger = LoggerFactory.getLogger(GuitarraElectrica.class);
	private double potencia;
	
	//String nombre, String tipo, boolean afinado, int numCuerdas
	Instrumento guitarra = new Guitarra("Lucia", "cuerdas", true, 5);
	
	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int numCuerdas, double potencia) {
		super(nombre, tipo, afinado, numCuerdas);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public boolean tocar () {
		boolean estaAlto = false;
		
		if(afinar())
		{
			guitarra.tocar();
		}
		return estaAlto;
	}
	
}
