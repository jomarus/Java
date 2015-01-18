package teatroServidorCliente;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Cliente {
	//nombre  máquina y puerto
	static final String HOST = "localhost";
	static final int PUERTO=5000;
	int cont;
	OutputStream aux2;
	DataOutputStream flujoSalida;
	InputStream aux;
	DataInputStream flujoEntrada;
	Socket skCliente;
	String mensaje;
	boolean activo=true;
	public Cliente( ) {
		try{
			String entrada;
		System.out.println("Soy el cliente ");
		skCliente = new Socket(HOST, PUERTO);

		//Flujo recibir
		aux = skCliente.getInputStream();
		flujoEntrada = new DataInputStream( aux );
		
		//Flujo enviar
		aux2 = skCliente.getOutputStream();
		flujoSalida= new DataOutputStream( aux2 );
		
		//Recibir saludo
		entrada=flujoEntrada.readUTF();
		System.out.println(entrada);
		
			while(activo){

				//escribo
				Scanner sc=new Scanner(System.in);
				System.out.println("Enviar >> ");
				mensaje=sc.nextLine();
				flujoSalida.writeUTF(mensaje);
				if(mensaje.equals("8")){
					activo=false;
				}

				//Capturamos cadena del flujo con readUTF y muestro
				System.out.println("Recibido >> ");
				entrada=flujoEntrada.readUTF();
				System.out.println(entrada);
			}
		}catch(Exception e) {System.out.println( e.getMessage() );}
	}

	
	public static void main(String[] arg) {
		Cliente cliente=new Cliente();
	}
}
