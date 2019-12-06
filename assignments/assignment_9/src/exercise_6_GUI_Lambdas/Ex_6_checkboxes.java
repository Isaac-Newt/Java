package exercise_6_GUI_Lambdas;

import javax.swing.*;
import java.awt.event.*;

public class Ex_6_checkboxes {
	
	Ex_6_checkboxes() {
		JFrame frame = new JFrame("Checkbox Example");
		
		JCheckBox pizzabox = new JCheckBox("Pizza @ 100");
		JCheckBox burgerbox = new JCheckBox("Burger @ 30");
		JCheckBox teabox = new JCheckBox("Tea @ 10");
		pizzabox.setBounds(50, 50, 150, 50);
		burgerbox.setBounds(50, 100, 150, 50);
		teabox.setBounds(50, 150, 150, 50);
		
		JButton order = new JButton("Order");
		order.setBounds(100, 200, 150, 50);
		
		// Use lambda function
		order.addActionListener(
			action -> {
				String message = "";
				double total = 0.0;
				
				if (pizzabox.isSelected()) {
					message = message + "Pizza: 100\n";
					total = total + 100;
				}
				
				if (burgerbox.isSelected()) {
					message = message + "Burger: 30\n";
					total = total + 30;
				}
				
				if (teabox.isSelected()) {
					message = message + "Tea: 10\n";
					total = total + 10;
				}
				message = message + "------------\n";
				message = message + "Total: " + total;
				
				JOptionPane.showMessageDialog(null, message);
			}
		);
		
		frame.add(pizzabox);
		frame.add(burgerbox);
		frame.add(teabox);
		frame.add(order);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex_6_checkboxes();
	}

}
