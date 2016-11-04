package Loops;

import java.util.Scanner;

public class OptionDriver 
{
	public static void main (String [] args)
	{
		boolean run = true;
		OptionClass object = new OptionClass();
		while(run==true)
		{
			object.setName();
			object.findAverage();
			Scanner kb = new Scanner(System.in);
			System.out.println("Would you like to run again?");
			String word = kb.next();
			if(word.equalsIgnoreCase("yes"))
				run = true;
			else 
				run = false;
			
		}
	}
}
