import java.util.Scanner;

public class TempConverter {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit.");
		double f = kb.nextDouble();
		double c = (f-32)*(5.0/9.0);
		System.out.println(f+" degrees F converts to "+c+" in C. ");
	}

}
