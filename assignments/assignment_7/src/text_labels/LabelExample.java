package text_labels;

import javax.swing.*;

public class LabelExample {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Labels");
        
        JLabel label = new JLabel("This is a label!");
        frame.add(label);
        
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

}
