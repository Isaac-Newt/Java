package text_labels;

import javax.swing.*;

public class TextFieldExample {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Labels");
        
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 100, 20);
        frame.add(textField);
        
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

}
