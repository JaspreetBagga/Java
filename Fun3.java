//count of prime number between the given  range
import javax.swing.*;

public class Fun3
{
	static int countPrime(int starting,int ending)
	{
		int i,count=0,flag=0;
		for(i=starting ; i<ending ;i++)
		{
			for(int j=2;j<i;j++)
			{	
				if(i%j==0)
				{
					flag=0;	
					break;
				}
				else 
					flag=1;
			}	
			if(flag==1)
				count++;
		}	
		return count;
	}	
	public static void main(String args[])
	{
		int start,end;
		start= Integer.parseInt(JOptionPane.showInputDialog("Enter the start range : "));
		end= Integer.parseInt(JOptionPane.showInputDialog("Enter the end range : "));
		int count = countPrime(start,end);
		System.out.println("Count of Prime numbers between the range " + start +" to " + end +" is : "+ count);


	}
}