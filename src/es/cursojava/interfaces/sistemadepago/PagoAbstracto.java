package es.cursojava.interfaces.sistemadepago;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.herencia.bandamusica.Guitarra;
import es.cursojava.interfaces.sistemadepago.interfaces.Pago;

public abstract class PagoAbstracto implements Pago {

	double importe;
	public static final Logger logger = LoggerFactory.getLogger(Guitarra.class.getName());

	
	
    public PagoAbstracto(double importe) {
		super();
		this.importe = importe;
	}


	
}
