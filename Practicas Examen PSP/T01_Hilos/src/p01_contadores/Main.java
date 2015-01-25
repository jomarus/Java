package p01_contadores;

public class Main extends Thread{
	
    public static void main(String[] args) throws InterruptedException {
    	
	    Contadores hilo1 = new Contadores(0,0,1,3);
	    Contadores hilo2 = new Contadores(100,100,1,2);
	    Contadores hilo3 = new Contadores(200,200,3,4);

	    hilo1.start();
	    hilo2.start();
	    hilo3.start();

	    while(true){
	    	System.out.println("Hilo1: contador1: "+hilo1.getCont1()+" contador2: "+hilo1.getCont2());
	    	sleep(333);
	    	System.out.println("Hilo2: contador1: "+hilo2.getCont1()+"contador2: "+hilo2.getCont2());
	    	sleep(333);
	    	System.out.println("Hilo3: contador1: "+hilo3.getCont1()+"contador2: "+hilo3.getCont2());
	    	sleep(333);
	    	
	    	hilo2.stop();
	    }
    }
}
