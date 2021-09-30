package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepfile {
	ChromeDriver c;
@Before
public void precondition() {
	System.setProperty("webdriver.chrome.driver","C:\\Gyanvrkishabatch\\Selenium\\chromedriver.exe");
	c = new ChromeDriver(); //opens chrome browser
	c.manage().window().maximize();
}
@Given("I want to login into url of phptravels")
public void login_to_url() {
	c.get("https://www.phptravels.net/login");
	}
@When("I enter username")
public void enterusername() {
	c.findElement(By.name("email")).sendKeys("user@phptravels.com");
}
@And("I enter password")
public void enterpassword() {
	c.findElement(By.name("password")).sendKeys("demouser");
}
@And("I click on login button")
public void loginbutton() {
	c.findElement(By.xpath("//*[@id=\"cookie_stop\"]")).click();
	c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
}
@Then("I should see the dashboard of the user in the webpage")
public void dashboardpage() {
	String Expected = "Dashboard - PHPTRAVELS";
	Assert.assertEquals(c.getTitle(), Expected);
}
@After
public void closebrowser() {
	c.close();
}
}
