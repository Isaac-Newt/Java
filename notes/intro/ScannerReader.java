package java_project_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// import javax.swing.JOptionPane;

public class ScannerReader 
{
	public static void main(String[] args) throws IOException 
	{
		//1st method to take input from user
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your name: ");
		System.out.println("you wrote: " + sc.nextLine());
		System.out.print("Type your age: ");
		System.out.println("your age: " + sc.nextInt());
		sc.close();  //don’t forget to close 
		*/
		//2nd method to take input from user
		/* 
		BufferedReader in = null;
		String input = null;
		in = new BufferedReader(new
  		InputStreamReader(System.in));
		System.out.print("Type your name: ");
		try {
			input = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("You wrote " + input);
		in.close();
		*/
		
		//3rd method to take input from user
		/*
		String input =JOptionPane.showInputDialog("Type your name");
		System.out.println("You wrote " + input);
		*/

		
	}
	
	
}
