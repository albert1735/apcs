import java.util.Scanner;

public class AgeAndBeer 
{ 
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		
	System.out.println("What is your name?");
	String name = kb.next();
	System.out.println("What is your age?");
	int age = kb.nextInt();
	if (age < 18)
	{
		System.out.println( name + ", you are a minor.");
	}
	else if (age < 21)
	{
		System.out.println( name + ", you can vote, but you can not buy alcohol.");
	}
	else
	{
		System.out.println( name + ", You can do everything!");
	}
	{
		
	}
	}
	

}
