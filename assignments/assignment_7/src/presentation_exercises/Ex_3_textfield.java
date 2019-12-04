package presentation_exercises;

import java.awt.event.*;

import javax.swing.*;

/*
  Continue with ExampleTextField2 lecture code. 
  Create Button3 with Text “/” and Button4 with Text “*”. 
  When user click Button3 it should change apply division on TextField1 and TexteField2 values and show result in TextField3
  When user click Button4 it should change apply multiplication on TextField1 and TexteField2 values and show result in TextField3
 */

public class Ex_3_textfield implements ActionListener {
	
	JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4;
    
    Ex_3_textfield() {
      
        JFrame f= new JFrame();  
        
        tf1 = new JTextField();  
        tf1.setBounds(50,50,150,20);  
        
        tf2 = new JTextField();  
        tf2.setBounds(50,100,150,20);  
        
        tf3 = new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        
        b1 = new JButton("+");  
        b1.setBounds(50,200,50,50);  
        
        b2 = new JButton("-");  
        b2.setBounds(50,300,50,50);
        
        b3 = new JButton("/");  
        b3.setBounds(120,200,50,50);
        
        b4 = new JButton("*");  
        b4.setBounds(120,300,50,50);
        
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.setSize(300,400);  
        f.setLayout(null);  
        f.setVisible(true); 
         
    }

	@Override
	public void actionPerformed(ActionEvent event) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        
        if(event.getSource() == b1) {
			c = a + b;
		}
    	else if (event.getSource() == b2) {
    		c = a - b;
    	}
    	else if (event.getSource() == b3) {
    		c = a / b;
    	}
    	else if (event.getSource() == b4) {
    		c = a * b;
    	}
    	
        String result = String.valueOf(c);
        tf3.setText(result);
	}

	public static void main(String[] args) {
		new Ex_3_textfield();
	}
	
}
