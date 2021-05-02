package chapters.chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UmrechnungTimeZeitTest {

	@Test
	void testConvert1amTo1() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("1:00 am");
		
		// then (verification)
		assertEquals("1:00", zeit, "1:00am to 1:00 not working"); // assertTrue(zeit.equals("1:00")
	}
	
	@Test
	void testConvert2amTo2() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("2:00 am");
		
		// then (verification)
		assertEquals("2:00", zeit, "2:00am to 2:00 not working"); 
	}
	
	@Test
	void testConvert9amTo9() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("9:00 am");
		
		// then (verification)
		assertEquals("9:00", zeit); 
	}
	
	@Test
	void testConvert10amTo10() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("10:00 am");
		
		// then (verification)
		assertEquals("10:00", zeit); 
	}
	
	@Test
	void testConvert1115amTo1115() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("11:15 am");
		
		// then (verification)
		assertEquals("11:15", zeit); 
	}
	
	@Test
	void testConvert1pmTo13() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("1:00 pm");
		
		// then (verification)
		assertEquals("13:00", zeit); 
	}
	
	@Test
	void testConvert3pmTo15() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("3:00 pm");
		
		// then (verification)
		assertEquals("15:00", zeit); 
	}
	
	@Test
	void testConvert545pmTo1745() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("5:45 pm");
		
		// then (verification)
		assertEquals("17:45", zeit); 
	}
	
	@Test
	void testConver11pmTo23() {
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("11:00 pm");
		
		// then (verification)
		assertEquals("23:00", zeit); 
	}
	
	@Test
	void testGetHoursStr11pm()
	{
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String hour = utz.getHoursStr("11:00 pm");
		
		// then (verification)
		assertEquals("11", hour); 
	}
	
	@Test
	void testGetHoursStr1pm()
	{
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String hour = utz.getHoursStr("1:00 pm");
		
		// then (verification)
		assertEquals("1", hour); 
	}
	
	@Test
	void testGetHoursInt1pm()
	{
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		int hours = utz.getHoursInt("1:00 pm");
		
		// then (verification)
		assertEquals(1, hours); 
	}
	
	@Test
	void testGetHoursInt11pm()
	{
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		int hours = utz.getHoursInt("11:00 pm");
		
		// then (verification)
		assertEquals(11, hours); 
	}
	
	@Test
	void testGetMin1pm()
	{
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String minutes = utz.getMinutesStr("1:00 pm");
		
		// then (verification)
		assertEquals(00, minutes); 
	}
	
	@Test
	void testGetMin11pm()
	{
		// given (preparation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String minutes = utz.getMinutesStr("11:00 pm");
		
		// then (verification)
		assertEquals(00, minutes); 
	}


}
