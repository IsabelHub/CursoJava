package es.cursojava.tiendamaniqui;


/*
 * Llamo a 
		1)abrirTienda()
		2)vestirManiquies()
		3)mostrarEscaparate()
		4)cerrarTienda()
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		TiendaManiqui tiendaManiqui = new TiendaManiqui("Fashion");
		System.out.println("La tienda esta abierta? ");
		tiendaManiqui.abrirTienda();
		tiendaManiqui.vestirManiquies();
		tiendaManiqui.mostrarEscaparate();
		tiendaManiqui.cerrarTienda();
	}

}
