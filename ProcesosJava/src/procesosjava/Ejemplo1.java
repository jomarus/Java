
package procesosjava;

public class Ejemplo1{
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	String comando="notepad";
	Process p;

	try{
		p=r.exec(comando);
		System.out.print("El proceso "+comando+" se ha ejecutado");
		} catch(Exception e) {
			System.out.println ("Error en "+comando);
			}
	}

}//Ejemplo1
