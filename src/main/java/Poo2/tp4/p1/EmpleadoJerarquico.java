package Poo2.tp4.p1;

import java.util.ArrayList;

public abstract class EmpleadoJerarquico implements Empleado {
	protected String nombre;
	protected double salario;
	protected ArrayList<Empleado> empleados;

	public EmpleadoJerarquico(String nombre, double salario){
		this.nombre = nombre;
		this.salario = salario;
		empleados = new ArrayList<>();
	}

	public void agregarEmpleado(Empleado e){
		this.empleados.add(e);
	}

	@Override
	public double calcularMontoSalarial(){
		double total = salario;
		for (Empleado e : empleados){
			total += e.calcularMontoSalarial();
		}
		return total;
	}
}
