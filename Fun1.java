import javax.swing.*;

public class Fun1
{
	static void info(int  rollno,String  name)
	{
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String args[])
	{
		int roll;
		String name;
		roll= Integer.parseInt(JOptionPane.showInputDialog("Enter a roll no. : "));
		name= JOptionPane.showInputDialog("Enter a name: ");
		info(roll,name);
	}
}