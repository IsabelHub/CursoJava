package es.cursojava.herencia.bandamusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/*
 * clase Instrumento
	nombre
	tipo
	afinado
	
	afinar() --> Afinando instrumento nombre, se afina o no de manera aleatoria
		Math.random()> 0.4 --> El instrumento está afinado
	tocar() --> Tocando instrumento nombre
 * */

public class Instrumento {

	
	private static final Logger logger = LoggerFactory.getLogger(Instrumento.class);
	
	private String nombre;
	private String tipo;
	private boolean afinado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isAfinado() {
		return afinado;
	}
	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
	
	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}
	
	public boolean afinar() {
		boolean estaAfinado = false;
		logger.info("Generando numero aleatorio... Número aleatorio: ");
		double numero = Math.random();
		
		if(numero>0.4)
		{
			logger.info("Afinando instrumento " + getNombre() + numero);
			estaAfinado= true;
		}
		
		return estaAfinado;
	}
	
	public boolean tocar()
	{
		boolean tocando = false;
		if (afinar()) 
		{
			logger.info("El instrumento " + getNombre() + " esta siendo tocado");
			tocando=true;
		}
		return tocando;
	}
}
