import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");  // URL in the browser
		//a[@value='MAA']   -> xpath for chennai
		//a[@value='BLR']
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
		driver.findElement(By.xpath("//a[@value='BLR']")).click();	// Select value from dropdown with the help of xpath

		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();  // parent-child xpath
		System.out.println("Executed");
	}
}
