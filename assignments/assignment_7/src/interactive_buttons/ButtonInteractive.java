package interactive_buttons;

import java.awt.event.*;
import javax.swing.*;

/*
 * This example uses an ActionListener to provide interactivity
 * to a button click. This is accomplished through the use of an
 * anonymous class to implement the interface ActionListener()
 */

public class ButtonInteractive {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click me!");
        button.setBounds(50, 100, 95, 30);
        
        // Use anonymous inner class
        button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
            
        });
        
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
