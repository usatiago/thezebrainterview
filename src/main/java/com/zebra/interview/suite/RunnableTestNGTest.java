package com.zebra.interview.suite;


import java.net.URI;
import java.net.URL;
import java.util.List;
import org.testng.TestNG;
import com.beust.jcommander.internal.Lists;

public class RunnableTestNGTest {
		
	public static void main(String[] args) throws Exception {
	    TestNG testng = new TestNG();
	    List<String> suites = Lists.newArrayList();
	    suites.add("./testng.xml");
	    testng.setTestSuites(suites);
	    testng.run();	  
	}
			
}
