package es.cursojava.tiendamaniqui;

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

	public void mostrarInfo() {	
		System.out.println("Color es: "+ getColor());
		System.out.println("Forma es: "+ getForma());
		System.out.println("Tamaño es: "+ getTamanio());
	}
	

}
