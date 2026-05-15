package Poo2.tp4.p2;

public class Spike extends Item{
	private double tiempoMinutos;

	public Spike (double tiempoMinutos){
		this.tiempoMinutos = tiempoMinutos;
	}

	@Override
	public double calcularTiempoTotal() {
		return tiempoMinutos;
	}
}
