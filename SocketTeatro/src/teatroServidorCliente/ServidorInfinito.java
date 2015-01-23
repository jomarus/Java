package teatroServidorCliente;
import java.io.* ;
import java.net.* ;
import java.util.Scanner;
//Servidor espera conexiones a las que atenderÃ¡ con un segundo socket
//Servidor saludarÃ¡ con frase "Hola cliente"
class ServidorInfinito {

	//puerto espera conexiones
	static final int PUERTO=5000;
	String respuesta,mensaje,menu;
	int lat1=4,lat2=4;
	int vip1=3,vip2=3;
	int gal=8;
	int cen=54;
	OutputStream aux;
	DataOutputStream flujo;
	InputStream aux2;
	DataInputStream flujo2;
	Socket skCliente;
	public ServidorInfinito( ) {

		try {
			//crea socket y espera
			ServerSocket skServidor = new ServerSocket( PUERTO );
			System.out.println("Escucho el puerto " + PUERTO );
			System.out.println("Soy el server ");
			

			//Crear SocketCliente con accept()
			skCliente = skServidor.accept();
			System.out.println("Cliente conectado ");
			
			//Flujo enviar
			aux = skCliente.getOutputStream();
			flujo= new DataOutputStream( aux );
			
			//Flujo recibir
			aux2 = skCliente.getInputStream();
			flujo2 = new DataInputStream( aux2 );
			
			menu="****BIENVENIDOS A LA RESERVA DE ENTRADAS****\n"
					+ "0. Menu\n"
					+ "1. Reservar entradas lat. izq\n"
					+ "2. Reservar entradas lat. derch\n"
					+ "3. Reservar entradas Galeria\n"
					+ "4. Reservar entradas Centrales\n"
					+ "5. Reservar entradas Palco vip1\n"
					+ "6. Reservar entradas Palco vip2\n"
					+ "7. Ver precios y entradas\n"
					+ "8. Salir\n";
			System.out.println("Enviar >> "+menu);
			flujo.writeUTF(menu);
			
			while(true){

				//LECTURA Y ESCRITURA
				//Capturar flujo con readUTF
				mensaje=flujo2.readUTF();
				System.out.println("Recibido >> "+mensaje);
				
				
				if(mensaje.equals("0")){
					System.out.println("Enviar >> "+menu);
					flujo.writeUTF(menu);
				}
				else if(mensaje.equals("1")){
					if(lat1>0){
						lat1--;
						respuesta="Quedan "+lat1+" entradas laterales izquierda";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}else{
						respuesta="Entradas agotadas";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}
				}
				else if(mensaje.equals("2")){
					if(lat2>0){
						lat2--;
						respuesta="Quedan "+lat2+" entradas laterales derecha";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}else{
						respuesta="Entradas agotadas";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}
				}
				else if(mensaje.equals("3")){
					if(gal>0){
					gal--;
					respuesta="Quedan "+gal+" entradas Galeria";
					System.out.println("Enviar >> "+respuesta);
					flujo.writeUTF(respuesta);
					}else{
						respuesta="Entradas agotadas";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}
				}
				else if(mensaje.equals("4")){
					if(cen>0){
					cen--;
					respuesta="Quedan "+cen+" entradas Centrales";
					System.out.println("Enviar >> "+respuesta);
					flujo.writeUTF(respuesta);
					}else{
						respuesta="Entradas agotadas";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}
				}
				else if(mensaje.equals("5")){
					if(vip1>0){
					vip1--;
					respuesta="Quedan "+vip1+" entradas Palco vip1";
					System.out.println("Enviar >> "+respuesta);
					flujo.writeUTF(respuesta);
					}else{
						respuesta="Entradas agotadas";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}
				}
				else if(mensaje.equals("6")){
					if(vip2>0){
					vip2--;
					respuesta="Quedan "+vip2+" entradas Palco vip2";
					System.out.println("Enviar >> "+respuesta);
					flujo.writeUTF(respuesta);
					}else{
						respuesta="Entradas agotadas";
						System.out.println("Enviar >> "+respuesta);
						flujo.writeUTF(respuesta);
					}
				}
				else if(mensaje.equals("7")){
					respuesta="Quedan "+lat1+" entradas lat. izq\t Precio: 100€\n"
							+ "Quedan "+lat2+" entradas lat. derch\t Precio: 100€\n"
							+ "Quedan "+gal+" entradas Galeria\t Precio: 150€\n"
							+ "Quedan "+cen+" entradas Centrales\t Precio: 80€\n"
							+ "Quedan "+vip1+" entradas Palco vip1\t Precio: 250€\n"
							+ "Quedan "+vip2+" entradas Palco vip2\t Precio: 250€";
					System.out.println("Enviar >> "+respuesta);
					flujo.writeUTF(respuesta);
				}
				else if(mensaje.equals("8")){
					System.out.println("Cerrando la conexion del cliente");
					flujo.writeUTF("Cerrando la conexion");
					skCliente.close();
					
					//Crear SocketCliente con accept()
					skCliente = skServidor.accept();
					System.out.println("Cliente conectado");

					//Flujo enviar
					aux = skCliente.getOutputStream();
					flujo= new DataOutputStream( aux );
					
					//Flujo recibir
					aux2 = skCliente.getInputStream();
					flujo2 = new DataInputStream( aux2 );
					
					System.out.println("Enviar >> "+menu);
					flujo.writeUTF(menu);
				}
				else{
					System.out.println("Error");
					flujo.writeUTF("Error");
				}
			}


		}catch( Exception e ) {

	System.out.println( e.getMessage() );

	}

}

public static void main( String[] arg ) {

new ServidorInfinito();

}

}


