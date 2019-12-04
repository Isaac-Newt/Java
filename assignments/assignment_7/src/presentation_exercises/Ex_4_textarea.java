package presentation_exercises;

import javax.swing.*;
import java.awt.event.*;

/*
  Continue with TextAreaExmaple2 lecture code. 
  Create two uneditable TextFields with labels “Words” and “Characters”
  On Button click display # of words in textfield “Words” and #of characters in textfield “Characters”
 */

public class Ex_4_textarea implements ActionListener {
	
    JLabel l1,l2;
    JTextArea area;
    JButton b;

    Ex_4_textarea() {
        JFrame f = new JFrame();

        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);

        area = new JTextArea();
        area.setBounds(20,75,250,200);

        b = new JButton("Count Words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        String text = area.getText();
        String words[] = text.split("\\s");

        l1.setText("Words: " + words.length);
        l2.setText("Characters: " + text.length());
	}
	
	public static void main(String[] args) {
		new Ex_4_textarea();
	}

}
