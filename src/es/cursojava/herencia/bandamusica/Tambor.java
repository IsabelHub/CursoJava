package es.cursojava.herencia.bandamusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Clase Tambor hereda de Instrumento
	material
	
	afinar() --> Afinando Tambor (siempre afinado)
	
	aporrear() --> Aporreando Tambor
	
 * */

public class Tambor extends Instrumento{

	private static final Logger logger = LoggerFactory.getLogger(Tambor.class);

	public Tambor(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
	}

	public boolean afinar() {
		boolean estaAfinado = false;

		if(afinar())
		{
			logger.info("Siempre afinando " + getNombre() );
		}
		return estaAfinado;
	}

}
