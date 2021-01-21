import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

     Assignment2 ass = new Assignment2();
     ass.invokeurl();
     
	}
	
	public void invokeurl() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");  
          
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
     driver.navigate().to("http://www.fb.com"); 
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     String url = driver.getCurrentUrl();
     System.out.println(url);
    
     if(url.equals("https://www.facebook.com/")) {
    	 System.out.println("PASS");
    	 }
     else
     {
    	 System.out.println("FAIL");
     }
     driver.findElement(By.id("u_0_2")).click();
  
   //driver.findElement(By.xpath("//input[@id='u_w_b']")).sendKeys("gb");
        driver.findElement(By.name("firstname")).sendKeys("testing");
		driver.findElement(By.name("lastname")).sendKeys("done");
		driver.findElement(By.name("reg_email__")).sendKeys("8287885834");
		driver.findElement(By.name("reg_passwd__")).sendKeys("idontknnow55");
		WebElement element =  driver.findElement(By.name("birthday_day"));
		Select select = new Select(element);
		select.selectByValue("25");
		WebElement element2 =  driver.findElement(By.name("birthday_month"));
		Select select2 = new Select(element);
		select2.selectByValue("7");
		WebElement element3 =  driver.findElement(By.name("birthday_year"));
		Select select3 = new Select(element3);
		select3.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		System.out.println("Account Scuccessfully Created");
				
    		
    
     }
	
    
}
