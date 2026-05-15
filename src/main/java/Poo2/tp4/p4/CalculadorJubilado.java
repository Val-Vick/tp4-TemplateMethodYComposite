package Poo2.tp4.p4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends CalculadorVenta {
	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorJubilado(int mesEnPromocion, LogTransaction log) {
		super(mesEnPromocion, log);
	}

	@Override
	protected double aplicarPromocion(double precio) {
		return precio * 0.1;
	}

	@Override
	protected double aplicarPrecioEstandar(double precio) {
		return 0;
	}

	@Override
	protected void logearTransaccion() {
		log.log(CalculadorJubilado.class.getName());
	}
}
