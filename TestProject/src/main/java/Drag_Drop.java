import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
       WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();	
		driver.get("http://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions A = new Actions(driver);
		A.dragAndDrop(from, to).perform();
		
		String text= to.getText();
		System.out.println(text);
		
		
		driver.close();
		
	}

}
