package es.cursojava.tiendamaniqui;

public class Camisa {

	private String color;
	private double precio;
	private String talla;
	private Boton[] boton;

	
	public Camisa( String color,double precio, String talla,int numBotones)
	{
		this.color=color;
		this.precio=precio;
		this.talla=talla;
		this.boton = new Boton[numBotones];
				
	}
 

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public Boton[] getBoton() {
		return boton;
	}


	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}
	
	
	
	
}
