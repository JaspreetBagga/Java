// Dispaly count of even digit
import javax.swing.*;

public class Assign3
{
	public static void main(String args[])
	{
		int a;
		int rem,count=0;
		a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));
		while(a>0)
		{
			rem=a%10;
			a/=10;
			if(rem%2==0)
				count++;	 	
		}
		System.out.println(count);
			
	}
}