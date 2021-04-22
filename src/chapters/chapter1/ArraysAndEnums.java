package chapters.chapter1;

public class ArraysAndEnums 
{
	enum Weekday { MO, DI, MI, DO ,FR, SA, SO };
	
	public static void printDay(int day)
	{
		switch(day)
		{
		case 0 : System.out.println("Montag"); break;
		case 1 : System.out.println("Dienstag"); break;
		case 2 : System.out.println("Mittwoch"); break;
		case 3 : System.out.println("Donnerstag"); break;
		case 4 : System.out.println("Freitag"); break;
		case 5 : System.out.println("Samstag"); break;
		case 6 : System.out.println("Sonntag"); break;
		default: System.out.println("kein Tag");
		}
	}
	
	public static void printDay(Weekday day)
	{
		switch(day)
		{
		case MO : System.out.println("Montag"); break;
		case DI : System.out.println("Dienstag"); break;
		case MI : System.out.println("Mittwoch"); break;
		case DO : System.out.println("Donnerstag"); break;
		case FR : System.out.println("Freitag"); break;
		case SA : System.out.println("Samstag"); break;
		case SO : System.out.println("Sonntag"); break;
		default: System.out.println("kein Tag"); 
		}
	}

	public static void main(String[] args) 
	{
		int[][] mdArray = new int[3][4];
		
		for(int i=0; i<mdArray.length; i++)
		{
			for(int j=0; j<mdArray[i].length; j++)
			{
				mdArray[i][j]= i*j;
			}
		}
		
		for(int i=0; i<mdArray.length; i++)
		{
			System.out.print(i + ": ");
			for(int j=0; j<mdArray[i].length; j++)
			{
				System.out.print(mdArray[i][j] + " ");
			}
			System.out.println();
		}
		
		
		String[][] StrArray = new String[3][4];    //Probieren mit String!!
		
		for(int i=0; i<StrArray.length; i++)
		{
			for(int j=0; j<StrArray[i].length; j++)
			{
				StrArray[i][j]= "(" + i + "," + j + ")";
			}
		}
		
		for(int i=0; i<StrArray.length; i++)
		{
			System.out.print(i + ": ");
			for(int j=0; j<StrArray[i].length; j++)
			{
				System.out.print(StrArray[i][j] + " ");
			}
			System.out.println();
		}
		
		printDay(6);
		
		printDay(Weekday.SA);
		
		Weekday day = Weekday.MO;
		System.out.println(day);
		
		


	}

}
