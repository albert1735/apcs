import java.util.Scanner;

public class HeronFormula {
	public static void main(String [] args) throws InterruptedException
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("What is the length of the first side of the triangle?");
		double fside = kb.nextDouble();
		if (fside <= 0)
		{
			System.out.println("Stop trolling " + name + "!");
			Thread.sleep(2000);
		}
	
		System.out.println("What is the length of the second side of the triangle?");
		double sside = kb.nextDouble();
		if (sside <= 0)
		{
			System.out.println("You failed Math");
			Thread.sleep(2000);
		}
		
		System.out.println("What is the length of the third side of the triangle?");
		double tside = kb.nextDouble();
		if (tside <= 0)
		{
			System.out.println("You are a 6th grade math champion! ");
			
		}
		
	
		double perimeter = (fside + sside + tside) / 2;
		
		double area = Math.sqrt(perimeter * (perimeter - fside) * (perimeter - sside) * (perimeter - tside)); 
		if (area>0)
		{
			System.out.println("The area of this triangle is " + area);
		}
		else if(area<=0)
		{
			System.out.println("Summer school time!");
			
		}
	}

}
