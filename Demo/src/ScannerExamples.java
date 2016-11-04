import java.util.Scanner;

public class ScannerExamples {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter in the first number");
		int numOne = kb.nextInt();
		System.out.println("The number you entered is " + numOne);
		System.out.println("Please enter the second number");
		int numTwo = kb.nextInt();
		System.out.println("The number you entered is " + numTwo);
		//Get the user's name
		//by name tell them what the two numbers are + - * /
		
		
		System.out.println("Please enter your user name.");
		String username = kb.next();
		int add = numOne + numTwo;
		int diff = numOne - numTwo;
		int multi = numOne * numTwo;
		int div = numOne / numTwo;
	
		System.out.println(username + " the two numbers added are " + add);
		System.out.println(username + " the two numbers subtracted are " + diff);
		System.out.println(username + " the two numbers multiplied are " + multi);
		System.out.println(username + " the two numbers divided are " + div);
		//square root of a sum 
		System.out.println("What number would you like to square root?");
		double value = kb.nextDouble();
		double squareRoot = Math.sqrt(value); 
		System.out.println("The square root of " + value +" is " +squareRoot);
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.abs(value));
		double expo = Math.pow(5, 6);
		System.out.println("5 ^ 6:" + expo);
	}
}
