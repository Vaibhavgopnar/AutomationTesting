package learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalciTest {

	@Test
	void test() {
		Calci c = new Calci();
		int actual = c.divide(10, 5);
		int expectedResult = 2;
		
		assertEquals(actual, expectedResult);
	}

} 
  