import java.util.Scanner;

public class TempConvertTwo 
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the temperature in Celcius?");
		double temp = kb.nextDouble();
		System.out.println("What is the desired conversion unit?");
		String unit = kb.next();
		
		if (unit.equalsIgnoreCase("Celcius"))
		{
			System.out.println("You've entered the same thing...");
		}
		else if (unit.equalsIgnoreCase("Kelvin"))
		{
			double finalk = temp + (273.15);
			System.out.println("The temperature is " + finalk + ".");
		}
		else if (unit.equalsIgnoreCase("fahrenheit"))
		{
			double finalf = temp *(9/5) +32;
			System.out.println("The temperature is " + finalf + ".");
		}
		else if (unit.equalsIgnoreCase("rankine"))
		{
			double finalr = (temp + 273.15) * (9/5);
			System.out.println("The temperature is " + finalr + ".");
		}
		else 
		{
			System.out.println("You did not enter a valid unit, please reload the program and try again!");
		}
	}
	
}
