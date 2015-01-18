
package menujavaexterno;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JFrame;

public class MenuJavaExterno{

    public static void main(String[] args){

        Menu menu = new Menu();
        menu.setVisible(true);
        try{
           while(true){
            Runtime.getRuntime().exec("cmd /c start /B candil.armedia");
            Thread.sleep(20000);      
            Runtime.getRuntime().exec("taskkill /IM armedia_player.exe");  
            Runtime.getRuntime().exec("cmd /c start /B craneo002.armedia");
            Thread.sleep(20000);      
            Runtime.getRuntime().exec("taskkill /IM armedia_player.exe");    
            Runtime.getRuntime().exec("cmd /c start /B cratera001.armedia");
            Thread.sleep(20000);      
            Runtime.getRuntime().exec("taskkill /IM armedia_player.exe");  
            Runtime.getRuntime().exec("cmd /c start /B hermes000.armedia");
            Thread.sleep(20000);      
            Runtime.getRuntime().exec("taskkill /IM armedia_player.exe");   
           }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
