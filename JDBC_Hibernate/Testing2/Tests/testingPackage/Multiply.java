package testingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practiceTest.Solution;

class Multiply {

	@Test
	void testMult1() {
		
		int result = Solution.multiply(5, 6);
		int expected = 30;
		assertEquals(result, expected);
	
	}
	@Test
	void testMult2() {
		
//		int result = Solution.multiply(-5, -6);
//		int expected = 30;
		assertEquals(Solution.multiply(-5, -6), 30);
		
	}
	
	@Test
	void testAdd() {
		
		int result = Solution.add(-5, -5);
		int expected = -10;
		assertEquals(result, expected);
	}

	@Test
	void boolTest() {
		assertTrue(Solution.even(54));
	}
	@Test
	void boolTest2() {
		assertFalse(Solution.even(55));		
	}
	
	@Test
	void arrayTest() {
		assertArrayEquals(new int[]{1,2,3,4,5}, Solution.arrayRet());
	}
	
	
}
