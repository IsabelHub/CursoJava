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

	public double getPrecio() {
		return precio;
	}


	public String getTalla() {
		return talla;
	}

	public Boton[] getBoton() {
		return boton;
	}

	
	public String mostrarInfoCamisa() {	
		
		 return "CAMISA-Color: " + color + ", precio: " + precio + ", talla: " + talla + ",botones: "+ getBoton();
		

	}
	
	
}
