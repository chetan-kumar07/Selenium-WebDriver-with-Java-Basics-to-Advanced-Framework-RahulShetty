import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_RahulShetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("okayBtn"))));
		driver.findElement(By.id("okayBtn")).click();
		WebElement Dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select option=new Select(Dropdown);
		option.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		addItems(driver);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();	
	//	driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		System.out.println("Completed");
	}
		
	public static void addItems(WebDriver driver) {
		List<WebElement> phones=driver.findElements(By.cssSelector("button.btn.btn-info"));
		for(int i=0;i<phones.size();i++) {
			phones.get(i).click();
		}
		
		
	}
}
