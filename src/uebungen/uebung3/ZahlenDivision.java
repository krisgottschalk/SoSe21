package uebungen.uebung3;

import javax.swing.JOptionPane;

public class ZahlenDivision 
{
	
	int dividend;
	int divisor;
	double dividendD;
	double divisorD;
	double quotient;
	
	public ZahlenDivision()
	{
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
					this.dividend = Integer.parseInt(input1);
					dividendD = (double) dividend;
					input0k1 = true;
				}
				else
				{
					String input = JOptionPane.showInputDialog(null, "Es war keine Zahl! Bitte eine Zahl eingeben!");
					this.dividend = Integer.parseInt(input);
					dividendD = (double) dividend;
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
					this.divisor = Integer.parseInt(input2);
					divisorD = (double) divisor;
					this.quotient = dividendD/ divisorD;
					inputOk2 = true;
				}
				else if(this.divisor == 0.0)
				{
					divisor++;
					String input2 = JOptionPane.showInputDialog(null, "Zahl darf nicht 0 sein!");
					this.divisor = Integer.parseInt(input2);
					divisorD = (double) divisor;
					this.quotient = dividendD/ divisorD;
					inputOk2 = true;
				}
				else
				{
					String input2 = JOptionPane.showInputDialog(null, "Es war keine Zahl! Bitte eine Zahl eingeben!");
					this.divisor = Integer.parseInt(input2);
					divisorD = (double) divisor;
					this.quotient = dividendD/ divisorD;
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


		JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + this.quotient);

	}
	
	public static void main(String[] args) 
	{
		new ZahlenDivision();
	}

}
