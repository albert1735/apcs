package Loops;

import java.util.Scanner;

public class LeapYearDriver 
{
	public static void main(String [] args) 
	{
		
			boolean run = true;
			LeapYearClass object = new LeapYearClass();
			while(run==true)
			{
				object.AskYear();
				Scanner kb = new Scanner(System.in);
				System.out.println("Would you like to run it again?");
				String again = kb.next();
				if (again.equalsIgnoreCase("yes"))
					run = true;
				else
					run = false;
			}
			
			
		
		
	}
}
