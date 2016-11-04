package Loops;

import javax.swing.JOptionPane;

public class OptionClass 
{
	public void setName()
	{
		String name = JOptionPane.showInputDialog("What is your last name?");
		if (name.equalsIgnoreCase("Willis"))
		{
			JOptionPane.showMessageDialog(null, "Please clean out your gun!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Go get a gun!");
		}
	}
	public void findAverage()
	{
		String temp1 = JOptionPane.showInputDialog("How many cats do you own?");
		int cat1 = Integer.parseInt(temp1);
		String temp2 = JOptionPane.showInputDialog(null, "How many cats do you own?");
		int cat2 = Integer.parseInt(temp2);
		double average = (cat1 + cat2)/ 2.0;
		JOptionPane.showMessageDialog(null, "The\n average\n cats\n owned\n by\n these\n crazy\n cat\n owning\n cat\n people\n is\n the\n crazy\n amount\n of\n " + average);
		
	}
}
