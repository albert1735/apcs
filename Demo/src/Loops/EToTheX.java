package Loops;

import java.util.Scanner;

public class EToTheX 
{
	int i;
	public void getX()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the x number you would like to input to the e?");
		
		System.out.println("How many iterations?");
		double x = kb.nextInt();
		for ( i = 1; i <= x; i++)
		{
			double power = i++;
			double fac = i++;
			double e = 1 + x + (x ^ power/ fac);
			System.out.println(e);
		}
		
	}
}
