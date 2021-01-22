import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement4 {
	
	ChromeDriver driver;
	
	public WebDriver invokedriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
      WebDriver driver=new ChromeDriver();  
      driver.navigate().to("https://www.ebay.com/");  
      driver.manage().window().maximize();
     return driver;
     System.out.println("Chnage");
     
	}
	
	public void search(String product, WebDriver driver) {
		driver.findElement(By.id("gh-ac")).sendKeys(product);	
		
		Select drpdown = new Select(driver.findElement(By.id("gh-cat")));
		//drpdown.deselectByVisibleText("Cell Phones & Accessories");
		drpdown.selectByValue("15032");
		driver.findElement(By.id("gh-btn")).click();
        String result = driver.findElement(By.className("s-item__title")).getText();
		
		System.out.println("Result :: "+ result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Assignement4 ass = new Assignement4();
      WebDriver driver1 = ass.invokedriver();
      ass.search("Apple Watches", driver1);
	}

}
