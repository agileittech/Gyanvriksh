package phptravels;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excelhandling.Excelreader;



public class Loginpage {
	ChromeDriver c;
@BeforeTest
public void preconditions() {
	System.setProperty("webdriver.chrome.driver","C:\\Gyanvrkishabatch\\Selenium\\chromedriver.exe");
	c = new ChromeDriver(); //opens chrome browser
	c.manage().window().maximize();
	}
@Test(priority =1)
public void openurl() {
	c.get("https://www.phptravels.net/login");
	String Expected = "Login - PHPTRAVEL"; 
	String Actual = c.getTitle();
	Assert.assertEquals(Expected, Actual);
}
@Test(priority =2 , dependsOnMethods = "openurl")
public void login() throws IOException {
	String Expected = "Dashboard - PHPTRAVEL";
	Excelreader reader = new Excelreader();
	String username =reader.excelreading("C:\\Filehandling\\ExcelWriter.xlsx", "Mysheet1", 1, 0);
	String password =reader.excelreading("C:\\Filehandling\\ExcelWriter.xlsx", "Mysheet1", 1, 1);
	c.findElement(By.name("email")).sendKeys(username);
	c.findElement(By.name("password")).sendKeys(password);
	c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
	c.findElement(By.xpath("//*[@id=\"cookie_stop\"]")).click();
	c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(c.getTitle(), Expected);
}
@AfterTest
public void postconditions() {
	c.close();
}
}
