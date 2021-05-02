package uebungen.uebung3;

import javax.swing.JOptionPane;

public class Uebung3 
{
	public static int inputInt(int min, int max)
	{
		boolean inputOk = false;
		int inputInt = min -1;
		while(!inputOk || inputInt < min || inputInt > max)
		{
			try
			{
				String input = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl "
						+ "zwischen " + min + " und " + max + " ein.");
				inputInt = Integer.parseInt(input);
				inputOk = true;
			}
			catch(Exception e)
			{
				inputOk = false;
			}
		}
		return inputInt;
	}
	
	

	public static void main(String[] args) 
	{
		//int number = inputInt(2, 200);
		//System.out.println(number);
		
		int dividend = 0;
		int divisor = 1;
		int quotient = 0;
		boolean input0k1 = false;
		boolean inputOk2 = false;
		int round1 = 1;
		int round2 = 1;
		while(!input0k1)
		{
			try 
			{
				if(round1 ==1)
				{
					round1++;
					String input1 = JOptionPane.showInputDialog(null, "Zahl 1:");
					dividend = Integer.parseInt(input1);
					input0k1 = true;
				}
				else
				{
					String input = JOptionPane.showInputDialog(null, "Es war keine Zahl! Bitte eine Zahl eingeben!");
					dividend = Integer.parseInt(input);
					input0k1 = true;
				}
			}
			catch(Exception e)
			{
				input0k1 = false;
			}
		}

		while(!inputOk2)
		{
			try
			{
				if(round2 ==1)
				{
					round2++;
					String input2 = JOptionPane.showInputDialog(null, "Zahl 2:");
					divisor = Integer.parseInt(input2);
					quotient = dividend/ divisor;
					inputOk2 = true;
				}
				else if(divisor == 0.0)
				{
					divisor++;
					String input2 = JOptionPane.showInputDialog(null, "Zahl darf nicht 0 sein!");
					divisor = Integer.parseInt(input2);
					quotient = dividend/ divisor;
					inputOk2 = true;
				}
				else
				{
					String input2 = JOptionPane.showInputDialog(null, "Es war keine Zahl! Bitte eine Zahl eingeben!");
					divisor = Integer.parseInt(input2);
					quotient = dividend/ divisor;
					inputOk2 = true;
				}
			}
			catch(ArithmeticException e)
			{
				inputOk2 = false;
			}
			catch(Exception e)
			{
				inputOk2 = false;
			}
		}
		

		JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + dividend/ divisor);
	
		
		

	}

}
