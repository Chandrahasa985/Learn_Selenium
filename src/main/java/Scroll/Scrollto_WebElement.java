package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollto_WebElement {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement Lastelement = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView()", Lastelement);
		Thread.sleep(3000);
		driver.close();
	}

}
