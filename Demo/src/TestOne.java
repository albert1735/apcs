import java.util.Scanner;

public class TestOne 
{
	public static void main(String [] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();

	if (name.equals("Ethan"))
	{
	System.out.println("That is a popular name.");
	}
	else 
	{
	System.out.println("That is a nice name.");
	}

	System.out.println("What is your age?");
	int age = kb.nextInt();

	if (age < 0)
	{
		System.out.println("You did not follow the instruction!");
	}
	else if (age < 18)
	{
		System.out.println("You must be in school!");
	}
	else if (age == 18);
	{
		System.out.println("You are 18. ");
	}
	
	else 
	{
		System.out.println("You must be at work.");
	}
	}
	
}
