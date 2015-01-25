package t02_applet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HiloContador extends Thread{
	private String horaActual="";
	int cont;
	
	public HiloContador(int cont) {
		this.cont=cont;
	}
	
	@Override
	public void run() {
		
		while(true){
			cont++;
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){e.printStackTrace();}
		}

	}
	public int getContador(){		
		return cont;
	}
}
