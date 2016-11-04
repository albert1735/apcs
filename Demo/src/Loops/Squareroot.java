package Loops;

import java.util.Scanner;

public class Squareroot 
{
	public void squareRoot()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the number you want to square root?");
		double squareR = kb.nextDouble();
		System.out.println("What is your initial guess?");
		double initial = kb.nextDouble();
		System.out.println("How many times would you like to loop?");
		double counter = kb.nextDouble();
		for ( int i = 1; i<=counter; i = i + 1)
		{
			double r = squareR / initial;
			initial = (initial + r)/2;
			System.out.println("The squareroot is " + initial);
		}
		}
		
	}


