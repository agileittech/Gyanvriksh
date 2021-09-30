package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver c;
	public Loginpage(WebDriver c) {
		this.c = c;
	}
	
	
		public void username() {
		c.findElement(By.name("email")).sendKeys("user@phptravels.com");
		}
		public void password() {
		c.findElement(By.name("password")).sendKeys("demouser");	
		}
		public void remember() {
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
		}
		public void cookiestop() {
		c.findElement(By.xpath("//*[@id=\"cookie_stop\"]")).click();
		}
		public void clickbutton() {
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		}
}
