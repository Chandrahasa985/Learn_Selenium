package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollto_Bottom_of_thepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		

		jse.executeScript("window.scrollBy(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
