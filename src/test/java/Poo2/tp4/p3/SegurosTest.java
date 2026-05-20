package Poo2.tp4.p3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SegurosTest {

	@Test
	void testSeguroIndividual() {
		ElementoSeguro vida = new SeguroIndividual(TipoSeguro.VIDA, 1000.0);
		assertEquals(1000.0, vida.calcularCosto(), 0.01);
	}

	@Test
	void testPaqueteConDescuento() {
		PaqueteSeguros paquete = new PaqueteSeguros();
		paquete.agregarElemento(new SeguroIndividual(TipoSeguro.HOGAR, 1000.0));
		paquete.agregarElemento(new SeguroIndividual(TipoSeguro.AUTOMOVIL, 1000.0));

		// 2000 - 10% (0.10) = 1800
		assertEquals(1800.0, paquete.calcularCosto(), 0.01);
	}
}
