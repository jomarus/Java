package p03pinturas;

public class Main {
	public static void main(String[] args) {
		
		Estacion estacion = new Estacion(3);
		
		Coche coche1 = new Coche(11111,estacion);
		Coche coche2 = new Coche(22222,estacion);
		Coche coche3 = new Coche(33333,estacion);
		Coche coche4 = new Coche(44444,estacion);
		Coche coche5 = new Coche(55555,estacion);
		Coche coche6 = new Coche(66666,estacion);
		Coche coche7 = new Coche(77777,estacion);

		coche1.start();
		coche2.start();
		coche3.start();
		coche4.start();
		coche5.start();
		coche6.start();
		coche7.start();

	}
}
