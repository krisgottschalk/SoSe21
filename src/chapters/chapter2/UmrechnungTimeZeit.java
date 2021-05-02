package chapters.chapter2;

public class UmrechnungTimeZeit {
	
	
	public String convert(String time)
	{ 
		final int LAST_THREE_CHARS = 3; // " pm" or " am"
		
		if(time.endsWith("am"))
		{
			return time.substring(0, time.length()-LAST_THREE_CHARS); 
		}
		else // ends with pm
		{
			int hourInt = this.getHoursInt(time);
			hourInt += 12;
			String ohnePm = time.substring(0, time.length()-LAST_THREE_CHARS);
			String rest = ohnePm.substring(1);
			
			String zeit = hourInt + rest;
			return zeit;
		}
	}
	
	String getHoursStr(String time)
	{
		String [] allStr = time.split(":");
		return allStr[0];
	}
	
	String getMinutesStr(String time)
	{
		String [] allStr = time.split(":");
		String afterDouble =  allStr[1];
		String minutesStr = afterDouble.substring(0, 2);
		return minutesStr; 
	}
	
	int getHoursInt(String time)
	{
		String hoursStr = this.getHoursStr(time);
		int hoursInt = Integer.valueOf(hoursStr);
		return hoursInt;
	}


}
