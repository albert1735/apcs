package Loops;

import javax.swing.JOptionPane;

public class MathClassDriver 
{
	public static void main(String [] args)
	{
		MathClass obj = new MathClass();
		boolean run = true; 
		String choice = JOptionPane.showInputDialog("1] Prime \n 2] Prime Factorization \n 3] GCF \n 4] Factor \n 5] Twin Prime \n 6] Exit ");
if (run==true)
{
	if (choice.equals("1"))
	{
		obj.Getnumber();
	}
	else if (choice.equals("2"))
	{
		obj.SetPrimeFactorization();
	}
	else if (choice.equals("3"))
		{
		obj.findGCF();
		}
	else if (choice.equals("4"))
	{
		obj.factor();
	}
	else if (choice.equals("5"))
	{
		obj.getTwinPrimes();
	}
	else if (choice.equals("6"))
	{
		run = false;
	}
	}  
	}
}
