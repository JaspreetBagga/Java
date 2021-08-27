/* Accepting 2 integers form user and printing their sum */
import javax.swing.*;

public class Assign1
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("Enter first number : "));
		b=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
		int result = a+b;
		System.out.println("First number entered is : " + a);
		System.out.println("Second number entered is : " + b);
		System.out.println("Sum of above two number is : " + result);
	}
}