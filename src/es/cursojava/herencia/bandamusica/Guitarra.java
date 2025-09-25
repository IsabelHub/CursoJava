package es.cursojava.herencia.bandamusica;
/*
 * Clase Guitarra hereda de Instrumento
	numCuerdas
	
	afinar() --> Hace lo del padre + afinando guitarra	
 * */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarra extends Instrumento{

	private static final Logger logger = LoggerFactory.getLogger(Guitarra.class.getName());
	
	private int numCuerdas;
	
	
	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo, afinado);
		this.numCuerdas = numCuerdas;
	}
	
	
	public int getNumCuerdas() {
		return numCuerdas;
	}


	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}


	public boolean afinar()
	{
		boolean esAfinado = false;
		if (afinar())
		{
			logger.info("Afinando Guitarra " + getNombre() );
		}
		return esAfinado;
	}

}
