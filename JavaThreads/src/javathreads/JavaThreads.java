
package javathreads;

public class JavaThreads {

    public static void main(String[] args) {

    Thread t1 = new Thread(new tic(5));
    Thread t2 = new Thread(new tac(5));
   
    t1.start();
    t2.start();
    
        System.out.println("2 hilos en ejecucion");
    }
    
}
