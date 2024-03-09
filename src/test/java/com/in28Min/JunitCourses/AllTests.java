package com.in28Min.JunitCourses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, ParameterizedTestCase.class, StringHelper1.class })
public class AllTests {

}
