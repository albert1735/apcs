package Loops;

public class HighestDriver 
{
	public static void main(String [] args)
	{
		Highest obj = new Highest();
		obj.setNumbers();
		obj.setHighest();
		int x = obj.getHighest();
		System.out.println("The highest number is " + x);
	}
}
