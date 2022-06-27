package tables;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Letcode {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript(scrollBy(0,1000), args);

		
	}

}
