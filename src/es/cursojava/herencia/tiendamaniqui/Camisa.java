package es.cursojava.herencia.tiendamaniqui;

public class Camisa {

	private String color;
	private double precio;
	private String talla;
	private Boton[] botones;

	
	public Camisa( String color,double precio, String talla,int numBotones)
	{
		this.color=color;
		this.precio=precio;
		this.talla=talla;
		this.botones = new Boton[numBotones];
				
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
		return botones;
	}

	
	public String mostrarInfoCamisa() {	
		
		 return "CAMISA-Color: " + color + ", precio: " + precio + ", talla: " + talla + ",botones: "+ getBoton();
		

	}
	
	
}
