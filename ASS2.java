//import javax.swing.*;

public class ASS2
{
	public static void main(String args[])
	{
		int result=Integer.parseInt(args[0]);		
		for(String a : args)
		{
			
			int b = Integer.parseInt(a);
			
			if(result<b)
			{
				result=b;
			}
			
		}
		System.out.println(result);
	}
}