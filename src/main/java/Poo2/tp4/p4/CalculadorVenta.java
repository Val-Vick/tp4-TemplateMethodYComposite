package Poo2.tp4.p4;

import java.time.LocalDate;
import java.time.Month;

abstract class CalculadorVenta implements Calculador {
	protected int mesEnPromocion;
	protected LogTransaction log;

	public CalculadorVenta(int mesEnPromocion, LogTransaction log) {
		this.mesEnPromocion = mesEnPromocion;
		this.log = log;
	}

	public final double calcularPrecio(double precioProducto) {
		double precioFinal = precioProducto;
		if (esMesDePromocion()) {
			precioFinal = aplicarPromocion(precioProducto);
		} else {
			precioFinal = aplicarPrecioEstandar(precioProducto);
		}

		logearTransaccion();
		return precioFinal;
	}

	private boolean esMesDePromocion() {
		return Month.of(mesEnPromocion).equals(LocalDate.now().getMonth());
	}

	protected abstract double aplicarPromocion(double precio);
	protected abstract double aplicarPrecioEstandar(double precio);
	protected abstract void logearTransaccion();
}