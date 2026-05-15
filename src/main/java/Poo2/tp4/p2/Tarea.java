package Poo2.tp4.p2;

public class Tarea extends Item {
	private double tiempoMinutos;

	public Tarea(double tiempoMinutos){
		this.tiempoMinutos = tiempoMinutos;
	}

	@Override
	public double calcularTiempoTotal() {
		return tiempoMinutos;
	}
}
