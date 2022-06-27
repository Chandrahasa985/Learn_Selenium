package ChromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class d {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		//Select ddm1 = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		//Select ddm2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		//Select ddm3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		//ddm1.selectByIndex(3);	
		
		driver.findElement(By.xpath("//option[text()='SQL']")).click();
		
	}

}
