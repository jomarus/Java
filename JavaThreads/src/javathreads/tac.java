
package javathreads;

public class tac extends Thread{
    
    private int x;

    public tac (int x){
        this.x=x;
    }
    
    @Override
    public void run(){
        while(x==5)
            System.out.println("tac");    
    } 
}
