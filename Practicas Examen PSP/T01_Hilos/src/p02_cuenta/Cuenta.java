package p02_cuenta;

public class Cuenta {
	//atributos
	private int saldo;  
	private int maximoSaldo; 
	
	//contructor con saldo inicial y maximo
	public Cuenta(int valorSaldo, int maximo){
		this.saldo=valorSaldo;
		this.maximoSaldo=maximo;
	}

	//get
	public synchronized int obtenerSaldo(){
		return saldo; //no hay numero 
	}
	
	//ingresar
	public synchronized void ingresar(int valorOperacion, String nombre){
		
		saldo=saldo+valorOperacion;
		System.out.println(nombre+ " ingresa: "+valorOperacion);
		while (saldo>maximoSaldo) { 
			try {
				System.out.println("Saldo supera el maximo");
				wait();
			}catch (InterruptedException e){};	
		}	
	}
	
	//registrar
	public synchronized void reintegro(int valorOperacion, String nombre){
		saldo=saldo-valorOperacion;	
		System.out.println(nombre+ " saca: "+valorOperacion);
		while (saldo<0) { 
			try {
				System.out.println("Saldo insuficiente:");
				wait();
			}catch (InterruptedException e){};	
		}
	}
}
