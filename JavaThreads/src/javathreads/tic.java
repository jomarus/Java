
package javathreads;

public class tic extends Thread{
    
    private int x;
    
    public tic (int x){
        this.x=x;
    }
    
    @Override
    public void run(){
        while(x==5)
            System.out.println("tic");    
    }
    
}
