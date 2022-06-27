package Selenium_Topics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Windows {

	public static void main(String[] args) throws InterruptedException {
		
				
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//Implicit wait - Static
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on new tab
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='windowButton']")));

		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		String parentWindow = driver.getWindowHandle();
		
		Set<String> childWindow = driver.getWindowHandles();
	
		//Iterator
		Iterator<String> iterator = childWindow.iterator();
		
		while(iterator.hasNext()) {
		
			String childWindowOne = iterator.next();
			
			if(!parentWindow.equals(childWindowOne)) {
				
				driver.switchTo().window(childWindowOne);
				WebElement head = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
				if(head.isDisplayed())
				{
					System.out.println("Moved to next window");
					
					driver.close();
				}
				else
				{
					System.out.println("Not moved to next window");
					driver.close();
				}
				
				
			}
		}
		
		Thread.sleep(10000);
		
		driver.switchTo().window(parentWindow);
		
		
		
		
		
		driver.quit();
		
		

		
	}

	}


