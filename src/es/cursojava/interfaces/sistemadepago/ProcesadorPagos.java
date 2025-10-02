package es.cursojava.interfaces.sistemadepago;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.interfaces.sistemadepago.interfaces.Pago;


public class ProcesadorPagos implements Pago {
	private static final Logger logger = LoggerFactory.getLogger(ProcesadorPagos.class.getName());

	
	public ProcesadorPagos() {
		super();
	}


	// Simula un pago con tarjeta de crédito e imprime un mensaje confirmando el
	// pago.

	public void realizarPago(Pago metodoPago, double monto) {
        logger.info("Iniciando procesamiento de pago...");
        metodoPago.procesarPago(monto);
        logger.info("Pago procesado correctamente.");
    }


	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub
		
	}
}
