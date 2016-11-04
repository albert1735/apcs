import java.util.Scanner;

public class DIstanceFormula
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the x value for point 1.");
		double xOne = kb.nextDouble();
		System.out.println("Please enter the y value for point 1.");
		double yOne = kb.nextDouble();
		System.out.println("Please enter the x value for point 2.");
		double xTwo = kb.nextDouble();
		System.out.println("Please enter the y value for point 2.");
		double yTwo = kb.nextDouble();
		double dist = Math.sqrt(((yTwo - yOne)*(yTwo - yOne)) + ((xTwo - xOne)*(xTwo - xOne)));
		System.out.println("The distance between point 1 and point 2 is " + dist);
	}
	

}
