package Poo2.tp4.p3;

public class SeguroIndividual implements ElementoSeguro {
	private TipoSeguro tipo;
	private double costo;

	public SeguroIndividual(TipoSeguro tipo, double costo) {
		this.tipo = tipo;
		this.costo = costo;
	}

	@Override
	public double calcularCosto() {
		return costo;
	}
}