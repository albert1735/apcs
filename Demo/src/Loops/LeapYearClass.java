package Loops;

import javax.swing.JOptionPane;

public class LeapYearClass
	{
	 public void AskYear()
	 {
		 //Int x = Integer.parseInt(JOptionPane.showInputDialog("number shit");
		String year = JOptionPane.showInputDialog("What year do you like to check?");
		int numYear = Integer.parseInt(year);
		if(numYear % 100 == 0 && numYear % 400 != 0)
		{
			JOptionPane.showMessageDialog(null, "This is not a leap year!");	
		}
		else if (numYear % 4 == 0)
		{
			JOptionPane.showMessageDialog(null, "This is a leap year.");
		}
		else if(numYear == 0)
		{
			JOptionPane.showMessageDialog(null,"This is not a leap year!");
		}
		else if (numYear <= 0)
		{
			JOptionPane.showMessageDialog(null,"BC years do not count!");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "This is not a leap year.");
		}
		
	 }
	
	
}
