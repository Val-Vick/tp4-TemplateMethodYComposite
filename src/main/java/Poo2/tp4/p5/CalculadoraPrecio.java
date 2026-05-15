package Poo2.tp4.p5;

public abstract class CalculadoraPrecio {

	public final double calcularPrecioFinal(double precioUnitario) {
		precioUnitario = aplicarRecargosYBonificaciones(precioUnitario);
		precioUnitario = aplicarImpuestosExtra(precioUnitario);
		return aplicarMargenComercio(precioUnitario);
	}

	protected abstract double aplicarRecargosYBonificaciones(double precioUnitario);

	protected double aplicarImpuestosExtra(double precioUnitario) {
		return precioUnitario;
	}

	protected abstract double aplicarMargenComercio(double precioUnitario);


}
