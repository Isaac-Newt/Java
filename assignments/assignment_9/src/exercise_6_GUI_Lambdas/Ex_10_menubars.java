package exercise_6_GUI_Lambdas;

import javax.swing.*;
import java.awt.event.*;

public class Ex_10_menubars {
	
	JMenu menu, submenu;
	JMenuItem File, Edit, Copy, Paste, Help;
	
	public Ex_10_menubars() {
		JFrame frame = new JFrame("Menubar Example");
		
		JMenuBar bar = new JMenuBar();
		
		menu = new JMenu("Menu");
		submenu = new JMenu("Submenu");
		
		File = new JMenuItem("File");
		Edit = new JMenuItem("Edit");
		Copy = new JMenuItem("Copy");
		Paste = new JMenuItem("Paste");
		Help = new JMenuItem("Help");
		
		File.addActionListener(
			action -> {
				JOptionPane.showMessageDialog(null, "File is selected");
			}
		);
		
		Edit.addActionListener(
			action -> {
				JOptionPane.showMessageDialog(null, "Edit is selected");
			}
		);
		
		Copy.addActionListener(
			action -> {
				JOptionPane.showMessageDialog(null, "Copy is selected");
			}
		);
		
		Paste.addActionListener(
			action -> {
				JOptionPane.showMessageDialog(null, "Paste is selected");
			}
		);
		
		Help.addActionListener(
			action -> {
				JOptionPane.showMessageDialog(null, "Help is selected");
			}
		);
		
		menu.add(File);
		menu.add(Edit);
		menu.add(Help);
		
		submenu.add(Copy);
		submenu.add(Paste);
		menu.add(submenu);
		
		bar.add(menu);
		
		frame.setJMenuBar(bar);
		
		frame.setSize(200, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex_10_menubars();
	}

}
