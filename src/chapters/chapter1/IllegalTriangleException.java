package chapters.chapter1;

public class IllegalTriangleException extends Exception
{
	public IllegalTriangleException(String s)
	{
		super(s);
	}
	
	public IllegalTriangleException()
	{
		super("Each side has to be smaller than the sum of the other sides!");
	}
}
