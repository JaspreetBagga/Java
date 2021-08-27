//Accept 2 integers and display their sum and difference

import javax.swing.*;
public class Basics3
{
	public static void main(String [] args)
	{
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		int sum= a+b;
		int diff=a-b;
		System.out.println("Sum is :"+sum);
		System.out.println("Difference is : "+ diff);
		
	}
}
