package Loops;

import java.util.Scanner;

public class WordReplacement
{
	String sentence = "";
	public void enterInSentence()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence.");
	    sentence = kb.nextLine();
		System.out.println("You entered in the sentence: " + sentence);
		
	}
	public void replaceWord()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What word do you like to replace?");
		String word = kb.next();
		System.out.println("Change it to?");
		String newWord = kb.next();
		System.out.println("Getting rid of " + word + " and replace it with " + newWord );
		sentence = sentence.replaceAll(word, newWord);
		System.out.println(sentence);
	}
	public void replaceVowels()
	{
		for(int i = 0; i < sentence.length(); i++)
		{
			sentence = sentence.toUpperCase();
			char x = sentence.charAt(i);
			if (x == 'I')
			{
				sentence = sentence.replace(sentence.charAt(i), 'B');
			}
			else if(x== 'A')
			{
				sentence = sentence.replace(sentence.charAt(i), 'B');
			}
			else if(x== 'E')
			{
				sentence = sentence.replace(sentence.charAt(i), 'B');
			}
			else if(x== 'O')
			{
				sentence = sentence.replace(sentence.charAt(i), 'B');
			}
			else if(x== 'U')
			{
				sentence = sentence.replace(sentence.charAt(i), 'B');
			}
		}System.out.println(sentence);
	}
	
	}
