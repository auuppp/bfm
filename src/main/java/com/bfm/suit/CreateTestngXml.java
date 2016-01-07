package com.bfm.suit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class CreateTestngXml {
	/**
	 * 
	 * @param Brow
	 * @param Brows
	 * @code = To create a TestNg XML suite file and run it.
	 */
	public static void grid(String Brow, String Brows) {

	    XmlSuite suite = new XmlSuite();
	    suite.setName("Compatability");
	    suite.setVerbose(1);
	    suite.setPreserveOrder("true");
	    suite.setThreadCount(4);
	    suite.setParallel("tests");
	    suite.setTimeOut("5000");

	    // Test
	    XmlTest test = new XmlTest(suite);
	    test.setName("Browser One");
	    test.addParameter("Browser", Brow);

	    XmlTest testOne = new XmlTest(suite);
	    testOne.setName("Browser Two");
	    testOne.addParameter("Browser", Brows);

	    List<XmlTest> tests = new ArrayList<XmlTest>();
	    tests.add(test);
	    tests.add(testOne);
	    // Class
	    List<XmlClass> classes = new ArrayList<XmlClass>();
	    classes.add(new XmlClass("Grid.CheckGridOne"));
	    test.setXmlClasses(classes);
	    testOne.setXmlClasses(classes);
	    suite.setTests(tests);
	    // Suite
	    List<XmlSuite> suites = new ArrayList<XmlSuite>();
	    suites.add(suite);
	    TestNG tng = new TestNG();
	    tng.setXmlSuites(suites);
	    try {
	        // Running the Suite file.
	        tng.run();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 * @code = To launch the Grid Hub and Nodes
	 */
	public static void gridHubLaunching() throws IOException,
	        InterruptedException {
	    // Launching nodes for each browser.
	    String[] hub = new String[] { "C:\\Windows\\System32\\cmd.exe", "/c",
	            "Start", "Grid-BatchFiles\\hub.bat" };
	    String[] firefox = new String[] { "C:\\Windows\\System32\\cmd.exe",
	            "/c", "Start", "Grid-BatchFiles\\firefox.bat" };
	    String[] chrome = new String[] { "C:\\Windows\\System32\\cmd.exe",
	            "/c", "Start", "Grid-BatchFiles\\chrome.bat" };
	    String[] ie = new String[] { "C:\\Windows\\System32\\cmd.exe", "/c",
	            "Start", "Grid-BatchFiles\\IE.bat" };
	    Runtime.getRuntime().exec(hub);
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec(firefox);
	    Runtime.getRuntime().exec(chrome);
	    Runtime.getRuntime().exec(ie);
	}
}
