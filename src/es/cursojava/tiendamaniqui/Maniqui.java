package es.cursojava.tiendamaniqui;

public class Maniqui {
	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	
	
	public Maniqui()
	{
		
	}
	
	public Maniqui(Pantalon pantalon, Camisa camisa) {
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(Vestido vestido) {
		this.vestido = vestido;
	}

	public void vestir(Camisa camisa, Pantalon pantalon) {
		if (this.vestido != null) {
			System.out.println("No se puede vestir con camisa y pantalón porque ya tiene un vestido.");
			return;
		}

		this.camisa = camisa;
		this.pantalon = pantalon;
		//System.out.println("Maniquí vestido con camisa y pantalón.");

	}

	public void vestir(Vestido vestido) {
		if (this.camisa != null || this.pantalon != null) {
			System.out.println("No se puede vestir con vestido porque ya tiene camisa o pantalón.");
			return;
		}

		this.vestido = vestido;
		//System.out.println("Maniquí vestido con vestido.");

	}

	public void desvestir() {
		this.camisa = null;
		this.pantalon = null;
		this.vestido = null;
		System.out.print(" ha sido desvestido.");
	}
	
	public boolean estaDesvestido() {
	    return camisa == null && pantalon == null && vestido == null;
	}
	
	public void mostrarInfoManiqui() {	
	    if (vestido != null) {
	        System.out.println("Maniquí con vestido:");
	        System.out.println(vestido.mostrarInfoVestido());
	    } else if (camisa != null && pantalon != null) {
	        System.out.println("Maniquí con camisa y pantalón:");
	        System.out.print(camisa.mostrarInfoCamisa());
	        System.out.println(pantalon.mostrarInfoPantalon());
	    } else {
	        System.out.println("Maniquí está desvestido.");
	    }
	}

}
