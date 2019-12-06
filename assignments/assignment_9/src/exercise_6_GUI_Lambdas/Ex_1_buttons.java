package exercise_6_GUI_Lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/* 
  Create an application with two buttons and one text field. 
  Create Button1 with Text “Submit” and Button2 with Text “Reset”. 
  When user click Button1 it should display Dialogue box ”Information is submitted successfully”.
  When user click Button2 it should make TextField text=“” or blank
 */

public class Ex_1_buttons {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Exercise 1");
		
		JButton button1 = new JButton("Submit");
		JButton button2 = new JButton("Reset");
		button1.setBounds(90, 100, 150, 40);
		button2.setBounds(260, 100, 150, 40);
		frame.add(button1);
		frame.add(button2);
		
		JTextField textfield = new JTextField();
		textfield.setBounds(120, 200, 250, 40);
		frame.add(textfield);
		
		// Use anonymous inner class
        button1.addActionListener(
        	showMessage -> {
        		JOptionPane.showMessageDialog(null, "Information is submitted successfully");
        	}
        );
        
        // Use anonymous inner class
        button2.addActionListener(
        	reset -> { textfield.setText(""); }
        );
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
}