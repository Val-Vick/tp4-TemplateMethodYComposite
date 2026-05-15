package Poo2.tp4.p5;

class RemeraNacional extends CalculadoraPrecio {
	@Override
	protected double aplicarRecargosYBonificaciones(double precio) {
		double conTransporte = precio + (precio * 0.015);
		return conTransporte - (conTransporte * 0.20);
	}

	@Override
	protected double aplicarMargenComercio(double precio) {
		return precio + (precio * 0.15);
	}
}