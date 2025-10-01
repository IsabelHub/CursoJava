package es.cursojava.herencia.tienda;

import es.cursojava.inicio.Colegio.Alumno;

/*
 * con un método estático:

+ calcularValorInventario(Producto[] productos) → recibe un array de productos y devuelve el valor total del inventario.

 * */
public class UtilidadesTienda {
	
	public static double calcularValorInventario(Producto[] productos) {
		double valorTotal=0;
		for (Producto producto : productos) {
			valorTotal=valorTotal + producto.calcularValorTotal();
		}
		return valorTotal;
	}
	
	
}
