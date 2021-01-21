import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
       WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();	
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("9899435505");
	}

}
