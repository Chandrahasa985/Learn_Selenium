package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yatra_Signup {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com");
		//My Account
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		//SignUp Botton
		WebElement Text = driver.findElement(By.cssSelector("#SignUpBtn"));
		
		System.out.println(Text);
	}

}
