package presentation_exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/* 
  Create an application with two buttons and two text field labeled (Two labels) “Name” and “ID”. 
  Create Button1 with Text “Show name” and Button2 with Text “Show ID”. 
  When user click Button1 it should change Label “Name” to TextField1 value
  When user click Button2 it should change Label “ID” to TextField2 value
 */

public class Ex_2_buttons {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Exercise 1");
		
		JButton button1 = new JButton("Show Name");
		JButton button2 = new JButton("Show ID");
		button1.setBounds(90, 100, 150, 40);
		button2.setBounds(260, 100, 150, 40);
		frame.add(button1);
		frame.add(button2);
		
		JLabel namelabel = new JLabel("Name");
		JLabel idlabel = new JLabel("ID");
		namelabel.setBounds(100, 200, 75, 40);
		idlabel.setBounds(100, 300, 75, 40);
		frame.add(namelabel);
		frame.add(idlabel);
		
		JTextField namefield = new JTextField();
		JTextField idfield = new JTextField();
		namefield.setBounds(200, 200, 150, 40);
		idfield.setBounds(200, 300, 150, 40);
		frame.add(namefield);
		frame.add(idfield);
		
		// Use anonymous inner class
        button1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
                String name = namefield.getText();
                namelabel.setText(name);
            }
            
        });
        
        // Use anonymous inner class
        button2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
            	String id = idfield.getText();
            	idlabel.setText(id);
            }
            
        });
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
}
