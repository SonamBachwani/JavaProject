import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
       WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();	
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	    Actions actions = new Actions(driver);
		WebElement a = driver.findElement(By.className("accountInner"));
		actions.moveToElement(a).perform();
		a.click();
		
		driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/login']")).click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.print(size);
		
	    driver.switchTo().frame("iframeLogin");
		
		driver.findElement(By.name("username")).sendKeys("9899435505");
		driver.findElement(By.id("checkUser")).click();
		
	   // driver.close();
		
	}

}
