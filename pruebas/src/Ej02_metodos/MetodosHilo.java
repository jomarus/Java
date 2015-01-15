package Ej02_metodos;

public class MetodosHilo extends Thread{
	String saludo;
	public MetodosHilo(String saludo){
		this.saludo=saludo;
	}
	
	public void run(){
		for(int i=0;i<4;i++){
			System.out.println(saludo);
		}
		System.out.println("");
	}
}