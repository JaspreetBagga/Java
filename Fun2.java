// print max digit from a number eg- 1045437 answer is 7
import javax.swing.*;
public class Fun2
{
	static int maxDigit(int num)
	{
		int temp,max,temp2;
		if(num==0)
			return 0;
		temp=num%10;
		temp2=maxDigit(num/10);
		max=temp;
		if(temp<temp2)
			max=temp2;
		return max;	
		
	}	

	public static void main(String args[])
	{
		int num,max;
		num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));
		max = maxDigit(num);
		System.out.println("Max Digit is : "+ max);	
	}
}