package Poo2.tp4.p1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpresaTest {

	@Test
	void testCalculoSalarioEmpleadoIndividual() {
		var juan = new EmpleadoRegular("Juan",100000.0);

		assertEquals(100000.0, juan.calcularMontoSalarial(), 0.01);
	}

	@Test
	void testCalculoSalarioJerarquiaLider() {
		var emp1 = new EmpleadoRegular("Luz",100000.0);
		var emp2 = new EmpleadoRegular("Agus",100000.0);

		var lider = new LiderProyecto("Anna",200000.0);

		lider.agregarEmpleado(emp1);
		lider.agregarEmpleado(emp2);

		assertEquals(400000.0, lider.calcularMontoSalarial(), 0.01);
	}
}