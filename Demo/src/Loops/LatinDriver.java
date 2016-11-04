package Loops;

import java.util.Scanner;

public class LatinDriver 
{
	public static void main(String [] args)
	{
		boolean run = true;
		while (run == true)
		{
			Latin objectOne = new Latin();
			objectOne.latin();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to enter again? True or False");
		String again = kb.next();
		if (again.equalsIgnoreCase("False"))
		{
		 run = false;
		}
		}
	}
}
