import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment3 {
	
	public void Link() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
      WebDriver driver=new ChromeDriver();  
      driver.navigate().to("http://www.flipkart.com");  
      driver.manage().window().maximize();
      List<WebElement> allLink = driver.findElements(By.tagName("a"));
      System.out.println("Number of links on a page :: "+allLink.size());
      

	
	for(WebElement link:allLink){
		System.out.println("Link Text :: "+ link.getText());
		System.out.println("Link URL  :: "+ link.getAttribute("href"));
	}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    

     Assignment3 ass = new Assignment3();
     ass.Link();
	}

}
