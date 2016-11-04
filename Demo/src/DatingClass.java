import java.util.Scanner;

public class DatingClass 
{
	//create the methods
	int age1 , age2;
	
	
	public void getAges()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in age of person 1:");
		age1 = kb.nextInt();
		System.out.println("Enter in age of person 2:");
		age2 = kb.nextInt();
		if (age1 < age2)
		{
			int temp = age1;
			age1 = age2;
			age2 =temp;
		}
	
	}
	
	public void getCheckLegal()
	{
		if ((age1/2 + 7) > age2)
		{
			System.out.println("Dont't date.");
			System.out.println("Date people older than " + (age1/2 + 7));
		}
		else
		{
			System.out.println("Keep dating.");
		}
			
		
	}
}

