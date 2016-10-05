package com.trend.wayne.mavenstudy;

import junit.framework.*;
import java.util.*;
import java.lang.*;

public class SumMtoNTest extends TestCase {

	SumMtoN object;

	public SumMtoNTest(String testName) {
		super(testName);
		object = new SumMtoN();
	}
	
	public static Test suite(){
		return new TestSuite(SumMtoNTest.class);
	}

	//@Test
	public void testSum0to10() {
		assertEquals(55, object.sumMtoN(0, 10));
	}

	//@Test
	public void testSumNeg10to0() {
		assertEquals(-55, object.sumMtoN(-10, 0));
	}
}
		
