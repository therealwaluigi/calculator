package ch.bbw.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void init(){
		testee = new Calculator();
	}
	
	@Test
	public void testSummeZweiPositive() {
		assertTrue(testee.summe(2, 5) == 7);
	}
	
	@Test
	public void testSubtractionZweiPositive(){
		assertTrue(testee.subtraction(5, 2) == 3);
	}

}
