package exercise_6_GUI_Lambdas;

import javax.swing.*;
import java.awt.event.*;

public class Ex_8_combobox {
	
	public Ex_8_combobox() {
		JFrame frame = new JFrame("Combobox Example");
		
		JLabel label = new JLabel("Programming language selected: ");
		label.setBounds(50, 50, 300, 50);
		JLabel vlabel = new JLabel();
		vlabel.setBounds(350, 50, 50, 50);
		frame.add(vlabel);
		frame.add(label);
		
		String language[] = {"C", "C++", "C#", "Java", "PHP"};
		JComboBox cbox = new JComboBox(language);
		cbox.setBounds(50, 150, 200, 50);
		frame.add(cbox);
		
		JButton button = new JButton("Show");
		button.setBounds(270, 150, 80, 30);
		
		// Anonymous inner class to add action listener
		button.addActionListener(
			action -> {
				String selected = (String) cbox.getSelectedItem();
				vlabel.setText(selected);
			}
		);
		
		frame.add(button);
		
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex_8_combobox();
	}

}
