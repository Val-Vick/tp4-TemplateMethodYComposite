package Poo2.tp4.p5;

public class RemeraImportada extends CalculadoraPrecio{
	@Override
	protected double aplicarRecargosYBonificaciones(double precio) {
		return precio + (precio * 0.03);
	}

	@Override
	protected double aplicarImpuestosExtra(double precio) {
		return precio + (precio * 0.05);
	}

	@Override
	protected double aplicarMargenComercio(double precio) {
		return precio + (precio * 0.25);
	}
}
