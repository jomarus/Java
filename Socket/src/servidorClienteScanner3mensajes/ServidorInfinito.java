package servidorClienteScanner3mensajes;
import java.io.* ;
import java.net.* ;
import java.util.Scanner;
//Servidor espera conexiones a las que atenderá con un segundo socket
//Servidor saludará con frase "Hola cliente"
class ServidorInfinito {

//puerto espera conexiones
static final int PUERTO=5000;
int cont;
	public ServidorInfinito( ) {

		try {
			//crea socket y espera
			ServerSocket skServidor = new ServerSocket( PUERTO );
			System.out.println("Escucho el puerto " + PUERTO );
			System.out.println("Soy el server ");

			while(true){
				//Primitiva accept() crea nuevo socket skCliente
				//skCliente atiene al cliente
				Socket skCliente = skServidor.accept(); // Crea objeto

				//asocio flujo salida de datos al socket
				OutputStream aux = skCliente.getOutputStream();
				//asocio flujo de datos flujo de tipo DataOutputStream 
				DataOutputStream flujo= new DataOutputStream( aux );
				//escribo
				//flujo.writeUTF( "Hola cliente " );
				
				//recojo flujo de datos del socket
				InputStream aux2 = skCliente.getInputStream();
				//asocio flujo de datos flujo de tipo DataInputStream
				DataInputStream flujo2 = new DataInputStream( aux2 );
				//Capturamos cadena del flujo con readUTF y muestro
				
				System.out.print("Recibido >> ");
				System.out.println( flujo2.readUTF() );
				
				Scanner sc=new Scanner(System.in);
				System.out.print("Enviar >> ");
				String mensaje=sc.nextLine();
				flujo.writeUTF(mensaje);
				cont++;
				if(cont==3){
					skCliente.close();
					System.out.println("Cerrando sesion");
					break;
				}	
			}//fin for
			//System.out.println("Demasiados clientes por hoy");

		} catch( Exception e ) {

	System.out.println( e.getMessage() );

	}

}

public static void main( String[] arg ) {

new ServidorInfinito();

}

}


