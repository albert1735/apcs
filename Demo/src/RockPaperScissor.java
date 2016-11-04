import java.util.Scanner;

public class RockPaperScissor 
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Let's start the game! First off, what is your name?");
		String name1 = kb.next();
		System.out.println("What is your opponent's name?");
		String name2 = kb.next();
		int counter1 = 0, counter2 = 0;
		while (counter1 < 3 && counter2 < 3)
			{
			System.out.println(name1 + " Enter your move.");
			String move1 = kb.next();
			
			System.out.println(name2 + " Enter your move.");
			String move2 = kb.next();
		
		
			if (move1.equalsIgnoreCase("Rock") && move2.equalsIgnoreCase("Scissor"))
			{
				System.out.println(name1 + " is the winner!");
				counter1 = counter1 + 1; 
			}
			else if (move1.equalsIgnoreCase("Rock") && move2.equalsIgnoreCase("Paper"))
			{
				System.out.println(name2 + " is the winner!");
				 counter2 = counter2 + 1;
			}
			else if (move1.equalsIgnoreCase("Rock") && move2.equalsIgnoreCase("Rock"))
			{
				System.out.println("It is a tie! No one gets point!");
				
			}
			else if (move1.equalsIgnoreCase("Scissor") && move2.equalsIgnoreCase("Rock"))
			{
				System.out.println(name2 + " wins!");
				counter2 = counter2 + 1;
			}
			else if (move1.equalsIgnoreCase("Scissor") && move2.equalsIgnoreCase("Paper"))
			{
				System.out.println(name1 + " wins!");
				counter1 = counter1 + 1;
			}
			else if (move1.equalsIgnoreCase("Scissor") && move2.equalsIgnoreCase("Scissor"))
			{
				System.out.println("We have a tie! No one gets point!");
			}
			else if (move1.equalsIgnoreCase("Paper") && move2.equalsIgnoreCase("Scissor"))
			{
				System.out.println(name2 + " wins this round!");
				counter2 = counter2 + 1;
			}
			else if (move1.equalsIgnoreCase("Paper") && move2.equalsIgnoreCase("Rock"))
			{
				System.out.println(name1 + " wins this round!");
				counter1 = counter1 + 1;
			}
			else if (move1.equalsIgnoreCase("Paper") && move2.equalsIgnoreCase("Paper"))
			{
				System.out.println("This is another tie! No one gets point!");
			}	
		}
		
	}
		
		
	}


