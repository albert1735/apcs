
public class Escape {
	public static void main(String [] args)
	{
		String mason = "Indiana middle school was here this morning.";
		System.out.println("The sentence is " + mason );
		//The new sentence is "Brooke's mom will win the 5k race." 
		System.out.println("The new sentence is \"Brooke\"");
		//escape sequence \" inside ""
		System.out.println("\"to be or not\"");
		System.out.println("\"The escape sequence for \"is \\\""); 
		//the escape sequence is \\ 
		System.out.println("Washington \n\tCapitals");
		//Escape for inside strings new line new line, \,"
		String randomSentence = "My son is crazy and already getting sent to the principal.";
		int numCharacters = randomSentence.length();
		System.out.println("The number of characters are " + numCharacters);
		String randomSentence2 = randomSentence.replace("son", "daughter");
		System.out.println(randomSentence2);
		
	}
}
	
