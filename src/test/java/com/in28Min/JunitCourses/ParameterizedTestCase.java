package com.in28Min.JunitCourses;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	StringHelper sh=new StringHelper();
	String actual;
	String expected;
	public ParameterizedTestCase(String actual,String expected) {
	this.actual=actual;
	this.expected=expected;
	}
	
	@Parameters
	public static Collection passParameter() {
		 String[][] passparameter= {{"AABB","BB"},{"CCDD","CCDD"}};
		 List<String[]> asList = Arrays.asList(passparameter);
		 
	return asList;
	}
	@Test
	public void test() {
	assertEquals(expected, sh.truncateAInFirst2Positions(actual));	
	}

}
