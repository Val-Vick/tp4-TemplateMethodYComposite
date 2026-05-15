package Poo2.tp4.p4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends CalculadorVenta {
	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorNoJubilado(int mesEnPromocion, LogTransaction log) {
		super(mesEnPromocion, log);
	}

	@Override
	protected double aplicarPromocion(double precio) {
		return precio * 0.15;
	}

	@Override
	protected double aplicarPrecioEstandar(double precio) {
		return precio * 0.21;
	}

	@Override
	protected void logearTransaccion() {
		log.log(CalculadorNoJubilado.class.getName());
	}
}
