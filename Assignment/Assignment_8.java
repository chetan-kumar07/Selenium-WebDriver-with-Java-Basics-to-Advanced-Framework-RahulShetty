package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ind");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.DOWN);
		//Get the value of the given attribute of the element. Will return the current value, even if this has been modified after the page has been loaded. 
		String str=driver.findElement(By.id("autocomplete")).getAttribute("value");
		System.out.println(str);
	}

}
