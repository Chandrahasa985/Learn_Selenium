package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RandomCreation {

	

//Test Case 1
	@Test
	public void testcase1() {
		System.out.println("This is Test Case 1");
	}
	@Test	
	public void testcase2() {
		System.out.println("This is Test Case 2");
	}
	@Test
	public void testcase3() {
		System.out.println("This is Test Case 3");
	}
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("This is Before Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is Before Suite");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is After Method");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("This is After Test");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("This is Before Test");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is After Suite");
	}
	

}
