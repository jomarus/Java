package servidorClienteSaludo;
import java.io.* ;
import java.net.* ;
//Servidor espera conexiones a las que atenderá con un segundo socket
//Servidor saludará con frase "Hola cliente"
class ServidorInfinito {

//puerto espera conexiones
static final int PUERTO=5000;

	public ServidorInfinito( ) {

		try {
			//crea socket y espera
			ServerSocket skServidor = new ServerSocket( PUERTO );
			System.out.println("Escucho el puerto " + PUERTO );

			while(true){
				//Primitiva accept() crea nuevo socket skCliente
				//skCliente atiene al cliente
				Socket skCliente = skServidor.accept(); // Crea objeto

				//asocio flujo salida de datos al socket
				OutputStream aux = skCliente.getOutputStream();
				//asocio flujo de datos flujo de tipo DataOutputStream 
				DataOutputStream flujo= new DataOutputStream( aux );
				//escribo
				flujo.writeUTF( "Hola cliente " );
				
				//recojo flujo de datos del socket
				InputStream aux2 = skCliente.getInputStream();
				//asocio flujo de datos flujo de tipo DataInputStream
				DataInputStream flujo2 = new DataInputStream( aux2 );
				//Capturamos cadena del flujo con readUTF y muestro
				System.out.println( flujo2.readUTF() );
				
				flujo.writeUTF( "Adios cliente" );
				
				System.out.println( flujo2.readUTF() );			
				
				//cierro conexión
				skCliente.close();
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


