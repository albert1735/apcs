package Loops;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MathClass 
{
	int number;
	int count2 = 0;
	int counter1;
	public void Getnumber()
	{
		String temp1 = JOptionPane.showInputDialog("Enter a number to check prime.");
		int numOne = Integer.parseInt(temp1);
		// check if the number is divisible by other numbers.
		if (numOne < 0 || numOne ==0 || numOne == 1)
		{
			JOptionPane.showMessageDialog(null,"This is neither prime nor composite!");
		}
		else
		{
			for (i = 2; i <= numOne - 1 ; i++ )
			{
				if (numOne % i == 0)
				{ 
				 counter1++;
				}
				
			}
			if (counter1 > 0)
			{
				JOptionPane.showMessageDialog(null,"This is a composite number.");	
			}
			else if (counter1 == 0)
			{
				JOptionPane.showMessageDialog(null, "This is a prime number.");
			}
			}
	}
	
	public void SetPrimeFactorization()
	{
		String num =JOptionPane.showInputDialog("What is the number?");
		number = Integer.parseInt(num);
		String facts ="The prime factors are ";
		for(int i=2 ; i<=(number); i++)
		{
			while(number%i == 0)
			{
				facts = facts + "*" + i;
				number = number/i;
			}
		}JOptionPane.showMessageDialog(null, facts);
	}
	
	int i, hcf =0;
	public void findGCF()
	{
		String num1 = JOptionPane.showInputDialog("What is the first number?");
		String num2 = JOptionPane.showInputDialog("What is the second number?");
		int fnum = Integer.parseInt(num1);
		int snum = Integer.parseInt(num2);
		for (i=1; i<=fnum || i <= snum; i++)
		{
			if (fnum%i ==0 && snum%i==0)
			{
				hcf =i;
			}
		}
		JOptionPane.showMessageDialog(null,"The GCF of " + num1 + " and " + num2 + " is " + hcf);
	}
	
	int counter;
	public void factor()
	{
		String temp1 = JOptionPane.showInputDialog("Enter a number you would like to factor.");
		int numOne = Integer.parseInt(temp1);
		if (numOne == 0 || numOne < 0)
		{
			JOptionPane.showMessageDialog(null,"This number can not be positively factored!");
		}
		else
		{
			for (i = 1; i <= numOne; i++)
			{
				int factorcalc = (int)numOne / i;
				int remainder = (int)numOne % i;
				if (remainder == 0)
				{
				 JOptionPane.showMessageDialog(null,factorcalc + " is a factor of " + numOne);
				}
			}
		}
	}

public void getTwinPrimes() 
{
	String primeNo = "";
	int j = 0;
	int LastPrime = 1;
	String temp1 = JOptionPane.showInputDialog("What is the starting number?");
	String temp2 = JOptionPane.showInputDialog("What is the ending number?");
	int numberOne = Integer.parseInt(temp1);
	int numberTwo = Integer.parseInt(temp2);
	JOptionPane.showMessageDialog(null, "Twin Primes are:");
	for (int i = numberOne; i <= numberTwo; i++)
	{
		for (j = 2; j < i; j++)
		{
		   if (i % j == 0) 
		   {
		   break;
		   }
		}
		if (i == j)
		{
		   primeNo += i + " ";
		   if ((i - LastPrime) == 2) 
		   {
		  JOptionPane.showMessageDialog(null,"("+(i-2)+","+i+")" );
		   }
		   LastPrime = i;
		}
	}
  }
	
}

