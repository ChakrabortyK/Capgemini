package jUnitTDDtests;

import org.junit.jupiter.api.*;

import com.jUnitTDD.SolutionTDD;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

    SolutionTDD sol;

    @BeforeEach
    void setup() {
    	sol = new SolutionTDD();
    }

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        int result = sol.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    void shouldMultiplyPositiveAndNegativeNumber() {
        int result = sol.multiply(4, -2);
        assertEquals(-8, result);
    }

    @Test
    void shouldMultiplyTwoNegativeNumbers() {
        int result = sol.multiply(-3, -5);
        assertEquals(15, result);
    }

    @Test
    void shouldReturnZeroWhenOneOperandIsZero() {
        int result = sol.multiply(5, 0);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroWhenBothOperandsAreZero() {
        int result = sol.multiply(0, 0);
        assertEquals(0, result);
    }
}