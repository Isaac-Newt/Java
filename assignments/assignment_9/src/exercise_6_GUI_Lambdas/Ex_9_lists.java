package exercise_6_GUI_Lambdas;

import javax.swing.*;
import java.awt.event.*;

public class Ex_9_lists {
	
	public Ex_9_lists() {
		JFrame frame = new JFrame("Lists Example");
		
		final JLabel label = new JLabel();
		label.setBounds(50, 20, 300, 30);
		
		final JLabel label2 = new JLabel();
		label2.setBounds(50, 50, 300, 30);
		
		JButton button = new JButton("Show");
		button.setBounds(200, 150, 80, 30);
		
		final DefaultListModel<String> list1 = new DefaultListModel<>();
		list1.addElement("C");
		list1.addElement("C++");
		list1.addElement("Java");
		list1.addElement("PHP");
		
		final JList<String> list2 = new JList<>(list1);
		list2.setBounds(100, 100, 75, 75);
		
		final DefaultListModel<String> list3 = new DefaultListModel<>();
		list3.addElement("Turbo C++");
		list3.addElement("Struts");
		list3.addElement("Spring");
		list3.addElement("Yll");
		
		final JList<String> list4 = new JList<>(list3);
		list4.setBounds(100, 200, 75, 75);
		
		button.addActionListener(
			action -> {
				String data = "";
				String framework = "";
				
				if (list2.getSelectedIndex() != -1) {
					data = "Programming language selected: " + list2.getSelectedValue();
					label.setText(data);
				}
				label.setText(data);
				
				if (list4.getSelectedIndex() != -1) {
					framework = "Framework selected: " + list4.getSelectedValue();
					label.setText(framework);
				}
				label.setText(data);
				label2.setText(framework);
			}
		);
		
		frame.add(list2);
		frame.add(button);
		frame.add(label);
		frame.add(list4);
		frame.add(label2);
		frame.setSize(450, 450);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex_9_lists();
	}

}
