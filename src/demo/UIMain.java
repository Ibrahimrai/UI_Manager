package demo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UIMain {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Simple UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Set a custom font
        Font font = new Font("Arial", Font.PLAIN, 16);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Set font for buttons
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);

        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 1 clicked!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 2 clicked!");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 3 clicked!");
            }
        });

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set frame visibility
        frame.setVisible(true);
    }
}
