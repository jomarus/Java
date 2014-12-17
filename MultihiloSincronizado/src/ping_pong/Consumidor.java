package ping_pong;

class Consumidor extends Thread {
	private Cola cola;
	private String n;

	public Consumidor (Cola c){
		cola=c;
	}
	
	public void run(){
		String valor="";
		for (int i=0;i<5;i++){
			valor=cola.get();//recoge el numero
			System.out.println(i+"->Consumidor: consume "+valor);		
		}
	}
}
