package Loops;

import java.util.Scanner;

public class ForLoop 
{
	public void forLoop()
	{//inside the for loop, where do I want to start, what is the increment, and where do I end this/
		for(int i = 1; i<= 5000; i= i+1)
		{
			System.out.println("Albert is a genius." + i );
		}
		
	}
public void flipCoin()
{
	int headcounter = 1;
	int tailcounter = 1;
	for ( int counter = 0; counter <= 4; counter = counter + 1)
	{
		int number1 = (int)(Math.random()*10 + 1);
		if (number1 < 5)
		{
			headcounter++;
		}
		else 
		{
			tailcounter++;
		}
		

	}
	System.out.println("Heads " + headcounter+ " Tail " + tailcounter);
} 




public void checkWord()
{
	String word = "as";
	Scanner kb = new Scanner (System.in);
		System.out.println("Enter a word.");
		String typeWord = kb.next();
		if (typeWord.contains(word))
		{
			System.out.println("The word " + word + " contains as.");
		}
		else 
		{
			System.out.println("The word " + word + " does not contain as.");
		}
}

}




