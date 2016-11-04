import java.util.Scanner;

public class FourNumberAverage
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first number.");
		double numOne = kb.nextDouble(); 
		System.out.println("PLease enter the second number.");
		double numTwo = kb.nextDouble();
		System.out.println("Please enter the third number.");
		double numThree = kb.nextDouble();
		System.out.println("Please enter the fourth number.");
		double numFour = kb.nextDouble();
		
		double sum = numOne + numTwo + numThree + numFour;
		double avg = sum / 4 ;
		System.out.println("The average of "+numOne+", "+numTwo+", "+numThree+", "+numFour+" is "+avg+".");
	}
		
}
