package es.cursojava.herencia.tiendamaniqui;

/*
 * cuyos atributos son:
 * 
 * -color
 * -tamanio
 * -forma
 * */

public class Boton {
	private String color;
	private String tamanio;
	private String forma;
	
	
	
	
	public Boton(String color, String tamanio, String forma)
	{
		this.color=color;
		this.tamanio=tamanio;
		this.forma=forma;
	}
	

	public String getColor() {
		return color;
	}

	
	public String getTamanio() {
		return tamanio;
	}

	
	public String getForma() {
		return forma;
	}

	public String mostrarInfoBoton() {	
		 return "Color: " + color + ", Forma: " + forma + ", Tamaño: " + tamanio ;

	
	}
	

}
