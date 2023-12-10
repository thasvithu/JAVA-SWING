import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("01 FRAMES"); // sets titile of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from beging resized
        this.setSize(600, 600); // sets the x-dimension, and y-dimension of the frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("./source/logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame

        // CHANGE BACKGOROUNF COLOR 
        // METHOD 1 
        //this.getContentPane().setBackground(Color.gray); // change color of background

        // METHOD 2
        //this.getContentPane().setBackground(new Color(50,120,240)); // change color of background

        // METHOD 3
        this.getContentPane().setBackground(new Color(0x123456)); // change color of background
    }
}
