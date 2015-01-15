package Ej01_holaMundo;

public class PrimerHilo extends Thread{
	String saludo;
	public PrimerHilo(String saludo){
		this.saludo=saludo;
	}
	
	public void run(){
	for(int i=0;i<4;i++){
		System.out.println(saludo);
		}
	}
}