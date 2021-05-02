package chapters.chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void testAbs3() {
		int result = MyMath.abs(3);
		assertEquals(3, result, "abs(3 not 3");

	}
	
	@Test
	void testAbsMinus3() {
		int result = MyMath.abs(-3);
		assertEquals(3, result, "abs(-3 not 3");

	}
	
	@Test
	void testSqrt9() {
		double result = MyMath.sqrt(9.0);
		assertEquals(3, result, 0.00001);
	}

}
