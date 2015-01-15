package Ej02_sleep;

public class Main{

	public static void main(String[] args) throws InterruptedException {

		Sleep p = new Sleep("Hilo1");
		Sleep p2 = new Sleep("Hilo2");
		try{		
		p.start();
		p.sleep(500);
		p2.start();
		
		}catch(Exception e){}
	}
}
