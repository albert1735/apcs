import java.text.NumberFormat;
import java.util.Scanner;

public class RandomMathematics 
{
	public static void main(String [] args) throws InterruptedException
	{
		Scanner kb = new Scanner(System.in);
		//random numbers 
		double numberOne = Math.random();
		System.out.println("Number 1: " + numberOne);
		//Math.random() all the numbers between 0 and 1, including 0 
		
		//random number between 0 and 9
		double stepOne = (Math.random()*10);
				System.out.println("Another random number is " + stepOne);
		int stepTwo = (int)(Math.random()*10);
		System.out.println("The random integer is " + stepTwo);
	
		int stepThree = (int)(Math.random()*6+5);
		System.out.println("Another number is " + stepThree);
		//(cast) (Math.random()*range + starting number
		
		//37 - 45
		int stepFour = (int)(Math.random()*9+37);
		System.out.println(stepFour);
		
		
		//-2 - 3. If there's a negative, 
		//subtract 1 more, and multiply 1 more!!
		int stepFive = (int)(Math.random()*7-3);
		System.out.println(stepFive);
		
		System.out.println("How much money do you have?");
		
		
		double amtOfMoney = kb.nextDouble();
		
		NumberFormat money =NumberFormat.getCurrencyInstance();
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("What is your bank routing number?");
		int rout = kb.nextInt();
		System.out.println("What is your bank account number?");
		int acct = kb.nextInt();
		System.out.println("Please wait, system processing......");
		Thread.sleep(4000);
		System.out.println("Good Evening " + name +". You have successfully transferred "+money.format(amtOfMoney) + " to Dominos Hacker LLC.");
		Thread.sleep(5000);
		System.out.println("It was a pleasure doing business with you!");
	}
	

}
