package presentation_exercises;

import javax.swing.*;
import java.awt.event.*;

/*
  Continue with PasswordFieldExample2 lecture code. 
  Display message as label value “Log in successfully” if username=“Daniel” and password=“oop”.
  Else display “Log in failed because of incorrect information”
 */

public class Ex_5_passwordfield {
	
	public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");

        final JLabel label = new JLabel();
        label.setBounds(20, 150, 300, 50);

        final JPasswordField value = new JPasswordField();
        value.setBounds(100,75,100,30);

        JLabel l1=new JLabel("Username:");
        l1.setBounds(20,20, 80,30);

        JLabel l2=new JLabel("Password:");
        l2.setBounds(20,75, 80,30);

        JButton b = new JButton("Login");
        b.setBounds(100,120, 80,30);

        final JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);

        f.add(value);
        f.add(l1); 
        f.add(label);
        f.add(l2);
        f.add(b);
        f.add(text);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message;
                String username = text.getText();
                String password = new String(value.getPassword());
                
                if (username.equals("Daniel") && password.equals("oop")) {
                	message = "Login Successful";
                }
                else {
                	message = "Log in failed because of incorrect information";
                }
                
                label.setText(message);
            }
        });

    }

}
