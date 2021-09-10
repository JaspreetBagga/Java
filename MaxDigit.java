
import javax.swing.*;
public class MaxDigit
{
	static int maxDigit(int num)
	{
		int max = num%10;
		int temp = num/10;
		while(temp>0)
		{
			int rem = temp%10;
			temp/=10;
			if(rem>max)
				max=rem;
		}
		return max;
	}
	public static void main(String args[])
	{
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number : " ));
		System.out.println("Max Digit in the number is : " + maxDigit(a));	
	}
}