package p01_contadores;

public class Contadores extends Thread{
    
    private int cont1,cont2,inc1,inc2;

    public Contadores (int cont1, int cont2,int inc1, int inc2){
        this.cont1=cont1;
        this.cont2=cont1;
        this.inc1=inc1;
        this.inc2=inc2;
    }
    
    public int getCont1() {
		return cont1;
	}

	public int getCont2() {
		return cont2;
	}

	@Override
    public void run(){
    	
        while(true){
            try {
            cont1+=inc1;
            cont2+=inc2;
            //System.out.println("contador1: "+cont1);
            sleep(1000);
            //System.out.println("contador2: "+cont2);

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
