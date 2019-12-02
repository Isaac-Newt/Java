package text_labels;

import javax.swing.*;

public class TextAreaExample {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        JTextArea area = new JTextArea("Default text to appear");
        area.setBounds(50, 100, 200, 200);
        frame.add(area);
        
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }

}
