package interactive_buttons;

import java.awt.event.*;
import javax.swing.*;

public class ButtonInteractiveTwo {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click me!");
        button.setBounds(50, 100, 95, 30);
        
        // Use anonymous inner class
        button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
                button.setText("Thanks! :)");
            }
            
        });
        
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
