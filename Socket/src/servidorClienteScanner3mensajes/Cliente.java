package servidorClienteScanner3mensajes;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Cliente {
	//nombre  máquina y puerto
	static final String HOST = "localhost";
	static final int PUERTO=5000;
	int cont;

	public Cliente( ) {
		try{
			System.out.println("Soy el cliente ");

			while(true){
			//se crea el socket
			Socket skCliente = new Socket(HOST, PUERTO);

			//recojo flujo de datos del socket
			InputStream aux = skCliente.getInputStream();
			//asocio flujo de datos flujo de tipo DataInputStream
			DataInputStream flujo = new DataInputStream( aux );

			
			OutputStream aux2 = skCliente.getOutputStream();
			//asocio flujo de datos flujo de tipo DataOutputStream 
			DataOutputStream flujo2= new DataOutputStream( aux2 );
			

			//escribo
			Scanner sc=new Scanner(System.in);
			System.out.print("Enviar >> ");
			String mensaje=sc.nextLine();
			flujo2.writeUTF(mensaje);
			
			//Capturamos cadena del flujo con readUTF y muestro
			System.out.print("Recibido >> ");
			System.out.println( flujo.readUTF() );
			cont++;
			
			//Cierro el socket
			skCliente.close();
			if(cont==3){
				break;
			}
			}
			System.out.println("Cerrando sesion");

		}catch(Exception e) {
		System.out.println( e.getMessage() );
	}
	}
public static void main(String[] arg) {
new Cliente();
}
}
