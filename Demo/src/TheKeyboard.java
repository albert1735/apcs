import java.util.Scanner;

public class TheKeyboard 
{  public static void main (String [] args)
	{
	//4x+3 
	//x+5
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is the value of x?");
	double x = keyboard.nextDouble();
	System.out.println("What is the slope of the equation?");
	double m = keyboard.nextDouble();
	System.out.println("What is the y-intercept of the equation?");
	Double b = keyboard.nextDouble();
	double answer = m*x+b;
	System.out.println("When x = " + x + ", the answer is " + answer + ".");
	System.out.println("Please enter in your first name");
	String fname = keyboard.next();
	System.out .println("Welcome to earth " + fname + "!");
	System.out.println("Please enter your last name. ");
	String Lname = keyboard.next();
	System.out.println("mr." + Lname );
	}	
}
