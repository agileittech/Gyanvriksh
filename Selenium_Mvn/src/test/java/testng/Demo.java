package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Demo {
@Test(priority = 2 ,dependsOnMethods = "findelement")
public void openurl(){
	System.out.println("This is my 1st line");
	Assert.assertEquals("Expected", "Actual");
	System.out.println("This is my 2nd line");
	System.out.println("This is my 3rd line");
}
@Test(priority = 1)
public void findelement() {
	System.out.println("This is line 1");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("Expected","Actual");

	System.out.println("This is line 2");
	System.out.println("This is line 3");
	sa.assertAll();
	
}
@Test(priority = 3)
public void test3() {
	System.out.println("This is testcase 3");
}
@BeforeTest
public void precondition() {
	System.out.println("this is a precondition");
}
@AfterTest
public void postcondition() {
	System.out.println("this is a postcondition");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is a beforesuite");
}
@AfterSuite 
public void aftersuite() {
	System.out.println("This is a aftersuite");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from afterclass");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from beforemethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from aftermethod");
}
}
