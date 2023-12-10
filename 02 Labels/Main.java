import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("./source/logo.jpg");
        Border border = BorderFactory.createLineBorder(Color.white,2);

        JLabel label = new JLabel(); // create a label
        label.setText("Do you like to code with me? 👨‍💻😊"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER, BOTTO< of imageicon
        label.setForeground(Color.WHITE); // set font color of text
        label.setFont(new Font("Fira Code", Font.BOLD, 25)); // set font of text
        label.setIconTextGap(5); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // diplay background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setTitle("02 JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 600);
        //frame.setLayout(null);
        frame.setVisible(true);

        frame.add(label);
        frame.pack();
    }
}