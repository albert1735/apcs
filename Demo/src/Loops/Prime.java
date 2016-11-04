package Loops;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prime 
{
	int i;
	int counter;
	int number;
	public void Getnumber()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to check prime.");
		double numOne = kb.nextDouble();
		// check if the number is divisible by other numbers.
		if (numOne < 0 || numOne ==0 || numOne == 1)
		{
			System.out.println("This is neither prime nor composite!");
		}
		else
		{
			for (i = 2; i <= numOne - 1 ; i++ )
			{
				if (numOne % i == 0)
				{ 
				 counter++;
				}
				
			}
			if (counter > 0)
			{
				System.out.println("This is a composite number.");	
			}
			else if (counter == 0)
			{
				System.out.println("This is a prime number.");
			}
		
		}	
		}
		
	public void factor()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number you would like to factor.");
		int numOne = kb.nextInt();
		if (numOne == 0 || numOne < 0)
		{
			System.out.println("This number can not be positively factored!");
		}
		else
		{
			for (i = 1; i <= numOne; i++)
			{
				int factorcalc = (int)numOne / i;
				int remainder = (int)numOne % i;
				if (remainder == 0)
				{
				 System.out.println(factorcalc + " is a factor of " + numOne);
				}
				
			}
		}
	}
	public void GCF()
	{
		String temp1 = JOptionPane.showInputDialog("Enter the first number to check GCF.");
		String temp2 = JOptionPane.showInputDialog("Enter the second number to check GCF.");
		int numOne = Integer.parseInt(temp1);
		int numTwo = Integer.parseInt(temp2);
		int gcf = 1;
		for(i=1; i <= numOne && i <= numTwo; i++)
		{
			if(numOne%1==0 && numTwo%i==0)
				gcf=i;
		}
		JOptionPane.showMessageDialog(null,"The GCF between " + numOne + " and " + numTwo + " is " + gcf);
	}
}

