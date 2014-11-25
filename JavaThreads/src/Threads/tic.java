
package Threads;

public class tic extends Thread{
    
    private int x;

    public tic (int x){
        this.x=x;
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("tic");
            try {
                sleep(x);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } 
    }
}