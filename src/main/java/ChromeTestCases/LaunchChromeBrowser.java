package ChromeTestCases;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChromeBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		
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
		
			
		
		boolean errormessage = driver.findElement(By.xpath("//span[@class='a-list-item']")).isDisplayed();
		
		
		if(errormessage) {
		System.out.println("LogIn Was failed with invalid credentials");
		}else {
		System.out.println("LogIn Was Successful even with invalid credentials");	
		}
		
		
		WebElement password2 = driver.findElement(By.xpath("//input[@type='password']"));
		
		password2.sendKeys("Reddy@123");		
		
		Thread.sleep(5000);		
		WebElement submit2 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit2.sendKeys(Keys.ENTER);
				
		boolean brandlogo = driver.findElement(By.xpath("//div[@class='pv-brand-logo']")).isDisplayed();
		
				
		if(brandlogo) {
			System.out.println("LogIn Was Successful");
		}else {
			System.out.println("LogIn Was Failed");	
		}
		
		driver.quit();	
	}

}
