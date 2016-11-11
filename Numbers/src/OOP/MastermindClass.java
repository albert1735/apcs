package OOP;

public class MastermindClass 
{
	String answer = "";
	public void setKey()
	{
		//int answerint = Integer.parseInt(answer);
		int counter;
		for (counter = 1; counter <= 4; counter++)
		{
			int answerint = (int)(Math.random()*7 + 1);
			answer = answer + answerint;
		}
		
		System.out.println(answer);
	}
}
