package es.cursojava.herencia.biblioteca;

/*
 * Clase Dirección

	Atributos: calle, ciudad, codigoPostal.

	Constructor y método mostrarDireccion().
 * */
public class Direccion {

	private String calle;
	private String ciudad;
	private int codigoPostal;
	
	//constructor:	
	public Direccion(String calle, String ciudad, int codigoPostal)
	{
		this.calle=calle;
		this.ciudad=ciudad;
		this.codigoPostal=codigoPostal;		
	}	
	
	public String getCalle() {
		return calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void mostrarDireccion() {
		System.out.println("La calle es: "+ getCalle());
		System.out.println("La ciudad es: "+ getCiudad());
		System.out.println("El codigo postal es: "+ getCodigoPostal());
	}

}
