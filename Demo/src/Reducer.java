import java.util.Scanner;

public class Reducer 
{
	
	static int counter = 1;
	
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		boolean go = true;
		do
		{
			firstLetter();
			System.out.println("Would you like to go again? (true/false)");
			go = kb.nextBoolean();
		}while(go==true);	
		while(go == false)
		{
			reduceWord();
		}
	
	}
	
	static public void reduceWord()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter in a new word.");
		String word = kb.next();
		String newWord= word.substring(1,5);
		System.out.println("Counter is " + counter + ":" + newWord);
		counter = counter + 1 ;
	}
	
	static public void firstLetter()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a team (that is not a real sport)");
		String team = kb.next();
		//charAt is a method java build.
		char letter = team.charAt(0);
		System.out.println(team + ", the first letter is " + letter);
	}

}
