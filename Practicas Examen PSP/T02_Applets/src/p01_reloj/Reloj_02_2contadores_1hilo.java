package p01_reloj;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Reloj_02_2contadores_1hilo extends Applet implements Runnable, ActionListener {

	//Propiedades
	private Thread h;
	private Font fuente;
	long CONTADOR=1000;
	long CONTADOR2=1000;
	private boolean parar;
	private Button b1,b2; //botones del Applet
	
	
	public void start(){}	
	
	
	
	
	//método init
	public void init(){
		setBackground(Color.yellow);//color de fondo
		
		//añado botón 1 y su listener
		add(b1=new Button("Iniciar contador"));
		b1.addActionListener(this);
				
		//añado botón 2 y su listener
		add(b2=new Button("Parar contador"));
		b2.addActionListener(this);
		
		fuente=new Font("Verdana",Font.BOLD,26); //tipo de letra
	}
	

	public void run() {
		//inicializo parar a falso
		parar=false;
		
		//recojo hiloActual
		Thread hiloActual=Thread.currentThread();
		
		while (h==hiloActual && !parar){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){e.printStackTrace();}
			repaint();
			CONTADOR+=3;
			CONTADOR2-=3;

		}//fin while
		
	}//fin run
	
	
	public void paint(Graphics g){
		g.setFont(fuente);
		g.drawString(Long.toString((long)CONTADOR), getWidth()/2-40, getHeight()/2); //escribe contador
		g.drawString(Long.toString((long)CONTADOR2), getWidth()/2-40, 150); //escribe contador
		
	}
	
	
	//parar controlar pulsación botones	
	public void actionPerformed(ActionEvent e) {
		b1.setLabel("Continuar");
		
		if (e.getSource()==b1){//comienzo
			if (h!=null && h.isAlive()){ //si el hilo está corriendo y vivo no hago nada
					}
			else
			{
				h=new Thread(this);
				h.start();
			}
		} else if (e.getSource()==b2){ //parada
				parar=true;
		}
		
		
	}//actionperformed
	
	public void stop(){
		
		h=null;
	}

	






}