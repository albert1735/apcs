package Loops;

import java.util.Scanner;

public class MoneySpitter 
{
	public void moneycountdown()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an amount to the hundredth place.");
		double initial = kb.nextDouble();
		int quarter = (int)(initial / 0.25);
		double quarterR = (initial % 0.25);
		int dime = (int)(quarterR / 0.10);
		double dimeR = (quarterR % 0.10);
		int nickel = (int)(dimeR / 0.05);
		double nickelR = (dimeR % 0.05);
		int penny =  (int)Math.ceil(nickelR / 0.01);
		System.out.println("The value of quarter is " + quarter + ", dime is " + dime + ", nickel is " + nickel + " and penny is " + penny);
		
	}
}
