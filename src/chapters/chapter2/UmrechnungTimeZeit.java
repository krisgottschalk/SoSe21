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
			final int DIFF_BTWN_H_HH = 12;
			int hourInt = this.getHoursInt(time);
			hourInt += DIFF_BTWN_H_HH;
			String minutes = this.getMinutesStr(time);
			
			String zeit = hourInt + ":" + minutes;
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
		final int FIRST_TWO_CHARS = 2;
		String [] allStr = time.split(":");
		String afterDouble =  allStr[1];
		String minutesStr = afterDouble.substring(0, FIRST_TWO_CHARS);
		return minutesStr; 
	}
	
	int getHoursInt(String time)
	{
		String hoursStr = this.getHoursStr(time);
		int hoursInt = Integer.valueOf(hoursStr);
		return hoursInt;
	}


}
