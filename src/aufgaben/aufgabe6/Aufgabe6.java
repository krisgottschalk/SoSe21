package aufgaben.aufgabe6;

public class Aufgabe6 
{
	public static void main(String[] args) 
	{
		long a = 1000;
		Integer b = 1000;       
		Integer c = 1000;   
		
		System.out.println(a == b);
		System.out.println(b.intValue() == c.intValue());
		/*
		 * Integer b und Integer c zeigen auf unterschiedliche Objekte, 
		 * da sie sich als Referenzen vergleichen und nicht die Werte verglichen werden.
		 * Deswegen einfach mit intValue() die Werte mit == vergleichen.
		 */
	}
	

}
