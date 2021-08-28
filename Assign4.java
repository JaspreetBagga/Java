// accept 5 numbers and check all digits of a number is unique or not
import javax.swing.*;

public class Assign4
{
	public static void main(String args[])
	{
 
		int rem1,rem2;
		int a,i,count=0;
		int ucount=0;
		for(i=0;i<5;i++)
		{
			a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));
			int temp=a;
			one:
			while(a>0)
			{
				rem1=a%10;
				temp=a/10;
				while(temp>0)
				{
					rem2=temp%10;
					if(rem1==rem2)
					{
						count=0;
						break one;		
					}
					else 
						count =1;
					temp/=10;
				}
				a/=10;	
			}
			if(count==1)
			{
				ucount++;
			}
		}
			System.out.println(ucount);	
	}
}