import java.util.Scanner;

public class TEDDYLATE 
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		int number = kb.nextInt(); 
		if(number == 7)//Did the number typed in equal 7?
		{
			System.out.println("You've picked the most popular number.");
		}
		else if (number == 3)
		{
			System.out.println("You are a winter.");
		}
		else 
		{
			System.out.println("You've picked an unpopular number, loser.");
		}
		System.out.println("Is today even or odd?");
		String answer = kb.next();
		if(answer.equalsIgnoreCase("odd"))
		{
			System.out.println("Teddy you are late!");
		}
		else if (answer.equalsIgnoreCase("even"))
		{
			System.out.println("Teddy is on time!");
		}
		else
		{
			System.out.println("You did not enter even or odd.");
		}
	}

}

