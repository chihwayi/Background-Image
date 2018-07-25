/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author kuda
 */
public class MyFrame extends JFrame {
 public MyFrame() throws IOException {
this.setSize(800,510);
this.setTitle("JFrame with Background Image");

BufferedImage bf = ImageIO.read(new File("first.png"));
this.setContentPane(new backImage(bf));

JButton b = new JButton("Click");
JTextField tf = new JTextField();

b.setBounds(318,143,98,27);
tf.setBounds(235,104,180,27);

this.add(b);
this.add(tf);
}   
}
