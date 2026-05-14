package Poo2.tp4.p1;

public class EmpleadoRegular implements Empleado{
	private String nombre;
	private double salario;

	public EmpleadoRegular(String nombre, double salario){
		this.nombre = nombre;
		this.salario = salario;
	}

	@Override
	public double calcularMontoSalarial() {
		return this.salario;
	}
}
