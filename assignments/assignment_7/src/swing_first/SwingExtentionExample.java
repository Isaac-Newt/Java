package swing_first;

import javax.swing.*;

/*
 * This example extends the JFrame object, which allows
 * the construction of the frame to be done without
 * explicitly calling the JFrame object's methods, as
 * was done in the previous examples
 */

public class SwingExtentionExample extends JFrame {
    
    JFrame f;

    public SwingExtentionExample() {

        JButton button = new JButton("Click me!");
        button.setBounds(130, 100, 100, 40);
        add(button);
        
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        
        new SwingExtentionExample();

    }

}
