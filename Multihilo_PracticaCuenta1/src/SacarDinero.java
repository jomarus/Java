class SacarDinero extends Thread{
	private Cuenta c; //declaro objeto cuenta c
	String nom;
	
	//constructor
	public SacarDinero (String n, Cuenta c){
		super(n);
		this.c=c;
	}
	//run
	public void run(){
		synchronized (c) {//pasar la cuenta como parametro -> solo accede Ana en Ubuntu en Windows se alernan
			for (int x=1;x<=4;x++){
				c.RetirarDinero(10,getName());
			}
		}
	}
}
