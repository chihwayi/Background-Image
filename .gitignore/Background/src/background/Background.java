/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package background;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author kuda
 */
public class Background extends JFrame{
   
Background(){
      add(new ContentPanel());
      setSize(800,550);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Background jrframe = new Background ();
 jrframe.setVisible(true);
    }
    
}
