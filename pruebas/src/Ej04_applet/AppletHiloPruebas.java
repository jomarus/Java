package Ej04_applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletHiloPruebas extends Applet implements Runnable {

	private Thread h;
	private Thread h2;
	int x=0,y=0;
	
	//Metodo init del Applet, sustituye a MAIN
	public void init(){	
		h=new Thread(this);
		h.start();	
	}
	
	//Metodo run de Runnable
	public void run() {
		try{		
			while (true){
				h.sleep(1000); //velocidad de la pelota
				repaint();
				x +=2;
			}
		}catch (InterruptedException e){
			System.out.println("Ha ocurrido una excepcion");
		}
	}
	
	//Metodo dibujo del applet
	public void paint(Graphics g){
		setBackground(Color.RED);
		g.setColor(Color.BLUE);
		g.fillArc(x,y, 10, 10, 0, 360);	
		g.drawString(Integer.toString(x),50,50);		
	}
}