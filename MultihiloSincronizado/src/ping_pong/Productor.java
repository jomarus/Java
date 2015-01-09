package ping_pong;

class Productor extends Thread{
	private Cola cola;
	private String n="ping";

	public Productor (Cola c){
		cola=c;
	}
	
	public void run(){
		
		for (int i=0;i<5;i++){
			cola.put(n); //pone el número
			System.out.println(i	+"->Productor: produce "+n);
			if(i%2==0){
				n="pong";
			}else{
				n="ping";
			}
 			try {
				sleep(100);
			}catch (InterruptedException e){}
		}
	}
}
