package swing_first;

import javax.swing.*;

public class SwingFirstExample {

    public static void main(String[] args) {
        
        // Create an instance of JFrame
        JFrame frame = new JFrame("Button Pusher");
        
        // Buttons
        
        // Create instance of JButton
        JButton button = new JButton("Click");
        
        // x, y axis, width, height
        button.setBounds(90, 100, 100, 40);
        
        // Add button to JFrame
        frame.add(button);
        
        // Second button
        JButton button2 = new JButton("Hello!");
        button2.setBounds(200, 100, 100, 40);
        frame.add(button2);
        
        // width and height
        frame.setSize(400, 500);
        
        // Using no layout managers
        frame.setLayout(null);
        
        // Make the frame visible
        frame.setVisible(true);
        
    }

}
