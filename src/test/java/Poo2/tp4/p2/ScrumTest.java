package Poo2.tp4.p2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScrumTest {

	@Test
	void testTiempoHistoriaUsuario() {
		HistoriaUsuario hu = new HistoriaUsuario();
		hu.agregar(new Tarea(180)); // 3hs
		hu.agregar(new Tarea(300)); // 5hs

		assertEquals(480, hu.calcularTiempoTotal());
	}

	@Test
	void testTiempoProyectoCompleto() {
		Proyecto proyecto = new Proyecto();

		HistoriaUsuario hu = new HistoriaUsuario();
		hu.agregar(new Tarea(600)); //10hs

		Spike investigacion = new Spike(240);// 4hs

		proyecto.agregar(hu);
		proyecto.agregar(investigacion);

		assertEquals(840, proyecto.calcularTiempoTotal());
	}
}
