
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class PelotaRebota extends Applet implements Runnable, ActionListener {

	//Propiedades
	private Thread h;

	private Font fuente;
	private volatile boolean parar1,parar2;
	private Button b1,b2,b3; //botones del Applet
	
	int x=0,y=0;
	int sumadorx=8;
	int sumadory=10;
	int origenx;
	int origeny;
	
	public void start(){
	}	

	//Metodo init del Applet
	public void init(){
		setBackground(Color.yellow);//color de fondo
		
		//a�ado boton 1 y su listener
		add(b1=new Button("Iniciar pelota"));
		b1.addActionListener(this);
				
		//a�ado boton 2 y su listener
		add(b2=new Button("Parar pelota"));
		b2.addActionListener(this);	
		
		//a�ado boton 3 y su listener
		add(b3=new Button("Interrumpir pelota"));
		b3.addActionListener(this);	
		
		fuente=new Font("Verdana",Font.BOLD,26); //tipo de letra
	}
	
	//Funcion Start
	public void run() {
		try{
		Thread hiloActual=Thread.currentThread();
		
		//inicializo parar a falso
		parar1=false;	
		
		while (!parar1){
			h.sleep(100); //velocidad de la pelota
			repaint();
		}//fin while
		
		}catch (InterruptedException e){
			System.out.println("Ha ocurrido una excepcion");
		}
	}//fin run
	
	//Funcion update
	public void paint(Graphics g){
		
		//movimiento de la pelota
		x +=sumadorx;
		y +=sumadory;
		
		if(x>getWidth()-15||x<=0){
			sumadorx=-sumadorx;
		}
		if(y>getHeight()-20|| y<=0){
			sumadory=-sumadory;
		}
		
		g.setColor(Color.BLUE);
		g.fillArc(x,y, 10, 10, 0, 360);	
	}
	
	
	//parar controlar pulsacion botones	
	public void actionPerformed(ActionEvent e) {
		b1.setLabel("Continuar");
		
		if (e.getSource()==b1){//comienzo
			if (h!=null && h.isAlive()){ //si el hilo esta corriendo y vivo no hago nada
			}
			else
			{
				h=new Thread(this);
				h.start();
			}
		} else if (e.getSource()==b2){ //parada con flag
				parar1=true;
		} else if (e.getSource()==b3){ //parada con interrupcion
			h.interrupt();	
		}
	}
}
