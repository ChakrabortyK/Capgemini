package jUnit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.unitTesting.Junit;

class JunitTest {

	@Test
	void test() {
		
		int actual = Junit.add(1, 5);
		int expected = 6;
		assertEquals(expected, actual);
	}

}
