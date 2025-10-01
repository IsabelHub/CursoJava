package es.cursojava.interfaces.productovehiculo.utilidades;

import es.cursojava.interfaces.productovehiculo.interfaces.Consultable;
import es.cursojava.interfaces.productovehiculo.interfaces.Deletable;
import es.cursojava.interfaces.productovehiculo.interfaces.Insertable;
import es.cursojava.interfaces.productovehiculo.interfaces.Updatable;

public class Operaciones {
	public static void selectObject(Object obj) {
        if (obj instanceof Consultable) {
            ((Consultable) obj).select();
        } else {
            System.out.println("Este objeto no se puede consultar.");
        }
    }
	public static void insertObject(Object obj) {
        if (obj instanceof Insertable) {
            ((Insertable) obj).insert();
        } else {
            System.out.println("Este objeto no se puede insertar.");
        }
    }

	public static void updateObject(Object obj) {
		 if (obj instanceof Updatable) {
	            ((Updatable) obj).update();
	        } else {
	            System.out.println("Este objeto no se puede actualizar.");
	        }
	}
	
	public static void deleteObject(Object obj) {
		 if (obj instanceof Deletable) {
	            ((Deletable) obj).delete();
	        } else {
	            System.out.println("Este objeto no se puede eliminar.");
	        }
	}


}
