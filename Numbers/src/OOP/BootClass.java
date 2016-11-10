package OOP;

import java.util.Scanner;


public class BootClass 
{
	int shoeSize;
	String material;
	//special method - constructor method 
	
	public BootClass(int x, String y)
	{
		shoeSize = x;
		material = y;
	}
	// Special method 2 - printOut
	public String toString()
	{
	String info = "The shoe size is " + shoeSize + " and the material is " + material;
	return info;
	}
	
	public void setSize()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your shoe size?");
		int shoeSize = kb.nextInt();
	}
	
	public int getSize()
	{
		return shoeSize;
	}
	
}
