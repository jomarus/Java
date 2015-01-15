package Ej02_sleep;

public class Sleep extends Thread{
	String saludo;
	public Sleep(String saludo){
		this.saludo=saludo;
	}
	
	public void run(){
		try {
			for(int i=0;i<4;i++){
				this.sleep(1000);
				System.out.println(saludo);
				}
			} catch (InterruptedException e) {
		}
	}
}