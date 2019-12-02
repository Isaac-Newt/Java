package text_labels;

import javax.swing.*;
import java.awt.event.*;

public class PasswordExample {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Login");
        
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        
        final JPasswordField password = new JPasswordField();
        password.setBounds(100, 755, 100, 30);
        
        JLabel label1 = new JLabel("Username: ");
        label1.setBounds(20, 75, 80, 30);
        
        JLabel label2 = new JLabel("Password: ");
        label2.setBounds(20, 75, 80, 30);
        
        JButton button = new JButton("Login");
        button.setBounds(100, 120, 80, 30);
        
        final JTextField username = new JTextField();
        username.setBounds(100, 20, 100, 30);
        
        frame.add(label);
        frame.add(password);
        frame.add(label1);
        frame.add(label2);
        frame.add(username);
        
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) {
                String user = username.getText();
                String pass = new String(password.getPassword());
                
                if (user.equals("isaac") && pass.equals("isaaclist")) {
                    label.setText("Successful login!");
                }
                
                else {
                    label.setText("Incorrect login :(");
                }
            }
            
        });

    }

}
