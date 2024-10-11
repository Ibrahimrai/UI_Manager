package demo;

import java.awt.*;
import javax.swing.*;

public class UIMain {
	JLabel label=new JLabel("Simple UI");
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JButton button1 = new JButton("Button");
        designUI(button1);

        frame.add(button1);
        frame.setVisible(true);
    }

    private static void designUI(JButton button) {
        Font font = new Font("Arial", Font.PLAIN, 28); 
        button.setFont(font);
        button.setBackground(Color.PINK.darker()); 
        button.setForeground(Color.BLACK); 
    }
}
