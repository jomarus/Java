package t01_hilos;

public class Main {

	public static void main(String[] args) {
		Hilo hilo1 = new Hilo(10);
		Hilo hilo2 = new Hilo(5);
		hilo1.start();
		hilo2.start();
	}
}
