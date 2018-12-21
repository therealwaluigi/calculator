package ch.bbw.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void init(){
		testee = new Calculator();
	}

	// Tests für Summe
	@Test
	public void testSummeZweiPositive() {
		assertTrue(testee.summe(2, 5) == 7);
	}

	@Test
	public void testSummeZweiNegative(){
		assertTrue(testee.summe(-5, -5) == -10);
	}

	@Test
	public void testSummeNegativPositiv(){
		assertTrue(testee.summe(-5, 10) == 5);
	}

	@Test
	public void testSummeNullPositiv(){
		assertTrue(testee.summe(0, 10) == 10);
	}

	@Test
	public void testSummeNullNegativ(){
		assertTrue(testee.summe(0, -10) == -10);
	}

	@Test
	public void testSummeMaxValuePositiv(){
		assertTrue(testee.summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}

	@Test
	public void testSummeMinValueNegativ(){
		assertTrue(testee.summe(Integer.MIN_VALUE, -1) == Integer.MAX_VALUE);
	}

	@Test
	public void testSummeErgebnisNull(){
		assertTrue(testee.summe(0, 0) == 0);
	}


	// Tests für Subtraktion
	@Test
	public void testSubtractionZweiPositive(){
		assertTrue(testee.subtraction(5, 2) == 3);
	}

	@Test
	public void testSubtractionZweiNegative(){
		assertTrue(testee.subtraction(-5, -5) == 0);
	}

	@Test
	public void testSubtractionPositivNegativ(){
		assertTrue(testee.subtraction(-5, 5) == -10);
	}

	@Test
	public void testSubtractionPositivNull(){
		assertTrue(testee.subtraction(5,0) == 5);
	}

	@Test
	public void testSubtractionNegativNull(){
		assertTrue(testee.subtraction(-5,0) == -5);
	}

	@Test
	public void testSubtractionMaxValuePositiv(){
		assertTrue(testee.subtraction(Integer.MAX_VALUE, 1) == Integer.MAX_VALUE-1);
	}

	@Test
	public void testSubtractionMaxValueNegativ(){
		assertTrue(testee.subtraction(Integer.MAX_VALUE, -1) == Integer.MIN_VALUE);
	}

	@Test
	public void testSubtractionMinValuePositiv(){
		assertTrue(testee.subtraction(Integer.MIN_VALUE, 1) == Integer.MAX_VALUE);
	}

	// Tests für Division
	@Test(expected=IllegalArgumentException.class)
	public void testDivisionByZero(){
		testee.division(5, 0);
	}

	@Test
	public void testDivisionByThree() throws IllegalArgumentException{
			testee.division(5, 2);
	};

}
