import java.io.BufferedReader;
import java.io.InputStreamReader;
public class sumador{
	public static void main (String[] args){
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (in);
	String texto,texto2;
	int resultado,num1,num2;
	
	try{
		System.out.println("Introduce una cadena...");
		texto=br.readLine();
		System.out.println("Introduce segunda cadena...");
		texto2=br.readLine();
		in.close();
		
		num1=Integer.parseInt(texto);
		num2=Integer.parseInt(texto2);
		
		resultado=num1+num2;
		
		System.out.println("Cadena escrita desde el sumador : "+resultado);
		
		}catch (Exception e) {e.printStackTrace();}

	}//fin main
}//fin ejemplo lectura