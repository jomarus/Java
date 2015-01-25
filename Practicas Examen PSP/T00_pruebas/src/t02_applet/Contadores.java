package t02_applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Contadores extends Applet implements Runnable {
	
	private Thread hilo=null; //hilo
	private String horaActual="Hola";
	private String horaActual2="Hola";
	private Font fuente; 
	HiloContador contador;
	HiloContador contador2;

	//Instrucciones para iniciar el applet
	public void init(){
		
		fuente=new Font("Verdana",Font.BOLD,26);
		setBackground(Color.BLUE); //color de fondo

		hilo=new Thread(this);	
		contador = new HiloContador(1);
		contador2 = new HiloContador(5);

		hilo.start();
		
	}
	
	//Similar a init pero es llamado al reiniciar
	public void start(){

	}
	
	//Iniciar hilo
	public void run(){
		contador.start();
		contador2.start();
	
		while(true){
			horaActual=Integer.toString(contador.getContador());
			horaActual2=Integer.toString(contador2.getContador());

			repaint(); //actualiza contenido applet
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){e.printStackTrace();}
		}
	}
	
	//Pinta el applet
	public void paint(Graphics g){		
		//g.clearRect(1,1, getSize().width,getSize().height);
		g.setFont (fuente); //fuente
		g.drawString(horaActual,30,90); // muestra la hora
		g.drawString(horaActual2,150,90); // muestra la hora

	}
	
	//Detener hilos
	public void stop(){
	}
	
}
