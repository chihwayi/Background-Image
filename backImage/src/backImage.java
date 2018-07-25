/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author kuda
 */
public class backImage extends JComponent{
  Image i;

public backImage(Image i){
this.i = i;
}

public void paintComponent(Graphics g) {
g.drawImage(i,0,0,null);
}  
}
