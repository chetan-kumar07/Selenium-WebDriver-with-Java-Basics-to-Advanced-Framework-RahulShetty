package Section12;
//perform scrolling with in table and window

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//		//   //td[4]		xpath 
//		// td:nth-child(4) css-selector
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			sum+=Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum); 
		
		
		
		// converting string into integer
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim()); 
		
		Assert.assertEquals(sum, total);
		System.out.println("Test Passed");
		
		
//		List<WebElement> values=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
//		for(int i=0;i<values.size();i++) {
//			System.out.println(values.get(i).getText());
//		}
	}

}
