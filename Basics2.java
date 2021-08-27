//Accept a name from user and display Welcome message accordingly .
import javax.swing.*;

public class Basics2
{
	public static void main(String args[])
	{
		String name;
		name = JOptionPane.showInputDialog("Enter your name : ");
		System.out.println("Welcome "+ name);
	}
}