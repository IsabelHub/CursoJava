package es.cursojava.interfaces.sistemadepago.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.interfaces.sistemadepago.PagoAbstracto;
import es.cursojava.interfaces.sistemadepago.interfaces.Pago;

public  class PagoPayPal extends PagoAbstracto {
	
	private static final Logger logger = LoggerFactory.getLogger(PagoTarjetaCredito.class.getName());
	
	public PagoPayPal(double importe) {
		super(importe);
		
	}

	@Override
	public void procesarPago(double monto) {
        logger.info("Pago con PayPal procesado por: $" + monto);
		
	}


	

}
