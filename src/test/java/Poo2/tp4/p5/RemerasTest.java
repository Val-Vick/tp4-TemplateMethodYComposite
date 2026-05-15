package Poo2.tp4.p5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemerasTest {

	@Test
	void testRemeraImportada() {
		CalculadoraPrecio importada = new RemeraImportada();
		// Precio: 100 -> +3% (103) -> +5% (108.15) -> +25% (135.18)
		assertEquals(135.18, importada.calcularPrecioFinal(100.0), 0.1);
	}

	@Test
	void testRemeraNacional() {
		CalculadoraPrecio nacional = new RemeraNacional();
		// Precio: 100 -> +1.5% (101.5) -> -20% (81.2) -> +15% (93.38)
		assertEquals(93.38, nacional.calcularPrecioFinal(100.0), 0.1);
	}
}