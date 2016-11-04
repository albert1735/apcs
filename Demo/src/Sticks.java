import java.util.Scanner;

public class Sticks 
{
	static int counter = 21;
	static Scanner kb = new Scanner(System.in);
	static int stick1 = kb.nextInt();
	static int counterOne = 21 - stick1;
	static int counterTwo = counterOne - stick1;
	
	public static void main(String [] args)
	{
		
		System.out.println("Player 1, enter your name.");
		String name1 = kb.next();
		System.out.println("Player 2, please enter your name.");
		String name2 = kb.next();
		while(counter > 0)
		{
			System.out.println(name1 + ", how many sticks do you like to take off?");
			int stick1 = kb.nextInt();
			if (stick1 == 1)
			{
				System.out.println("You have " + counterOne + " sticks remaining.");
			}
			else if (stick1 == 2)
			{
				System.out.println("You have " + counterOne + " sticks remaining.");
			}
			System.out.println(name2 + ", how many sticks do you like to take off?");
			int sticks1 = kb.nextInt();
			if(sticks1 == 1)
			{
				System.out.println("You have " + counterTwo + " sticks remaining.");
			}
			else if(sticks1 == 2 )
			{
				System.out.println("You have " + counterTwo + " sticks remaining.");
			}
		}
	}
}
