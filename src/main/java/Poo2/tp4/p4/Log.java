package Poo2.tp4.p4;

public class Log implements LogTransaction {
	@Override
	public void log(String name) {
		System.out.println("Logueando transaccion de: " + name);
	}
}
