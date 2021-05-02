package chapters.chapter2;

public class MyMath {
	
	public static int abs(int number)
	{
		if(number<0)
		{
			return -number;
		}
		else
		{
			return number;
		}
	}
	
	public static double abs(double number)
	{
		if(number<0)
		{
			return -number;
		}
		else
		{
			return number;
		}
	}
	
	public static double sqrt(double number)
	{
		double a = number;
		double b = 1.0;
		final double AREA = number;
		final double ERROR = 0.000001;
		while(abs(a-b) >= ERROR)
		{
			a = (a +b) / 2.0;
			b = AREA / a;
		}
		return a;
	}

	

}
