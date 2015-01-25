package p02_cuenta;

public class Main{
	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta(3000,10000); //cantidad inicial, maximo
		Persona pepe=new Persona(cuenta,"Pepe");
		Persona juan=new Persona(cuenta,"Juan");

		pepe.start();
		juan.start();
	}
}
