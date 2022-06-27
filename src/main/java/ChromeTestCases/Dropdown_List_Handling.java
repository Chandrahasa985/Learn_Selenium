package ChromeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class Dropdown_List_Handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		Select ddm1 = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		Select ddm2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		Select ddm3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		ddm1.selectByIndex(1);	
		ddm2.selectByIndex(1);
		ddm3.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@value='option-2']")).click();
		driver.findElement(By.xpath("//input[@value='option-3']")).click();	
		driver.findElement(By.xpath("//input[@value='purple']")).click();
		
		boolean RBD1 = driver.findElement(By.xpath("//input[@value='cabbage']")).isEnabled();
		
		if(RBD1) {
			driver.findElement(By.xpath("//input[@value='cabbage']")).click();	
		}else {
			driver.findElement(By.xpath("//input[@value='pumpkin']")).click();
		}
		
		Select ddm4 = new Select(driver.findElement(By.id("fruit-selects")));
		
		
		
	}

}
