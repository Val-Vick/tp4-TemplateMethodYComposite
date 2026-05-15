package Poo2.tp4.p2;

import java.util.ArrayList;

public class Proyecto extends Item {
	private ArrayList<Item> items = new ArrayList<>();

	@Override
	public double calcularTiempoTotal() {
		double tiempo = 0;
		for(Item i: items){
			tiempo += i.calcularTiempoTotal();
		}
		return tiempo;
	}

	public void agregar(HistoriaUsuario hi) {
		items.add(hi);
	}

	public void agregar(Spike s) {
		items.add(s);
	}
}
