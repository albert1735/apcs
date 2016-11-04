import java.util.Scanner;

public class Salary 
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How many hours have you worked this week?");
		double hrs = kb.nextDouble();
		System.out.println("How much do you get paid every hour?");
		double rate = kb.nextDouble();
	   
		if (hrs < 0)
		{
		System.out.println("You entered an impossible work hour!");
		} 
		else if (hrs < 40)
		{
		double wsalary = (hrs * rate);
		System.out.println("Your weekly pay is $" + wsalary);
		}
		else
		{
			double totalextra = (rate) * (1.5) * (hrs - 40) + (40 * rate);
			System.out.println("You have made $" + totalextra);
		}
	
	}

}
