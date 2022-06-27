package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailAccountCreation {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		
		
		driver.manage().window().maximize();
	    WebElement bb = driver.findElement(By.xpath("//span[text()='Create account']"));	
	   // bb.click();
	    
	   Actions act = new Actions(driver);
	   act.keyDown(Keys.CONTROL).build().perform();
	   act.keyDown(Keys.getKeyFromUnicode((char) 5));
	   
	   //act.sendKeys("A").click().build().perform();
	    
	 //   String s = Keys.chord(Keys.CONTROL, "d");
		//bb.sendKeys(Keys.CONTROL);
		//bb.sendKeys("D");
		
	    
		/*driver.findElement(By.xpath("//span[text()='For myself']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Chandrahasa");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Reddy");
		WebElement Username = driver.findElement(By.xpath("//input[@name='Username']"));
		Username.sendKeys("Chandrahasar6");
		Username.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Venkata@123");	
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Venkata@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9666870136");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(25000);
		
		driver.findElement(By.xpath("//span[text()='Verify']")).click();
		
		driver.findElement(By.xpath("//input[@dir='ltr']")).sendKeys("chandrahas985@gmail.com");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(6);
		driver.findElement(By.xpath("//input[@name='day']")).sendKeys("19");
		driver.findElement(By.xpath("//input[@name='year']']")).sendKeys("1996");
		
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByIndex(1);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Yes, I’m in']")).click();
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
		
		
		boolean Homebutton = driver.findElement(By.xpath("//img[@class='gb_sc']")).isDisplayed();
		
		if(Homebutton) {
			System.out.println("LogIn Was Successful");
		}else {
			System.out.println("LogIn Was Failed");	
		}
		
		driver.quit();*/
	}}
		
		
		
		
	


