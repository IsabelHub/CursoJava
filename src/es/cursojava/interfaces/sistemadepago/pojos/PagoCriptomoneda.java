package es.cursojava.interfaces.sistemadepago.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.interfaces.sistemadepago.PagoAbstracto;

public class PagoCriptomoneda extends PagoAbstracto  {
	
	private static final Logger logger = LoggerFactory.getLogger(PagoTarjetaCredito.class.getName());


	public PagoCriptomoneda(double importe) {
		super(importe);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void procesarPago(double monto) {
        logger.info("Pago con criptomoneda procesado por: $" + monto);
		
	}

	
		
}

	

	
	
