package com.in28Min.JunitCourses;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class StringHelper1  {
	
	
	
	StringHelper stringHelper;
	
	@Before
	public void init() {
		stringHelper=new StringHelper();
	}
	@Test
	public void test() {
//		fail("not yet implemented");
		
//		assertEquals("abc", "abcs");
		//expected valve and actual value
		
		//given
		String actual = stringHelper.truncateAInFirst2Positions("AACD");
		String expected="CD";
		
		String actual1 = stringHelper.truncateAInFirst2Positions("DJAA");
	
		assertEquals(expected, actual);
		assertEquals("DJAA", actual1);
		
	}
	@Test
	public void test2() {
		//given 
		String actual = stringHelper.truncateAInFirst2Positions("CDEF");
		String expected="CDEF";
		String actual1 = stringHelper.truncateAInFirst2Positions("CDAA");
		String expected1="CDAA";
		
		assertEquals(expected, actual);
		assertEquals(expected1, actual1);
		//act
		//assert
		
	}
	@Test
	public void test3() {
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB");
	
		assertTrue(actual);
	}
	
	@Test
	public void test4AboutNegativeScenario() {
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD");
	
	assertFalse(actual);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArrays() {
		int []a=null;
		Arrays.sort(a);
	}

}
