import java.util.Scanner;

public class NumberGuessing 
{
	public static void main(String [] args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Guess a number between 1-20." );
		int number = kb.nextInt();
		int NUMBER = (int)(Math.random ()* 20 + 1);
		if(number < 1)
		{
			System.out.println("You did not follow the instruction." );
		}
		else if (number > 20)
		{
		System.out.println("You did not follow the instruction." );
		}
		
		else if (number == NUMBER)
		{
			System.out.println("CONGRADULATIONS! YOU WON THE LOTTERY.");
		}
		else 
		{
			System.out.println("Too bad so sad!");
		}
	}

	
	

}
