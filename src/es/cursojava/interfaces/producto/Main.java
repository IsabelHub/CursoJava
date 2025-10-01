package es.cursojava.interfaces.producto;

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
