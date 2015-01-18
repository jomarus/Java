
package menujavaexterno;

import java.io.*;

public class MenuJavaExterno {

    public static void main(String[] args){

        try{
            
           for(int i=0;i<5;i++){
               
                Runtime.getRuntime().exec("notepad.exe");
                Thread.sleep(1000);      
                Runtime.getRuntime().exec("taskkill /IM notepad.exe");  
                Thread.sleep(1000);      

           }

           
        }catch(Exception e){
            System.out.println(e.getMessage());
            }
    }  
}
