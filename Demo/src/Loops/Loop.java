package Loops;

import java.util.Scanner;

public class Loop 
{
	static String counter;
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a number you would like to find the factor of?");
		double numOne = kb.nextDouble();
		for (int m = 1; m <= 1000; m++)
		{
			int calc = (int)(m / numOne);
			int calc1 = (int)(m % numOne);
			if (calc1 == 0)
			{
			counter = counter +" "+ m;
			}
		}
		System.out.println(counter);
	}
}
