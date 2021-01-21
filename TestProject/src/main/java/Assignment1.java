import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public void Test(){
		System.setProperty("webdriver.gecko.driver", "D:\\Jars\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		// DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get("http://qatechhub.com/");
		
		String des_title=driver.getTitle();
		System.out.println(des_title);
		String title = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		if(des_title.equals(title))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		//driver.close();
		
		driver.navigate().to("https://www.facebook.com/");
		String newurl = driver.getCurrentUrl();
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 ass = new Assignment1();
		ass.Test();
	}

}
