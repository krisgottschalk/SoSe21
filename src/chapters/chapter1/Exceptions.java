package chapters.chapter1;

import javax.swing.JOptionPane;

public class Exceptions {
	
	public static int division(int nr1, int nr2)
	{
		return nr1/nr2;
	}
	
	public static int getValueAtIndex(int[] arr, int index)
	{
		return arr[index];
	}

	public static char charAt(String s, int index)
	{
		return s.charAt(index);
	}

	public static void main(String[] args) 
	{
		int nr1 = 4;
		int nr2 = 0;
		try {
			int result = division(nr1, nr2);
			System.out.printf("%2d / %2d = %2d %n", nr1, nr2, result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division durch 0 nicht definiert");
		}
		catch(Exception e)
		{
			System.out.println("Kein Index des Arrays");
		}

		int arr[] = {1, 2, 3, 4 };
		try {
			int value = getValueAtIndex(arr, 4);
			System.out.println(value);
		}
		catch(Exception e)
		{
			System.out.println("Kein Index des Arrays");
		}

		String s = "Hallo!";
		try {
			char c = charAt(s, 6);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Kein Index des Strings");
		}

		boolean eingabeOk = false;
		int zahl = 0;
		while(!eingabeOk)
		{
			String eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
			try {
				zahl = Integer.valueOf(eingabe);
				eingabeOk = true;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Eingabe war keine Zahl!");
			}
		}
		System.out.println(zahl);





	}

}
