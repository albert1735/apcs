import javax.swing.JOptionPane;

public class GCFClass 
{
	int i, hcf =0;
	public void findGCF()
	{
		String num1 = JOptionPane.showInputDialog("What is the first number?");
		String num2 = JOptionPane.showInputDialog("What is the second number?");
		int fnum = Integer.parseInt(num1);
		int snum = Integer.parseInt(num2);
		for (i=1; i<=fnum || i <= snum; i++)
		{
			if (fnum%i ==0 && snum%i==0)
			{
				hcf =i;
			}
		}
		JOptionPane.showMessageDialog(null,"The GCF of " + num1 + " and " + num2 + " is " + hcf);
	}
}
