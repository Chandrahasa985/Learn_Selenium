package FirefoxTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
