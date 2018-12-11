package ch.bbw.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Test
	public void testSummeZweiPositive() {
		testee = new Calculator();
		assertTrue(testee.summe(2, 5) == 7);
	}
	
	@Test
	public void testSubtractionZweiPositive(){
		testee = new Calculator();
		assertTrue(testee.subtraction(5, 2) == 3);
	}

}
