
package Threads;

public class tac extends Thread{
    
    private int x;

    public tac (int x){
        this.x=x;
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("tac");
            try {
                sleep(x);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } 
    }
}
