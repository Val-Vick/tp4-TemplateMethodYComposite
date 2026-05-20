package Poo2.tp4.p3;

import java.util.ArrayList;

class PaqueteSeguros implements ElementoSeguro {
	private ArrayList<ElementoSeguro> elementos = new ArrayList<>();

	public void agregarElemento(ElementoSeguro elemento) {
		elementos.add(elemento);
	}

	@Override
	public double calcularCosto() {
		double sumaBase = 0;
		for (ElementoSeguro e : elementos) {
			sumaBase += e.calcularCosto();
		}

		double porcentajeDescuento = elementos.size() * 0.05;
		return sumaBase * (1 - porcentajeDescuento);
	}
}
