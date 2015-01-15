package Ej02_metodos;

public class Main{

	public static void main(String[] args) throws InterruptedException {

		MetodosHilo p = new MetodosHilo("Hilo1");

		System.out.println("Esta vivo? "+p.isAlive());
		System.out.println("Que estado? "+p.getState()+"\n");
		try{	
			p.start();
			System.out.println("Esta vivo? "+p.isAlive());
			System.out.println("Que estado? "+p.getState()+"\n");
			
			p.join();//Espera que termine el hilo
			System.out.println("Esta vivo? "+p.isAlive());
			System.out.println("Que estado? "+p.getState()+"\n");
			
			System.out.println("Duerme 1 segundo: ");
			p.sleep(1000);
			
			System.out.println("Convertido a String: "+p.toString());

		}catch(Exception e){}
	}
}
