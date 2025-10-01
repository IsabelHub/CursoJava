package es.cursojava.interfaces.productovehiculo;

import es.cursojava.interfaces.productovehiculo.pojos.producto.alimento.Chocolate;
import es.cursojava.interfaces.productovehiculo.pojos.producto.alimento.Hummus;
import es.cursojava.interfaces.productovehiculo.pojos.producto.alimento.Queso;
import es.cursojava.interfaces.productovehiculo.utilidades.Operaciones;

public class Main {

	public static void main(String[] args) {
		
		Hummus hummus = new Hummus("Clasico libanes", 5, 4);
		
		Chocolate chocoBlanco = new Chocolate("Chcolate nueces Macadamia",4,3);
		
		Queso quesito = new Queso("Quesito", 3, 2, "Brie");

		
		Operaciones.insertObject(chocoBlanco);
		Operaciones.updateObject(chocoBlanco);
		Operaciones.deleteObject(chocoBlanco);
		
		
		Operaciones.selectObject(hummus);
		Operaciones.insertObject(hummus);
		Operaciones.updateObject(hummus);
		
		Operaciones.selectObject(quesito);
		
	}

}
