package es.cursojava.tienda;

/*
 * En una clase llamada Tienda con main:

Crea al menos 3 objetos Producto usando el constructor.

Guarda los objetos en un array de productos.

Muestra la información de cada producto.

Calcula y muestra el valor total del inventario usando el método estático.
 * */
public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear productos

		Producto producto1 = new Producto("Salmorejo cordobes", 4, 1);
		Producto producto2 = new Producto("Piña costarinquense", 6, 2);
		Producto producto3 = new Producto("Tortilla de patatas", 9, 1);
		
		Producto[] productos = {producto1, producto2, producto3};
		
		/*
		producto1.mostrarInfo();
		producto2.mostrarInfo();
		producto3.mostrarInfo();
		*/
		for (Producto producto : productos) {
			producto.mostrarInfo();
		}
		double valor= UtilidadesTienda.calcularValorInventario(productos);
		System.out.println("el valor total del inventario es: " +valor);
		//System.out.println("el valor total " +UtilidadesTienda.calcularValorInventario(productos));

		
		
	}

}
