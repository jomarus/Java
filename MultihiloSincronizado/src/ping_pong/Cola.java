package ping_pong;

public class Cola {
	//atributos
	private String valorConsumidor;
	
	// inicialmente vacia
	private boolean disponible=false;  

	//metodos
	//sacar
	public synchronized String get(){
		//si esta vacia
		while (disponible==false) { 
			try {
				wait();
			}catch (InterruptedException e){};
		
		}	
		disponible=false;
		notifyAll();
		return valorConsumidor; //no hay numero 
	}

	public synchronized void put(String valorProductor){
		//si no esta vacia
		while (disponible==true) { 
			try {
				wait();
			}catch (InterruptedException e){};
		
		}
		valorConsumidor=valorProductor;
		disponible=true;
		notifyAll();
		
	}
}
