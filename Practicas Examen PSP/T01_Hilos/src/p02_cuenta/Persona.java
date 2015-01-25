package p02_cuenta;

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
		for(int i=0;i<10;i++){
		randomInt = num.nextInt(1000);
		if(randomInt%2==0){ //pares ingresan,impares sacan dinero
			cuenta.ingresar(randomInt,nombre);
		}else{
			cuenta.reintegro(randomInt,nombre);
		}
		saldo=cuenta.obtenerSaldo();

		System.out.println("Saldo de la cuenta es: "+saldo);
 			try {
				sleep(100);
			}catch (InterruptedException e){}
		}
	}
}
