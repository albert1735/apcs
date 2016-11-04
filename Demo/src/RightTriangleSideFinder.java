import java.util.Scanner;

public class RightTriangleSideFinder 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is missing? A leg or hypotenuse?");
		String missingside = kb.next();
		if (missingside.equalsIgnoreCase("hypotenuse"))
		{
			System.out.println("What is the length of the first leg?");
			double firstleg = kb.nextDouble();
			System.out.println("What is the length of the second leg?");
			double secondleg = kb.nextDouble();
			double calculation1 = Math.sqrt((firstleg * firstleg) + (secondleg * secondleg));
			System.out.println("The missing length is " + calculation1);
		}
		else if (missingside.equalsIgnoreCase("leg"))
		{
			System.out.println("What is the length of the hypotenuse?");
			double hypo = kb.nextDouble();
			System.out.println("What is the length of the other leg?");
			double secondleg2 = kb.nextDouble();
			double calculation2 = Math.sqrt((hypo * hypo) - (secondleg2 * secondleg2]));
			System.out.println("The missing length is " + calculation2);
		}
	}
}
