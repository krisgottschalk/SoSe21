package aufgaben.aufgabe2;

public class MyIntegerTest 
{
	public static void main(String[] args) 
	{
		System.out.println(MyInteger.MAX_VALUE);
		
		try {
			String s = "-00009800";
			System.out.println(MyInteger.parseInt(s));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			String s = "a98";
			System.out.println(MyInteger.parseInt(s));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		MyInteger number1 = new MyInteger(-9);
		MyInteger number2 = new MyInteger(-9);
		MyInteger string = new MyInteger("-23232");
		
		System.out.println(number2.intValue());
		System.out.println(number1.intValue());
		System.out.println(number1.doubleValue());
		System.out.println(MyInteger.valueOf("9898"));
		
		
		System.out.println("number und number2 sind gleich: " +number1.equals(number2) );
		
		System.out.println(string.intValue());
		
		System.out.println(string.toString());
		
		
		
		

	}

}
