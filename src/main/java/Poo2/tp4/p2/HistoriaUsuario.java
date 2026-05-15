package Poo2.tp4.p2;

import java.util.ArrayList;

public class HistoriaUsuario extends Item {
	private ArrayList<Item> tareas = new ArrayList<>();;

	@Override
	public double calcularTiempoTotal() {
		double tiempo = 0;
		for(Item i: tareas){
			tiempo += i.calcularTiempoTotal();
		}
		return tiempo;
	}

	public void agregar(Tarea t) {
		tareas.add(t);
	}
}
