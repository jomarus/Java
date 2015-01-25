package t01_hilos;

public class Hilo extends Thread{
	
	int cont;
	
	public Hilo(int cont) {
		this.cont=cont;
	}
	
	@Override
	public void run() {
		System.out.println("Hola");
		for(int i=0;i<10;i++){
			System.out.println(cont);
			cont++;
		}
	}

}
