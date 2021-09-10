import javax.swing.*;
public class Average
{
	static float average(int a, int b, int c)
	{
		float sum = 0f;
		sum = a+ b+ c;
		return sum/3;
	}
	public static void main(String args[])
	 {
		int x,y,z;
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter the number : "));
		y=Integer.parseInt(JOptionPane.showInputDialog("Enter the number : "));
		z=Integer.parseInt(JOptionPane.showInputDialog("Enter the number : "));
		System.out.println("Average is : "+average(x,y,z));
	}
}