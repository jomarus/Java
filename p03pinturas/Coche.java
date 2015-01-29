package p03pinturas;

public class Coche extends Thread{

	private int matricula;
	private Estacion estacion;

	public Coche(int matricula,Estacion estacion) {
		this.matricula = matricula;
		this.estacion = estacion;
	}


	@Override
	public void run() {
		System.out.println("Hola soy el coche: "+matricula);
		try {
			estacion.entraCoche(matricula);
			sleep(6000);
			estacion.saleCoche(matricula);
		}catch (InterruptedException e){}
	}


	public int getMatricula() {
		return matricula;
	}

}
