package com.bfm.suit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.remote.SuiteSlave;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class suit1 {
	
	public void suitTest1(){
		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		suite.setParallel("classes");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.bfm.tests.LoginSuccessTest"));
		classes.add(new XmlClass("com.bfm.tests.BankBondInstrSubmit"));
		test.setXmlClasses(classes) ;
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
	}
	
	public static void main(String args[]){
		suit1 s1 = new suit1();
		s1.suitTest1();
	}
}
