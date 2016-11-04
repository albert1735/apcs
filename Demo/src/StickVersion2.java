import java.util.Scanner;

public class StickVersion2 
{
	static int counter = 21;
	
	public static void main(String [] args) throws InterruptedException 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the game Sticks!");
		Thread.sleep(1500);
		System.out.println("Player 1, What is your name?");
		String name1 = kb.next();
		System.out.println("Player 2, what is your name?");
		String name2 = kb.next();
		System.out.println(name1 + ", head or tail?");
		String chance = kb.next();
		int x = (int)(Math.random()*10+1);
		Thread.sleep(400);
		System.out.println("You will have 21 sticks to take away from. Last person who takes away the stick loses!");
	
		int name1Turn = 1;
		int name2Turn = 2;
		
		if (x<=5)
		{
			System.out.println(name2 + " goes first.");
			name1Turn = 1;
		}
		else 
		{
			System.out.println(name1 + " goes first.");
			name2Turn = 2;
		}
		
		while (name1Turn == 1)
		{
			System.out.println(name1 + ", enter your move. Subtract 1 or 2.");
			int move1 = kb.nextInt();
		
			if (move1 ==1 || move1 ==2)
			{
				counter = counter - move1;
				System.out.println(counter);
				
			}
			else
			{
				System.out.println("You have violated the instruction. Please try again!");
				Thread.sleep(1500);
			}
			
			if (counter > 0)
			{
				System.out.println(name2 + ", enter your move. Subtract 1 or 2.");
			    move1 = kb.nextInt();
			    counter = counter - move1;
			    System.out.println(counter);
			    
			}
			else if (move1 != 1 && move1 != 2)
			{
				System.out.println("You have violated the instruction. Please try again!");
				Thread.sleep(1500);
			}
			else
			{
				System.out.println("This is the end of the game.");
			}
		
		}	
			while (name2Turn == 2)
			{
				System.out.println(name2 + ", enter your move. Subtract 1 or 2.");
			   int move1 = kb.nextInt();
				if (move1 ==1 || move1 ==2)
				{
					counter = counter - move1;
					System.out.println(counter);
				
				}
				else 
				{
					System.out.println("You have violated the instruction. Please try again!");
					Thread.sleep(1500);
				}
				if (move1 ==1 || move1 ==2)
				{
					System.out.println(name1 + ", enter your move. Subtract 1 or 2.");
				    move1 = kb.nextInt();
				    counter = counter - move1;
				    System.out.println(counter);
				  
				}
				else if (move1 != 1 && move1 != 2)
				{
					System.out.println("You have violated the instruction. Please try again!");
					Thread.sleep(1500);
				}
				else 
				{
					System.out.println("You have reached the end of this game.");
				}
				
			}
	}

	
	}


