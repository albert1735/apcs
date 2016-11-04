
public class Numbers 
{
	public static void main(String [] args)
	{
		raining();
	}
	
	static void raining()
	{	
		boolean choice = true;
		while(choice ==true)
		{
		int number = (int)(Math.random() * 932000000);
		System.out.println(number);
		}
	}

}
