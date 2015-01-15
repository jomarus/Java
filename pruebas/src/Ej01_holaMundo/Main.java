package Ej01_holaMundo;

public class Main{

	public static void main(String[] args) throws InterruptedException {

		PrimerHilo p = new PrimerHilo("Hilo1");
		PrimerHilo p2 = new PrimerHilo("Hilo2");
		p.start();	
		p2.start();	
	}
}
