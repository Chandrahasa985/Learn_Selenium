package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	static WebDriver driver;
	
	@Test
	public void log1() throws InterruptedException {
		
		//System.out.println("Log in by Email");
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbox.sendKeys("amazonprime");
		searchbox.sendKeys(Keys.ENTER);
		}
	
	@Test
	public void log2() throws InterruptedException {
		
		//System.out.println("Log in by Phone Number");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbox.sendKeys("facebook");
		searchbox.sendKeys(Keys.ENTER);
		
		}

	@Test
	public void log3() throws InterruptedException {
		
		//System.out.println("Log in by facebook");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbox.sendKeys("flipkart");
		searchbox.sendKeys(Keys.ENTER);
		}
	@AfterMethod
	void closing() {
		
		driver.quit();
	}
}
