package com.study.test.Calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {
	private Calculator cal;

	
	protected void setUp() throws Exception {
		cal = new Calculator();
	}

	
	public void tearDown() throws Exception {

	}

	
	public void testCalculator() {
		assertNotNull(cal);
	}
	

	public void testCalculatorType() {
		Calculator ca = new Calculator("abc");
		String tos = ca.getCalculatorType();
		assertEquals("abc", tos);
	}
	public void testsetCalculatorType() {
		Calculator ca = new Calculator("abc");
		String tos = ca.getCalculatorType();
		assertEquals("abc", tos);
	}
	public void testgetCalculatorType() {
		Calculator ca = new Calculator("abc");
		String tos = ca.getCalculatorType();
		assertEquals("abc", tos);
	}
	
	public void testadd() {
		int ad = cal.add(3, 4);
		assertEquals(7, ad);
	}

	
	public void testsubtract() {
		int su = cal.subtract(1, 2);
		assertEquals(1, su);
	}

	
	public void testmultiply() {
		int mul[] = { 1, 2, 3 };
		int c = cal.multiply(mul);
		assertEquals(6, c);
	}

	
	public void testdivide() {
		int div = cal.divide(6, 2);
		assertEquals(3, div);
	}

}
