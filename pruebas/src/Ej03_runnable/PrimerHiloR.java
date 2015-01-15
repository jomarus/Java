package Ej03_runnable;

public class PrimerHiloR implements Runnable{
	
	private int x;
	Thread hilo=null;
	
	PrimerHiloR (int x){
		this.x=x;
		hilo = new Thread(this);
		hilo.start();
	}
	
	public void run(){
		try {
			for (int i=0;i<x;i++){
				System.out.println("En el hilo..."+i);
				hilo.sleep(1000);
				}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}	
}