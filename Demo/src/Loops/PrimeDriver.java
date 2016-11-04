package Loops;

import javax.swing.JOptionPane;

public class PrimeDriver 
{
	public static void main(String [] args)
	{
		boolean answer = true;
		if(answer==true)
		{
			MathClass obj = new MathClass();
			String choice = JOptionPane.showInputDialog(" 1] Prime\n 2] GCF"
					+ "\n 3] Prime Factorization \n 4] Twin Primes \n 5] Factor \n 6] Exit");
			if (choice.equals("1"))
			{
				obj.PrimeNum();
			}
			else if (choice.equals("3"))
			{
				obj.SetPrimeFactorization();
			}
			else if (choice.equals("2"))
			{
				obj.findGCF();
			}
			else if (choice.equals("4"))
			{
				obj.getTwinPrimes();
			}
			else if(choice.equals("5"))
			{
			obj.findFactor();	
			}
			else if (choice.equals("6"))
			{
				answer=false;
			}

		}
		
				
	}
}
