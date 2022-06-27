package ChromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin extends d {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

       driver.get("https://www.google.com/intl/en-GB/gmail/about/");
       driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chandrahasa.045");		
       driver.findElement(By.xpath("//span[text()='Next']")).click();
		

	}

}
