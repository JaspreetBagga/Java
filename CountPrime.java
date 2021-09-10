import javax.swing.*;
public class CountPrime
{
	static int countPrime(int start , int end)
	{
		int i,count=0;
		boolean flag=true;
		for(i=start;i<end;i++)
		{
			
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
				else 
					flag=true;
			}
			if(i==1)
			{
				continue;
			}
			else if(flag==true)
				count++;
			
		}	
		return count;
	}
	public static void main(String args[])
	{
		int st,end;
		st=Integer.parseInt(JOptionPane.showInputDialog("Enter starting range: "));
		end=Integer.parseInt(JOptionPane.showInputDialog("Enter the ending range : "));
		int count = countPrime(st,end);
		System.out.println("Count of prime number is : " +count);
	
	}
}