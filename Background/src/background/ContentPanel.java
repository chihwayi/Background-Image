package background;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author kuda
 */
public class ContentPanel extends JPanel{
    Image bgimage = null;
  ContentPanel(){
      MediaTracker mt = new MediaTracker(this);
      bgimage = Toolkit.getDefaultToolkit().getImage("first.png");
      mt.addImage(bgimage,0);
try{
      mt.waitForAll();
}
catch(InterruptedException e){
          e.printStackTrace();
          }
         }

 protected void paintComponent(Graphics g){
  super.paintComponent(g);
  int imwidth = bgimage.getWidth(null);
  int imheight = bgimage.getHeight(null);
  g.drawImage(bgimage,1,1,null);
     }  
}
