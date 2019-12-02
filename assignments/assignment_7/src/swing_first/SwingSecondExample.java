package swing_first;

import javax.swing.*;

/*
 * This example builds the frame within the constructor,
 * rather than in the main() function as in the first ex
 */

public class SwingSecondExample {
    
    // Frame as a data member of this class
    JFrame frame;
    
    public SwingSecondExample() {
        
        // Define an instance of JFrame
        this.frame = new JFrame("Button Pusher");
        
        // Button
        JButton button = new JButton("Hello!");
        button.setBounds(200, 100, 100, 40);
        frame.add(button);
        
        // Frame Setup
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        
        new SwingSecondExample();
        
    }

}
