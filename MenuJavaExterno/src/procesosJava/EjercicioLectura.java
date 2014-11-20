import java.util.Scanner;


public class EjercicioLectura{
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	
	String comando="";
	Scanner sc;
	Process p;

	try{
		sc = new Scanner(System.in);
		System.out.println("indica el comando a ejecutar");
		comando=sc.nextLine();
		r.exec(comando);
		System.out.println("cerrar el proceso");
		comando=sc.nextLine();
		r.exec("kill " +comando);
		System.out.print("El proceso "+comando+" se ha ejecutado");
		} catch(Exception e) {
			System.out.println ("Error en "+comando);
			}
	}

}//Ejemplo1
