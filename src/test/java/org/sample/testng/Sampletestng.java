package org.sample.testng;

import org.testng.TestNGException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sampletestng {

@BeforeMethod(groups="regression")
public void SampleRegistrationsanity() {
	System.out.println("Enter the Sample Registration Details sanity");
	int i=9/0;
	}


@Test(dependsOnGroups= { "regression" })
public void HRRegistration() {
	System.out.println("Enter the HR Registration Details ");
	}

@AfterMethod(groups="regression")
public void AfterRegistrationregression() {
	System.out.println("Enter the After Registration Details regression");
	}
}
