package cuenta;

import java.util.Random;

class Persona extends Thread{
	private Cuenta cuenta;
	private int saldo,randomInt;
	private String nombre;
	Random num = new Random();

	public Persona (Cuenta c,String nombre){
		cuenta=c;
		this.nombre=nombre;
	}
	
	public void run(){
		
		randomInt = num.nextInt(1000);
		cuenta.ingresar(randomInt,nombre);
		randomInt = num.nextInt(1000);
		cuenta.ingresar(randomInt,nombre);		
		saldo=cuenta.obtenerSaldo();
		System.out.println("Saldo de la cuenta es: "+saldo);

 			try {
				sleep(100);
			}catch (InterruptedException e){}
 			
	}
}
