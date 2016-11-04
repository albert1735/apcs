package Loops;

import java.util.Scanner;

public class Latin 
{
	public void latin()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your first name?");
		String fname = kb.next();
		System.out.println("What is your last name?");
		String lname = kb.next();
		System.out.println(fname.toLowerCase()+ " "+ lname.toLowerCase());
		char fletter = fname.charAt(0);
		int lengthfname = fname.length();
		String fnamenew = fname.substring(1,lengthfname);
		char lletter = lname.charAt(0);
		int lengthlname = lname.length();
		String lnamenew = lname.substring(1, lengthlname);
		String last = "ay";
		System.out.println("Your entry translates to " + fnamenew.toLowerCase() + Character.toLowerCase(fletter) + last.toLowerCase() + " " + lnamenew.toLowerCase() + Character.toLowerCase(lletter) + last.toLowerCase());
		
		
		
		
	}
	{
		
	}
}
