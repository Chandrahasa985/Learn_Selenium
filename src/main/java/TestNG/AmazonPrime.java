
package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPrime {
	
	
	@Test
	public void sum() throws InterruptedException {
		
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	
	WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	searchbox.sendKeys("amazonprime");
	searchbox.sendKeys(Keys.ENTER);
	
			
	WebElement primevideo = driver.findElement(By.xpath("//h3[text()='Welcome to Prime Video']"));
	primevideo.click();
	
			
	WebElement signin = driver.findElement(By.xpath("//a[@id='pv-nav-sign-in']"));
	signin.click();
	
			
	WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
	username.sendKeys("9666870136");
	username.sendKeys(Keys.ENTER);
	
	
	WebElement password1 = driver.findElement(By.xpath("//input[@type='password']"));
	password1.sendKeys("Reddy@123");
	
	Thread.sleep(5000);
	WebElement submit1 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	submit1.sendKeys(Keys.ENTER);

}
}
