import java.util.Scanner;

public class TotalSeconds {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the whole hours of the marathon. ");
		double hrs = kb.nextDouble(); 
		System.out.println("Please enter the whole minutes of the marathon. ");
		double mins = kb.nextDouble();
		System.out.println("Please enter the remaining seconds. ");
		double sec = kb.nextDouble();
		double total = (hrs*3600.0) + (mins*60.0) + sec;
		System.out.println("The total seconds of the marathon is "+ total);
	}

}
