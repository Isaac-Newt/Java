package presentation_exercises;

import javax.swing.*;
import java.awt.event.*;

public class Ex_7_radiobuttons {

	public Ex_7_radiobuttons() {
		JFrame frame = new JFrame("Radio Button Example");
		
		JRadioButton pizzabox = new JRadioButton("Pizza @ 100");
		JRadioButton burgerbox = new JRadioButton("Burger @ 30");
		JRadioButton teabox = new JRadioButton("Tea @ 10");
		pizzabox.setBounds(50, 50, 150, 50);
		burgerbox.setBounds(50, 100, 150, 50);
		teabox.setBounds(50, 150, 150, 50);
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzabox);
		group.add(burgerbox);
		group.add(teabox);
		
		JButton order = new JButton("Order");
		order.setBounds(100, 200, 150, 50);
		
		// Use anonymous inner class to create an actionlistener
		order.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String message = "";
				
				if (pizzabox.isSelected()) {
					message = "Pizza: 100";
				}
				
				if (burgerbox.isSelected()) {
					message = "Burger: 30";
				}
				
				if (teabox.isSelected()) {
					message = "Tea: 10";
				}
				
				JOptionPane.showMessageDialog(null, message);
			}
		});
		
		frame.add(pizzabox);
		frame.add(burgerbox);
		frame.add(teabox);
		frame.add(order);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex_7_radiobuttons();
	}
	
}
