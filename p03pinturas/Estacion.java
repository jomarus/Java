package p03pinturas;

public class Estacion {
	
	private int capacidadCoches;
	private int numCoches=0;

	public Estacion(int capacidadCoches) {
		this.capacidadCoches = capacidadCoches;
		System.out.println("En la estacion caben: "+capacidadCoches+" coches");
	}
	
	public synchronized void entraCoche(int matricula){
		if(capacidadCoches>numCoches) { 
			System.out.println("Entra el coche: "+ matricula);
			numCoches++;
		}else{
			System.out.println("Maximo numero de coches alcanzado");	
			try {
				wait();
				System.out.println("Entra el coche: "+ matricula);
				numCoches++;
			} catch (Exception e) {e.getMessage();}
		}
	}
	
	public synchronized void saleCoche(int matricula){
		numCoches--;
		notify();
		System.out.println("Sale el coche: "+matricula);
		System.out.println("El numero de coches en la estacion es : "+numCoches);
	}
}
