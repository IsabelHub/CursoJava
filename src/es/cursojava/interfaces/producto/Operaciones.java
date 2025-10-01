package es.cursojava.interfaces.producto;

import es.cursojava.interfaces.producto.interfaces.Consultable;
import es.cursojava.interfaces.producto.interfaces.Deletable;
import es.cursojava.interfaces.producto.interfaces.Insertable;
import es.cursojava.interfaces.producto.interfaces.Updatable;

public class Operaciones {
	static void selectObject(Object obj) {
        if (obj instanceof Consultable) {
            ((Consultable) obj).select();
        } else {
            System.out.println("Este objeto no se puede consultar.");
        }
    }
	static void insertObject(Object obj) {
        if (obj instanceof Insertable) {
            ((Insertable) obj).insert();
        } else {
            System.out.println("Este objeto no se puede insertar.");
        }
    }

	static void updateObject(Object obj) {
		 if (obj instanceof Updatable) {
	            ((Updatable) obj).update();
	        } else {
	            System.out.println("Este objeto no se puede actualizar.");
	        }
	}
	
	static void deleteObject(Object obj) {
		 if (obj instanceof Deletable) {
	            ((Deletable) obj).delete();
	        } else {
	            System.out.println("Este objeto no se puede eliminar.");
	        }
	}


}
