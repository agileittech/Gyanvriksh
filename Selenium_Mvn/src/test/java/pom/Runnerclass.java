package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Gyanvrkishabatch\\Selenium\\chromedriver.exe");
		WebDriver c = new ChromeDriver(); //opens chrome browser
		c.manage().window().maximize();
		c.get("https://www.phptravels.net/login");
		Loginpage lp = new Loginpage(c);
		lp.username();
		lp.password();
		lp.remember();
		lp.cookiestop();
		lp.clickbutton();
	}

}
