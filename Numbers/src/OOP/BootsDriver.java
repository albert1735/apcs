package OOP;

public class BootsDriver 
{
	public static void main(String [] args)
	{
		BootClass shoeOne = new BootClass();
		System.out.println(shoeOne);
		shoeOne.setSize();
		System.out.println(shoeOne);
		System.out.println("Size: " +shoeOne.getSize());
									//arguments
		BootClass shoeTwo = new BootClass(15, "Cotton");
		System.out.println(shoeTwo);
	}
}
