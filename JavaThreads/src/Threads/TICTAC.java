
package Threads;

public class TICTAC {

    public static void main(String[] args) {

    Thread t1 = new Thread(new tic(1000));
    Thread t2 = new Thread(new tac(1000));
   
    t1.start();
    t2.start();
    
        System.out.println("2 hilos en ejecucion");
    }
    
}
