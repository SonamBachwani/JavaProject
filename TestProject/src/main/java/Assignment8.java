import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Jars\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		// DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("Sonam03bachwani@gmail.com");

        WebDriverWait wait=new WebDriverWait(driver, 20);      
        driver.findElement(By.id("identifierNext")).click(); 
		
	}
	
}
