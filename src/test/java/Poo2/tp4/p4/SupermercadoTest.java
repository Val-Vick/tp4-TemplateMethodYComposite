package Poo2.tp4.p4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SupermercadoTest {

	@Test
	void testCalculoJubiladoFueraDePromocion() {
		CalculadorVenta calc = new CalculadorJubilado(1, new Log());
		assertEquals(110.0, calc.calcularPrecio(100.0), 0.01);
	}

	@Test
	void testCalculoNoJubiladoEnPromocion() {
		CalculadorVenta calc = new CalculadorNoJubilado(5, new Log());
		assertEquals(115.0, calc.calcularPrecio(100.0), 0.01);
	}
}