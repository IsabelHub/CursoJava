package es.cursojava.herencia.bandamusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Clase Piano hereda de Instrumento
	numeroOctavas
	tipoPiano

	afinar() --> Hace lo del padre + Afinando Piano
 * */

public class Piano extends Instrumento{
	
	private int numeroOctavas;
	private String tipoPiano;
	
	private static final Logger logger = LoggerFactory.getLogger(Piano.class);

	
	public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo, afinado);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}

	public int getNumeroOctavas() {
		return numeroOctavas;
	}

	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}
	
	public boolean afinar() {
		boolean estaAfinado = false;

		if(afinar())
		{
			logger.info("Afinando Guitarra " + getNombre() );
		}
		return estaAfinado;
	}



}
