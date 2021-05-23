package aufgaben.aufgabe5;

import java.util.*;

public class SetOperations 
{
	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	
	public SetOperations() 
	{
		this.numbers1 = new TreeSet<>();
		this.numbers2 = new TreeSet<>();
		this.both = new TreeSet<>();
	}

	public void fill()
	{
		Random r = new Random();
		for(int i=0; i< 100; i++)
		{
			int randomNr1 = r.nextInt(100);
			int randomNr2 = r.nextInt(100);
			numbers1.add(Integer.valueOf(randomNr1));
			numbers2.add(Integer.valueOf(randomNr2));
		}
	}
	
	public void fillBothUnion()
	{
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+'\u222a'+" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.addAll(numbers2);
	}
	
	public void fillBothIntersection()
	{
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+'\u2229'+" B ");
		System.out.println("----------------------------------------------------------------------------");

		this.both.clear();
		this.both.addAll(numbers1);
		this.both.retainAll(numbers2);
	}
	
	public void fillBothDifference()
	{
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                          A-B ");
		System.out.println("----------------------------------------------------------------------------");

		this.both.addAll(numbers1);
		this.both.removeAll(numbers2);
	}
	
	public void print()
	{
		int counterA = 0;
		int counterB = 0;
		int counterBoth = 0;
		
		for(int row=0; row<10; row++)
		{
			for(int col=0; col<10; col++)
			{
				if(this.numbers1.contains(counterA))
				{
					System.out.print(" " + '\u25cf');
				}
				else
				{
					System.out.print(" " + '\u2009');
				}
				counterA++;
			}
			System.out.print("        ");
			
			for(int col=0; col<10; col++)
			{
				if(this.numbers2.contains(counterB))
				{
					System.out.print(" " + '\u25cf');
				}
				else
				{
					System.out.print(" " + '\u2009');
				}
				counterB++;
			}
			System.out.print("        ");
			
			for(int col=0; col<10; col++)
			{
				if(this.both.contains(counterBoth))
				{
					System.out.print(" " + '\u25cf');
				}
				else
				{
					System.out.print(" " + '\u2009');
				}
				counterBoth++;
			}
			System.out.println();
		}
	}

}
