import java.text.NumberFormat;
import java.util.Scanner;

public class CoinsInAJar
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("How many quarters in the jar?");
		double qurts = kb.nextDouble();
		System.out.println("How many dimes in the jar?");
		double dims = kb.nextDouble();
		System.out.println("How many nickels in the jar?");
		double nikls = kb.nextDouble();
		System.out.println("How many pennies are in the jar?");
		double penny = kb.nextDouble();
		double total = (qurts*0.25) + (dims*0.1) + (nikls*0.05) + (penny*0.01);
		System.out.println("You have $" + total +" in the jar.");
		
	}

}
