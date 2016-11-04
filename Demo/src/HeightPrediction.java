import java.util.Scanner;

public class HeightPrediction 
{
	public static void main(String [] args) throws InterruptedException
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		do {
			System.out.println("Are you a male or female?");
			String gender = kb.next();
			System.out.println("That is not a correct entry of gender!");
			Thread.sleep(2000);
			} while (gender.equalsIgnoreCase("male") && gender.equalsIgnoreCase("female"));
		
		double moheight = kb.nextDouble();
		System.out.println("What is your father's height in inches?");
		double faheight = kb.nextDouble();
			
		double averagetotal = moheight + faheight;
		
		
		if (gender.equalsIgnoreCase("Male"))
		{
			double bheight = (averagetotal + 5) / 2;
			System.out.println(name + ", your estimated height is " + bheight + " inches.");
		}
		else if (gender.equalsIgnoreCase("Female"))
		{
			double gheight = (averagetotal -5 ) / 2; 
			System.out.println(name + ", your estimated height is " + gheight + " inches.");
		}
		else 
		{
			System.out.println("That is not a gender! ");
		}
		
	}

	
}
