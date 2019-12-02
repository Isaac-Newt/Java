package text_labels;

import javax.swing.*;

// Need to update with info from TextFieldExample2.java from the notes

public class TextFieldInteractive {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Labels");
        
        JLabel label = new JLabel();
        frame.add(label);
        
        JButton button = new JButton("Click to show label");
        button.setBounds(200, 50, 100, 40);
        frame.add(button);
        
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 100, 20);
        frame.add(textField);
        
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

}
