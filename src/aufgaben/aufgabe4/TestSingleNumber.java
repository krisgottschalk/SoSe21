package aufgaben.aufgabe4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSingleNumber {

	@Test
	void testArrayLength1() {
		// preparation --> given - Voraussetzungen des Tests
		int[] nums = {2};
		
		// execution --> when
		int output = SingleNumber.singleNumber(nums);
		
		// then --> verification
		assertEquals(2, output);
	}
	
	@Test
	void testArrayLength3() {
		// preparation --> given - Voraussetzungen des Tests
		int[] nums = {2,2,1};
		
		// execution --> when
		int output = SingleNumber.singleNumber(nums);
		
		// then --> verification
		assertEquals(1, output);
	}
	
	@Test
	void testArrayLength5() {
		// preparation --> given - Voraussetzungen des Tests
		int[] nums = {1,2,2,1,9};
		
		// execution --> when
		int output = SingleNumber.singleNumber(nums);
		
		// then --> verification
		assertEquals(9, output);
	}
	
	@Test
	void testArrayLength0() {
		// preparation --> given - Voraussetzungen des Tests
		int[] nums = {};
		
		// execution --> when
		int output = SingleNumber.singleNumber(nums);
		
		// then --> verification
		assertEquals(-1, output);
	}
	
	@Test
	void testArrayContainsMoreSingleNumbers() {
		// preparation --> given - Voraussetzungen des Tests
		int[] nums = {1,1,2,3,4,5,3,4};
		
		// execution --> when
		int output = SingleNumber.singleNumber(nums);
		
		// then --> verification
		assertEquals(-1, output);
	}

}
