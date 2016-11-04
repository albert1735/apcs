package Loops;

import java.util.Scanner;

public class Highest 
{
	int num1, num2, num3;
	int highest;
	public void setNumbers()
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("What are the three numbers? Enter in number 1.");
	num1 = kb.nextInt();
	System.out.println("What are the three numbers? Enter in number 2.");
	num2 = kb.nextInt();
	System.out.println("What are the three numbers? Enter in number 3.");
	num3 = kb.nextInt();
	}
	
	public void setHighest()
	{
		highest = num1;
		if (num2 > num1 && num2 > num3)
		{
				highest = num2;
		}
		if (num3 >num1 && num3 > num2)
		{
			highest = num3;
		}
	}
	public int getHighest()
	{
		return highest;
	}
}
