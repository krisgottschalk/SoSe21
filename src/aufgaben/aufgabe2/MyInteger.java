package aufgaben.aufgabe2;

public class MyInteger 
{
	public static final int MAX_VALUE = 2147483647;
	public static final int MIN_VALUE = -2147483648;
	private int value;
	
	private static boolean isInteger(String s)
	{
		if(s == null)
		{
			return false;
		}
		if(s.length()==0)
		{
			return false;
		}
		if(s.charAt(0) == '-' && s.length()==1 || s.charAt(0) != '-' && s.charAt(0) < '0' || s.charAt(0) != '-' && s.charAt(0) > '9')
		{
			return false;
		}
		for(int i=1; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(c < '0' || c > '9')
			{
				return false;
			}
		}
		return true;
	}
	
	public static int parseInt(String s) throws IllegalArgumentException
	{	
		if(!MyInteger.isInteger(s))
		{
			throw new IllegalArgumentException("Der String muss eine Zahl sein!");
		}
		
		int number = 0;
		int index = 0;
		boolean isNegative = false;
		if(s.charAt(0)== '-')
		{
			isNegative = true;
			index = 1;
		}
		while(index<s.length())
		{
			number = number * 10;
			number = number + (s.charAt(index++) - '0');
		}
		if(isNegative)
		{
			number = -number;
		}
		return number;
	}
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value = MyInteger.parseInt(s);
	}
	
	public int intValue()
	{
		return this.value;
	}
	
	public double doubleValue()
	{
		return this.value;
	}
	
	public static MyInteger valueOf(String s) throws IllegalArgumentException
	{
		return new MyInteger(s);
	}
	
	public static MyInteger valueOf(int value)
	{
		return new MyInteger(value);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	@Override 
	public String toString()
	{
		String s = "";
		return s + this.value;
	}
	
	
}
