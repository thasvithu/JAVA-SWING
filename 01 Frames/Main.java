import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        /*

        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("01 FRAMES"); // sets titile of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from beging resized
        frame.setSize(600, 600); // sets the x-dimension, and y-dimension of the frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("./source/logo.png"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame

        // CHANGE BACKGOROUNF COLOR 
        // METHOD 1 
        //frame.getContentPane().setBackground(Color.gray); // change color of background

        // METHOD 2
        //frame.getContentPane().setBackground(new Color(50,120,240)); // change color of background

        // METHOD 3
        frame.getContentPane().setBackground(new Color(0x123456)); // change color of background

        */

        MyFrame myFrame = new MyFrame();
    }    
}