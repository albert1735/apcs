
public class DifferentStringMethods 
{
	public static void main(String [] args)
	{
		String states = "Michigan Alaska Louisiana"; 
		String subStates ;
		System.out.println("The states are " + states);
		subStates = states.toUpperCase();
		System.out.println("The substates are " + subStates);
		subStates = states.toLowerCase();
		System.out.println("The substates are " + subStates);
		String partOfStates = states.substring(9);
		System.out.println(partOfStates);
		char firstLetter = states.charAt(9);
		System.out.println(firstLetter);
	}
}
